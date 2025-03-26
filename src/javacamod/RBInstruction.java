package javacamod;

public class RBInstruction {

  public String instruction;
  public String subInstruction;

  public String[] args = {};

  public String error = "";

  // instructions with subinstructions
  public static String[] complexInstructions = {"DRW","CON","OPR"};
  public static String[] validInstructions = {"DRW","CON","OPR","JMP","RST","LBL","RTN"};
  
  public RBInstruction(String line) {
    if (line.length() < 3) {
      error = "NO INSTRUCTION FOUND";
      return;
    }
    instruction = line.substring(0,3).toUpperCase();
    boolean isInvalidInstruction = true;
    for (String inst : validInstructions) {
      if (instruction.equals(inst)) {
        isInvalidInstruction = false;
        break;
      }
    }
    if (isInvalidInstruction) {
      error = "INVALID INSTRUCTION";
      return;
    }
    boolean hasSubInst = hasSubInstruction(instruction);
    if (line.length() < 7 && hasSubInst) {
      error = "NO SUBINSTRUCTION FOUND";
      return;
    }
    subInstruction = hasSubInst ? line.substring (4,7).toUpperCase() : "";
    if (line.length() >= (hasSubInst ? 8 : 4)) {
      args = line.substring(hasSubInst ? 8 : 4).split("(?<!\\\\),\s*");
      for (int i = 0; i < args.length; i++) {
      	args[i] = args[i].replace("\\,",",");
      }
    }
  }

  public static boolean hasSubInstruction(String instruction){
    for (String inst : complexInstructions) {
      if (instruction.equals(inst)) return true;
    }
    return false;
  }

  public static RBInstruction[] parse(String code) {
    String[] lines = code.split("(?<!\\\\);\s*");
    RBInstruction[] output = new RBInstruction[lines.length];
    for (int i = 0; i < lines.length; i++) {
       output[i] = new RBInstruction(lines[i]);
    }
    return output;
  }
}
