package javacamod;

import java.util.BigDecimal;
import arc.math.geom.*;
import arc.graphics.Color;

import javacamod.*;

public class RBExecutor {

  public Object[] memory = new Object[256];
  public int counter = 0;
  
  public RBDrawBuffer buffer;
  public int runLengthLimit;

  public RBExecutor(RBDrawBuffer bufferIn, int runLengthLimitIn) {
    buffer = bufferIn;
    runLengthLimit = runLengthLimitIn;
  }

  public int parsePointer(String pointer) {
    if (pointer.length() > 2) throw new NumberFormatException("RBExecutor pointer too long");
    if (pointer.equals("PC")) return -1;
    return Integer.parseInt(pointer, 16);
  }

  public void setMem(int index, Object value) {
    if (index == -1) {
      if (value instanceof Number n) {
        counter = n.intValue();
      }
      return;
    }
    memory[index] = value;
  }

  public Object getMem(int index) {
    if (index == -1) return new BigDecimal(counter);
    return memory[index];
  }

  public String run(RBInstruction[] instructions) {
    // check for compiler errors
    for (int i = 0; i < instructions.length; i++) {
      if (!instructions[i].error.equals("")) return instructions[i].error + " -- INSTRUCTION " + i;
    }

    // actually run the code
    int runLength = 0;
    while (counter < instructions.length) {
      try {
        String subInstruction = instructions[counter].subInstruction;
        String[] args = instructions[counter].args;
        switch (instructions[counter].instruction) {
          case "DRW":
            switch (subInstruction) {
              case "CLR":
                buffer.currentSize = 0;
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
            break;
          case "JMP":
            break;
          case "RST":
            memory = new Object[256];
            break;
          case "LBL":
            setMem(parsePointer(args[0]), counter);
            break;
        }
      
        runLength++;
        counter++;
      } catch (RuntimeException e) {
        if (e instanceof ArrayIndexOutOfBoundsException) return "NOT ENOUGH ARGUMENTS -- INSTRUCTION " + counter;
        if (e instanceof NumberFormatException) return "BAD NUMBER/POINTER -- INSTRUCTION " + counter;
        return e.getClass().getSimpleName() + " -- INSTRUCTION " + counter;
      }
    }
  }
}
