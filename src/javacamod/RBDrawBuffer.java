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
    if (drawArgs[currentSize] == null) drawArgs[currentSize] = new Object[4];
    drawArgs[currentSize][0] = args[0];
    drawArgs[currentSize][1] = args[1];
    drawArgs[currentSize][2] = args[2];
    drawArgs[currentSize][3] = args[3];
    currentSize++;
  }
}
