package javacamod;

import java.math.BigDecimal;
import java.math.RoundingMode;

import arc.math.geom.*;
import arc.graphics.*;
import arc.math.Mathf;
import arc.Core;

import mindustry.Vars;

import javacamod.*;

public class RBExecutor {

  public Object[] memory = new Object[256];
  public int counter = 0;
  
  public Color[] colorStack = new Color[4];
  public byte colorStackPos = 0;
  
  public RBDrawBuffer buffer;
  public int runLengthLimit;
  public int configColor = 0xffffff_ff;

	public String lastIndex;

  public BigDecimal tau = new BigDecimal(Mathf.PI2);
  public BigDecimal pi = new BigDecimal(Mathf.PI);
  public BigDecimal e = new BigDecimal(Mathf.E);
  public BigDecimal r2d = new BigDecimal(Mathf.doubleDegRad);
  public BigDecimal d2r = new BigDecimal(Mathf.doubleRadDeg);
  public BigDecimal sr2 = new BigDecimal(Mathf.sqrt2);
  public BigDecimal sr3 = new BigDecimal(Mathf.sqrt3);
  public BigDecimal BD360 = new BigDecimal(360);
  public BigDecimal BD90 = new BigDecimal(90);
  public BigDecimal BDN90 = new BigDecimal(-90);

	public pos = new Vec2(0,0);

  public RBExecutor(RBDrawBuffer bufferIn, int runLengthLimitIn) {
    buffer = bufferIn;
    runLengthLimit = runLengthLimitIn;
  }

  public int parsePointer(String pointer) {
	  lastIndex = pointer;
    if (pointer.length() > 2) throw new NumberFormatException("RBExecutor pointer too long");
    if (pointer.equals("PC")) return -1;
    if (pointer.equals("NL")) return -2;
    return Integer.parseInt(pointer, 16);
  }

  public void setMem(int index, Object value) {
    if (index == -2) return;
    if (index == -1) {
      if (value instanceof Number n) {
        counter = n.intValue();
      }
      return;
    }
    memory[index] = value;
  }

  public Object getMem(int index) {
    if (index < 0) return new BigDecimal(counter);
    return memory[index];
  }

