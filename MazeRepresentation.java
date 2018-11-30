import java.util.Scanner;

public class MazeRepresentation {
  public static void main(String[] args){
    Scanner sinput = new Scanner(System.in);
    StdDraw.setCanvasSize(500, 500);
    StdDraw.setPenRadius(0.001);
    double coord = 0.03125;
    double size = (1/31f/2);
    for (int i = 1; i<=31; i++) {
      double xcoord = 0.03125 * i;
      StdDraw.filledSquare(xcoord, 0.96875, size);
      StdDraw.filledSquare(xcoord, 0.03125, size);
      StdDraw.filledSquare(0.03125, xcoord, size);
      StdDraw.filledSquare(0.96875, xcoord, size);
    }
    System.out.println("XCoord?");
    int a = sinput.nextInt();
    System.out.println("YCoord?");
    int b = sinput.nextInt();
    StdDraw.setPenColor(StdDraw.GREEN);
    StdDraw.filledSquare(drawX(a), drawY(b), size);
    StdDraw.setPenColor(StdDraw.BLACK);
  }
  public static double drawX(int coordx) {
    double tinyx = (coordx+1)*0.03125;
    return tinyx;
  }
  public static double drawY(int coordy) {
    double tinyy = 1-(coordy+1)*0.03125;
    return tinyy;
  }
}
