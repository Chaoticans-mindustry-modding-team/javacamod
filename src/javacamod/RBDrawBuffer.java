public class RBDrawBuffer {
  
  public String[] drawType;
  public Object[][] drawArgs;
  
  public RBDrawBuffer(int limit) {
    drawType = new String[limit];
    drawArgs = new Object[][limit];
  }
}
