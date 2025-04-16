package javacamod;

public class RBDrawBuffer {
  
  public String[] drawType;
  public Object[][] drawArgs;
  public int currentSize = 0;
  public int sizeLimit;

  public float[] context = {0,0};
  
  public RBDrawBuffer(int limit) {
    sizeLimit = limit;
    drawType = new String[limit];
    drawArgs = new Object[limit][];
  }

  public void append(String type, Object[] args) {
    if (currentSize >= sizeLimit) return;
    drawType[currentSize] = type;
    drawArgs[currentSize] = args;
    currentSize++;
  }
}
