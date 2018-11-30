
public class TreeTest2 {
  public static void main(String[] args){
    StdDraw.setCanvasSize(500, 300);
    StdDraw.setPenRadius(0.005);
    double size = 1;
    double height = 1;
    for (int i = 0; i < 10; i++) {
        size = size / 2;
        int howmany = (int)(1/size);
        StdDraw.line(size, height, size, (height-(0.1/(i+1))));
        double horizon = 0;
        for (int j = 0; j<Math.pow(2,i); j++) {
            if (horizon == 0) horizon = horizon + size;
            else {horizon = horizon + (size*2);}
            StdDraw.line((1-size), height, (1-size), (height-(0.1/(i+1))));
            StdDraw.line((horizon), height, (horizon), (height-(0.1/(i+1))));
        }

    height = height - (0.1/(i+1));
    }
  }
}
