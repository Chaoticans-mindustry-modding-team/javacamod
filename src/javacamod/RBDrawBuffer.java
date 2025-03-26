package javacamod;

public class RBDrawBuffer {
  
  public String[] drawType;
  public Object[][] drawArgs;
  public int currentSize = 0;
  
  public RBDrawBuffer(int limit) {
    drawType = new String[limit];
    drawArgs = new Object[limit][];
  }
}