  public String run(RBInstruction[] instructions) {
    // check for compiler errors
    for (int i = 0; i < instructions.length; i++) {
      if (!instructions[i].error.equals("")) return "[#ff004]" + instructions[i].error + " -- INSTRUCTION " + i + "[]";
	    if (instructions[i].instruction == "LBL") setMem(parsePointer(instructions[i].args[0]),i);
    }

    // actually run the code
	  pos.x = buffer.context[0];
	  pos.y = buffer.context[1];

    counter = 0;
    int runLength = 0;
    Object interm0 = 0;
    Object[] intermArr;
    while (counter < instructions.length) {
      try {
        String subInstruction = instructions[counter].subInstruction;
        String[] args = instructions[counter].args;
        switch (instructions[counter].instruction) {
          case "DRW":
            if (buffer.currentSize >= buffer.sizeLimit) break;
            switch (subInstruction) {
              case "CLR":
                buffer.currentSize = 0;
                break;
              case "COL":
                if (getMem(parsePointer(args[0])) instanceof Color n) {
                  if (colorStackPos < colorStack.length) {
                    colorStack[colorStackPos++] = n;
                  } else {
                    colorStack[0] = colorStack[1];
                    colorStack[1] = colorStack[2];
                    colorStack[2] = colorStack[3];
                    colorStack[3] = n;
                  }
                  intermArr = new Object[1];
                  intermArr[0] = n;
                  buffer.append("color", intermArr);
                }
                break;
              case "SRK":
                if (getMem(parsePointer(args[0])) instanceof BigDecimal n) {
                  intermArr = new Object[1];
                  intermArr[0] = n.floatValue();
                  buffer.append("stroke", intermArr);
                }
                break;
              case "LNE":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[0])) instanceof Vec2 m) {
                  intermArr = new Object[2];
                  intermArr[0] = n;
                  intermArr[1] = m;
                  buffer.append("line", intermArr);
                }
                break;
              case "CCL":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof BigDecimal m) {
                  intermArr = new Object[2];
                  intermArr[0] = n;
                  intermArr[1] = m.floatValue();
                  buffer.append("circle", intermArr);
                }
                break;
              case "LCL":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof BigDecimal m) {
                  intermArr = new Object[2];
                  intermArr[0] = n;
                  intermArr[1] = m.floatValue();
                  buffer.append("linecircle", intermArr);
                }
                break;
              case "RCT":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof Vec2 m) {
                  if (args.length >= 3) interm0 = getMem(parsePointer(args[2]));
                  intermArr = new Object[(args.length >= 3 && interm0 instanceof BigDecimal) ? 3 : 2];
                  intermArr[0] = n;
                  intermArr[1] = m;
                  if (args.length >= 3 && interm0 instanceof BigDecimal r) intermArr[2] = r.floatValue();
                  buffer.append(args.length < 3 ? "rect" : "rectR", intermArr);
                }
                break;
              case "RPG":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal o) {
                  if (args.length >= 4) interm0 = getMem(parsePointer(args[3]));
                  intermArr = new Object[(args.length < 4 && interm0 instanceof BigDecimal) ? 3 : 4];
                  intermArr[0] = n;
                  intermArr[1] = m.intValue();
                  intermArr[2] = o.floatValue();
                  if (args.length >= 4 && interm0 instanceof BigDecimal r) intermArr[3] = r.floatValue();
                  buffer.append(args.length < 3 ? "regpoly" : "regpolyR", intermArr);
                }
                break;
              case "RLP":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal o) {
                  if (args.length >= 4) interm0 = getMem(parsePointer(args[3]));
                  intermArr = new Object[(args.length < 4 && interm0 instanceof BigDecimal) ? 3 : 4];
                  intermArr[0] = n;
                  intermArr[1] = m.intValue();
                  intermArr[2] = o.floatValue();
                  if (args.length >= 4 && interm0 instanceof BigDecimal r) intermArr[3] = r.floatValue();
                  buffer.append(args.length < 3 ? "reglinepoly" : "reglinepolyR", intermArr);
                }
                break;
              case "LRC":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof Vec2 m) {
                  intermArr = new Object[2];
                  intermArr[0] = n;
                  intermArr[1] = m;
                  buffer.append("linerect", intermArr);
                }
                break;
              case "TRI":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof Vec2 m && getMem(parsePointer(args[2])) instanceof Vec2 o) {
                  intermArr = new Object[3];
                  intermArr[0] = n;
                  intermArr[1] = m;
                  intermArr[2] = o;
                  buffer.append("tri", intermArr);
                }
                break;
              case "QAD":
                if (getMem(parsePointer(args[0])) instanceof Vec2 n && getMem(parsePointer(args[1])) instanceof Vec2 m && getMem(parsePointer(args[2])) instanceof Vec2 o && getMem(parsePointer(args[3])) instanceof Vec2 p) {
                  intermArr = new Object[4];
                  intermArr[0] = n;
                  intermArr[1] = m;
                  intermArr[2] = o;
                  intermArr[3] = p;
                  buffer.append("quad", intermArr);
                }
                break;
              case "IMG":
								if (args.length == 0) {
									intermArr = new Object[1];
									intermArr[0] = "";
									buffer.append("setregion", intermArr);
									break;
								}
                if (getMem(parsePointer(args[0])) instanceof String n) {
                  intermArr = new Object[1];
                  intermArr[0] = n;
                  buffer.append("setregion", intermArr);
                }
                break;
              case "TXT":
                if (getMem(parsePointer(args[1])) instanceof Vec2 p && getMem(parsePointer(args[2])) instanceof BigDecimal s) {
                  intermArr = new Object[3];
                  intermArr[0] = getMem(parsePointer(args[0])).toString();
                  intermArr[1] = p;
                  intermArr[2] = s.floatValue();
                  buffer.append("print", intermArr);
                }
                break;
            }
            break;
          case "CON":
            switch (subInstruction) {
              case "NUM":
                setMem(parsePointer(args[0]), new BigDecimal(args[1]));
                break;
              case "STR":
                setMem(parsePointer(args[0]), args[1]);
                break;
              case "VC2":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal x && getMem(parsePointer(args[2])) instanceof BigDecimal y) setMem(parsePointer(args[0]), new Vec2(x.floatValue(), y.floatValue()));
                break;
              case "VC3":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal x && getMem(parsePointer(args[2])) instanceof BigDecimal y && getMem(parsePointer(args[3])) instanceof BigDecimal z) setMem(parsePointer(args[0]), new Vec3(x.floatValue(), y.floatValue(), z.floatValue()));
                break;
              case "COL":
                if (args.length == 2) {
                  Color nCol = Colors.get(args[1].toUpperCase());
                  if (nCol != null) setMem(parsePointer(args[0]), nCol);
                  setMem(parsePointer(args[0]), Color.valueOf(args[1]));
                  break;
                }
                if (getMem(parsePointer(args[1])) instanceof BigDecimal r && getMem(parsePointer(args[2])) instanceof BigDecimal g && getMem(parsePointer(args[3])) instanceof BigDecimal b && getMem(parsePointer(args[4])) instanceof BigDecimal a) setMem(parsePointer(args[0]), new Color(r.floatValue(), g.floatValue(), b.floatValue(), a.floatValue()));
                break;
            }
            break;
          case "OPR":
            switch (subInstruction) {
              case "SET":
                setMem(parsePointer(args[0]),getMem(parsePointer(args[1])));
                break;
              case "SUM":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) {
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m = m.add(n);
                  }
                  setMem(parsePointer(args[0]), m);
                  break;
                }
                if (interm0 instanceof Vector m) {
                  m = m.cpy();
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof Vector n) m.add(n);
                  }
                  setMem(parsePointer(args[0]), m);
                  break;
                }
                if (interm0 instanceof Color m) {
                  m = m.cpy();
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof Color n) m.add(n);
                  }
                  setMem(parsePointer(args[0]), m);
                  break;
                }
                if (interm0 instanceof String m) {
                  for (int i = 2; i < args.length; i++) {
                    m += getMem(parsePointer(args[i])).toString();
                  }
                  setMem(parsePointer(args[0]), m);
                  break;
                }
                break;
              case "PRD":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) {
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m = m.multiply(n);
                  }
                  interm0 = m;
                }
                if (interm0 instanceof Vector m) {
                  m = m.cpy();
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof Vector n) m.scl(n);
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m.scl(n.floatValue());
                  }
                  interm0 = m;
                }
                if (interm0 instanceof Color m) {
                  m = m.cpy();
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof Color n) m.mul(n);
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m.mul(n.floatValue());
                  }
                  interm0 = m;
                }
                setMem(parsePointer(args[0]), interm0);
                break;
              case "SUB":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) setMem(parsePointer(args[0]), m.subtract(n));
                if (interm0 instanceof Vector m && getMem(parsePointer(args[2])) instanceof Vector n) setMem(parsePointer(args[0]), m.cpy().sub(n));
                if (interm0 instanceof Color m && getMem(parsePointer(args[2])) instanceof Color n) setMem(parsePointer(args[0]), m.cpy().sub(n));
                
                break;
              case "DIV":
                interm0 = getMem(parsePointer(args[1]));
                try {
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) setMem(parsePointer(args[0]), m.divide(n,RoundingMode.HALF_UP));
                if (interm0 instanceof Vector m && getMem(parsePointer(args[2])) instanceof Vector n) setMem(parsePointer(args[0]), m.cpy().div(n));
                if (interm0 instanceof Vector m && getMem(parsePointer(args[2])) instanceof BigDecimal n) setMem(parsePointer(args[0]), m.cpy().scl(BigDecimal.ONE.divide(n).floatValue()));
                } catch (ArithmeticException e) {}
                break;
              case "NEG":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) setMem(parsePointer(args[0]), m.negate());
                if (interm0 instanceof Color m) setMem(parsePointer(args[0]), m.inv());
                
                break;
              case "POW":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) {
                  if (n.signum() == -1) {
                    interm0 = BigDecimal.ONE.divide(m.pow(n.abs().intValue()));
                  } else {
                    interm0 = m.pow(n.abs().intValue());
                  }
                }
                setMem(parsePointer(args[0]), interm0);
                break;
              case "ABS":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m) setMem(parsePointer(args[0]), m.abs());
                break;
              case "TSR":
                if (args.length > 2 && getMem(parsePointer(args[1])) instanceof BigDecimal n && getMem(parsePointer(args[2])) instanceof BigDecimal b) {
                  setMem(parsePointer(args[0]), Long.toString(n.longValue(), b.intValue()));
                  break;
                }
                setMem(parsePointer(args[0]), getMem(parsePointer(args[1])).toString());
                break;
              case "MIN":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) {
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m = m.min(n);
                  }
                  interm0 = m;
                }
                setMem(parsePointer(args[0]), interm0);
                break;
              case "MAX":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) {
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m = m.max(n);
                  }
                  interm0 = m;
                }
                setMem(parsePointer(args[0]), interm0);
                break;
              case "IDV":
                try {
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) setMem(parsePointer(args[0]), m.divideToIntegralValue(n));
                } catch (ArithmeticException e) {}
                break;
              case "MOD":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) {
                  if (n.equals(BigDecimal.ZERO)) {
                    setMem(parsePointer(args[0]), BigDecimal.ZERO);
                    break;
                  }
                  setMem(parsePointer(args[0]), m.remainder(n));
                }
                break;
              case "EQL":
                interm0 = getMem(parsePointer(args[1]));
                for (int i = 2; i < args.length; i++) {
                  if (!interm0.equals(getMem(parsePointer(args[i])))) {
                    setMem(parsePointer(args[0]), BigDecimal.ZERO);
                    break;
                  }
                }
                setMem(parsePointer(args[0]), BigDecimal.ONE);
                break;
              case "CMP":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) setMem(parsePointer(args[0]), new BigDecimal(m.compareTo(n)));
                break;
              case "SGN":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m) setMem(parsePointer(args[0]), new BigDecimal(m.signum()));
                break;
              case "SIN":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m) setMem(parsePointer(args[0]), new BigDecimal(Mathf.sinDeg(m.remainder(BD360).floatValue())));
                break;
              case "COS":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m) setMem(parsePointer(args[0]), new BigDecimal(Mathf.cosDeg(m.remainder(BD360).floatValue())));
                break;
              case "TAN":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m) setMem(parsePointer(args[0]), new BigDecimal(Mathf.sinDeg(m.remainder(BD360).floatValue())));
                break;
              case "ANG":
                if (getMem(parsePointer(args[1])) instanceof Vec2 m) {
                  setMem(parsePointer(args[0]), new BigDecimal(m.angle()));
                  break;
                }
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) {
                  if (BigDecimal.ZERO.equals(m)) {
                    switch (n.signum()) {
                      case 1:
                        setMem(parsePointer(args[0]), BD90);
                        break;
                      case -1:
                        setMem(parsePointer(args[0]), BDN90);
                        break;
                    }
                    break;
                  }
                  setMem(parsePointer(args[0]), new BigDecimal(Math.atan(n.divide(m).doubleValue())));
                  break;
                }
                break;
              case "TRN":
                if (getMem(parsePointer(args[1])) instanceof Vec2 m && getMem(parsePointer(args[2])) instanceof BigDecimal n) setMem(parsePointer(args[0]), m.cpy().rotate(n.remainder(BD360).floatValue()));
                break;
              case "SRT":
                if (getMem(parsePointer(args[1])) instanceof BigDecimal m) setMem(parsePointer(args[0]), new BigDecimal(Math.sqrt(m.doubleValue())));
                break;
              case "LEN":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof Vector m) {
                  setMem(parsePointer(args[0]), new BigDecimal(m.len()));
                  break;
                }
                if (interm0 instanceof String m) {
                  setMem(parsePointer(args[0]), m.length());
                  break;
                }
                if (interm0 instanceof BigDecimal m) {
                  m.pow(2);
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m = m.add(n.pow(2));
                  }
                  setMem(parsePointer(args[0]), new BigDecimal(Math.sqrt(m.doubleValue())));
                }
                break;
              case "LN2":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof Vector m) setMem(parsePointer(args[0]), m.len2());
                if (interm0 instanceof BigDecimal m) {
                  m.pow(2);
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m = m.add(n.pow(2));
                  }
                  setMem(parsePointer(args[0]), m);
                }
                break;
							case "SHF":
								if (getMem(parsePointer(args[1])) instanceof Color n && getMem(parsePointer(args[2])) instanceof BigDecimal m) setMem(parsePointer(args[0]), n.shiftHue(m.remainder(BD360).floatValue()));
								break;
            }
            break;
          case "JMP":
            if (getMem(parsePointer(args[0])) instanceof BigDecimal n) {
              if (args.length == 1 || !getMem(parsePointer(args[1])).equals(BigDecimal.ZERO)) counter = n.intValue();
            }
            break;
          case "RST":
            memory = new Object[256];
            break;
          case "LBL":
            setMem(parsePointer(args[0]), counter);
            break;
          case "RTN":
            return getMem(parsePointer(args[0])).toString();
          case "GET":
            interm0 = getMem(parsePointer(args[0]));
            if (interm0 instanceof Vec2 n) {
              setMem(parsePointer(args[1]), new BigDecimal(n.x));
              setMem(parsePointer(args[2]), new BigDecimal(n.y));
              break;
            }
            if (interm0 instanceof Vec3 n) {
              setMem(parsePointer(args[1]), new BigDecimal(n.x));
              setMem(parsePointer(args[2]), new BigDecimal(n.y));
              setMem(parsePointer(args[3]), new BigDecimal(n.z));
              break;
            }
            if (interm0 instanceof Color n) {
							if (args.length == 4) {
								float[] hsv = new float[3];
								n.toHsv(hsv);
	              setMem(parsePointer(args[1]), new BigDecimal(hsv[0]));
  	            setMem(parsePointer(args[2]), new BigDecimal(hsv[1]));
    	          setMem(parsePointer(args[3]), new BigDecimal(hsv[2]));
							} else {
	              setMem(parsePointer(args[1]), new BigDecimal(n.r));
  	            setMem(parsePointer(args[2]), new BigDecimal(n.g));
    	          setMem(parsePointer(args[3]), new BigDecimal(n.b));
      	        setMem(parsePointer(args[4]), new BigDecimal(n.a));
							}
              break;
            }
            if (interm0 instanceof String n && getMem(parsePointer(args[2])) instanceof BigDecimal m && getMem(parsePointer(args[3])) instanceof BigDecimal o) {
              setMem(parsePointer(args[1]), n.substring(m.intValue(), o.intValue()));
              break;
            }
            break;
          case "VAL":
            switch (subInstruction) {
              case "TCK":
                setMem(parsePointer(args[0]), new BigDecimal(Vars.state.tick));
                break;
              case "CFC":
                setMem(parsePointer(args[0]), new Color(configColor));
                break;
              case "PVC":
                setMem(parsePointer(args[0]), new Color(colorStack[--colorStackPos]));
                break;
							case "CXY":
								setMem(parsePointer(args[0]), Core.camera.position - pos));
								break;
							case "CWH":
								setMem(parsePointer(args[0]), new Vec2(Core.camera.width, Core.camera.height));
								break;
              case "TAU":
                setMem(parsePointer(args[0]), tau);
                break;
              case "PIE":
                setMem(parsePointer(args[0]), pi);
                break;
              case "EUL":
                setMem(parsePointer(args[0]), e);
                break;
              case "D2R":
                setMem(parsePointer(args[0]), d2r);
                break;
              case "R2D":
                setMem(parsePointer(args[0]), r2d);
                break;
              case "SR2":
                setMem(parsePointer(args[0]), sr2);
                break;
              case "SR3":
                setMem(parsePointer(args[0]), sr3);
                break;
            }
            break;
          case "SFX":
	          if (getMem(parsePointer(args[0])) instanceof String n) {
              intermArr = new Object[3];
              intermArr[0] = n;
							if (args.length > 1 && getMem(parsePointer(args[1])) instanceof BigDecimal m) {
								intermArr[1] = Math.min(m.floatValue(),256f);
							} else  {
								intermArr[1] = 1f;
							}
							if (args.length > 2 && getMem(parsePointer(args[2])) instanceof BigDecimal m) {
								intermArr[2] = m.floatValue();
							} else  {
								intermArr[2] = 1f;
							}
              buffer.append("sound", intermArr);
            }
            break;
        }
      
        runLength++;
        counter++;
        if (runLength >= runLengthLimit) return "[#ffc]CODE TOOK TOO LONG, >" + runLengthLimit + " -- INSTRUCTION " + counter + "[]";
      } catch (RuntimeException e) {
        if (e instanceof ArrayIndexOutOfBoundsException) return "[#ff]NOT ENOUGH ARGUMENTS -- INSTRUCTION " + counter + "[]";
        if (e instanceof NumberFormatException) return "[#ff]BAD NUMBER/POINTER -- INSTRUCTION " + counter + "[]";
        if (e instanceof NullPointerException) return "[#ff]VALUE NOT FOUND -- INDEX " + lastIndex + " -- INSTRUCTION " + counter + "[]";
        return "[#ff]" + e.getClass().getSimpleName() + " -- INSTRUCTION " + counter + "[]";
      }
    }
    return "";
  }
}
