package javacamod;

import java.math.BigDecimal;
import java.math.RoundingMode;

import arc.math.geom.*;
import arc.graphics.Color;

import javacamod.*;

public class RBExecutor {

  public Object[] memory = new Object[256];
  public int counter = 0;
  
  public RBDrawBuffer buffer;
  public int runLengthLimit;

  public BigDecimal falseN = new BigDecimal(0);
  public BigDecimal trueN = new BigDecimal(1);

  public RBExecutor(RBDrawBuffer bufferIn, int runLengthLimitIn) {
    buffer = bufferIn;
    runLengthLimit = runLengthLimitIn;
  }

  public int parsePointer(String pointer) {
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
      if (!instructions[i].error.equals("")) return instructions[i].error + " -- INSTRUCTION " + i;
    }

    // actually run the code
    counter = 0;
    int runLength = 0;
    Object interm0;
    while (counter < instructions.length) {
      try {
        String subInstruction = instructions[counter].subInstruction;
        String[] args = instructions[counter].args;
        switch (instructions[counter].instruction) {
          case "DRW":
            switch (subInstruction) {
              case "CLR":
                buffer.currentSize = 0;
              ////
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
                  interm0 = m;
                }
                if (interm0 instanceof Vector m) {
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof Vector n) m.add(n);
                  }
                  interm0 = m;
                }
                if (interm0 instanceof Color m) {
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof Color n) m.add(n);
                  }
                  interm0 = m;
                }
                if (interm0 instanceof String m) {
                  for (int i = 2; i < args.length; i++) {
                    m += getMem(parsePointer(args[i])).toString();
                  }
                  interm0 = m;
                }
                setMem(parsePointer(args[0]), interm0);
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
                  for (int i = 2; i < args.length; i++) {
                    if (getMem(parsePointer(args[i])) instanceof Vector n) m.scl(n);
                    if (getMem(parsePointer(args[i])) instanceof BigDecimal n) m.scl(n.floatValue());
                  }
                  interm0 = m;
                }
                if (interm0 instanceof Color m) {
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
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) interm0 = m.subtract(n);
                if (interm0 instanceof Vector m && getMem(parsePointer(args[2])) instanceof Vector n) interm0 = m.sub(n);
                if (interm0 instanceof Color m && getMem(parsePointer(args[2])) instanceof Color n) interm0 = m.sub(n);
                setMem(parsePointer(args[0]), interm0);
                break;
              case "DIV":
                interm0 = getMem(parsePointer(args[1]));
                try {
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) interm0 = m.divide(n,RoundingMode.HALF_UP);
                if (interm0 instanceof Vector m && getMem(parsePointer(args[2])) instanceof Vector n) interm0 = m.div(n);
                if (interm0 instanceof Vector m && getMem(parsePointer(args[2])) instanceof BigDecimal n) interm0 = m.scl(BigDecimal.ONE.divide(n).floatValue());
                } catch (ArithmeticException e) {}
                setMem(parsePointer(args[0]), interm0);
                break;
              case "NEG":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) interm0 = m.negate();
                if (interm0 instanceof Color m) interm0 = m.inv();
                setMem(parsePointer(args[0]), interm0);
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
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) interm0 = m.abs();
                setMem(parsePointer(args[0]), interm0);
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
                interm0 = getMem(parsePointer(args[1]));
                try {
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) interm0 = m.divideToIntegralValue(n);
                } catch (ArithmeticException e) {}
                setMem(parsePointer(args[0]), interm0);
                break;
              case "MOD":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) {
                  if (n.equals(BigDecimal.ZERO)) {
                    setMem(parsePointer(args[0]), BigDecimal.ZERO);
                    break;
                  }
                  interm0 = m.remainder(n);
                }
                setMem(parsePointer(args[0]), interm0);
                break;
              case "EQL":
                interm0 = getMem(parsePointer(args[1]));
                for (int i = 2; i < args.length; i++) {
                  if (!interm0.equals(getMem(parsePointer(args[i])))) {
                    setMem(parsePointer(args[0]), falseN);
                    break;
                  }
                }
                setMem(parsePointer(args[0]), trueN);
                break;
              case "CMP":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m && getMem(parsePointer(args[2])) instanceof BigDecimal n) interm0 = new BigDecimal(m.compareTo(n));
                setMem(parsePointer(args[0]), interm0);
                break;
              case "SGN":
                interm0 = getMem(parsePointer(args[1]));
                if (interm0 instanceof BigDecimal m) interm0 = new BigDecimal(m.signum());
                setMem(parsePointer(args[0]), interm0);
                break;
            }
            break;
          case "JMP":
            if (getMem(parsePointer(args[0])) instanceof BigDecimal n) {
              if (args.length == 1 || (args[1].intValue() != 0)) counter = n.intValue();
            }
            break;
          case "RST":
            memory = new Object[256];
            break;
          case "LBL":
            setMem(parsePointer(args[0]), counter);
            break;
          case "RTN":
            if (true) return getMem(parsePointer(args[0])).toString();
            break;
        }
      
        runLength++;
        counter++;
        if (runLength >= runLengthLimit) return "CODE TOO LONG, >" + runLengthLimit + " -- INSTRUCTION " + counter;
      } catch (RuntimeException e) {
        if (e instanceof ArrayIndexOutOfBoundsException) return "NOT ENOUGH ARGUMENTS -- INSTRUCTION " + counter;
        if (e instanceof NumberFormatException) return "BAD NUMBER/POINTER -- INSTRUCTION " + counter;
        return e.getClass().getSimpleName() + " -- INSTRUCTION " + counter;
      }
    }
    return "";
  }
}
