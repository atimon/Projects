
public class TreeTest {
  public static void main(String[] args){
    StdDraw.setCanvasSize(250, 500);
    StdDraw.setPenRadius(0.005);
    double size = 1;
    double height = 1;
    for (int i = 0; i < 5; i++) {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        size = size / 2;
        int howmany = (int)(1/size);
        StdDraw.line(size, height, size, (height-(0.1/(i+1))));
        if (i>0) {
            StdDraw.line((1-size), height, (1-size), (height-(0.1/(i+1))));
            StdDraw.line(size, height, (size+(2*size)), height);
        };
        if (i>1) {
            StdDraw.line((0.5-size), height, (0.5-size), (height-(0.1/(i+1))));
            StdDraw.line((0.5+size), height, (0.5+size), (height-(0.1/(i+1))));
            StdDraw.line((1-(size*3)), height, (1-size), height);
        };
        if (i>2) {
            StdDraw.line((0.25-size), height, (0.25-size), (height-(0.1/(i+1))));
            StdDraw.line((0.25+size), height, (0.25+size), (height-(0.1/(i+1))));
            StdDraw.line((0.75+size), height, (0.75+size), (height-(0.1/(i+1))));
            StdDraw.line((0.75-size), height, (0.75-size), (height-(0.1/(i+1))));
            StdDraw.line((0.5-size), height, (0.5-(size*3)), height);
            StdDraw.line((0.5+size), height, (0.5+(size*3)), height);
        }
        if (i>3) {
            StdDraw.line((0.125-size), height, (0.125-size), (height-(0.1/(i+1))));
            StdDraw.line((0.125+size), height, (0.125+size), (height-(0.1/(i+1))));
            StdDraw.line((0.875+size), height, (0.875+size), (height-(0.1/(i+1))));
            StdDraw.line((0.875-size), height, (0.875-size), (height-(0.1/(i+1))));
            StdDraw.line((0.625-size), height, (0.625-size), (height-(0.1/(i+1))));
            StdDraw.line((0.625+size), height, (0.625+size), (height-(0.1/(i+1))));
            StdDraw.line((0.375+size), height, (0.375+size), (height-(0.1/(i+1))));
            StdDraw.line((0.375-size), height, (0.375-size), (height-(0.1/(i+1))));
            StdDraw.line((0.25-size), height, (0.25-(size*3)), height);
            StdDraw.line((0.25+size), height, (0.25+(size*3)), height);
            StdDraw.line((0.75-size), height, (0.75-(size*3)), height);
            StdDraw.line((0.75+size), height, (0.75+(size*3)), height);
            StdDraw.setPenColor(StdDraw.GREEN);
        }
    height = height - (0.1/(i+1));
    }
  }
}
