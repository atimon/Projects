import java.util.Scanner;

public class TreeTest3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StdDraw.setCanvasSize(1750, 500);
    StdDraw.setPenRadius(0.005);
    int branchcounter = 0;
    int backtrack = 0;
    double totalheight = 0.1;
    double stopline = 1-totalheight;
    StdDraw.line(0.5, 1, 0.5, stopline);
    System.out.println("Do you want to go forwards (f) or backwards (b)?");
    char decision = sc.next().charAt(0);
    while (decision != 'x') {
      if (decision == 'f') {
        stopline = forwards(branchcounter, stopline, totalheight);
        branchcounter++;
      }
      else if (decision == 'b') {backwards();}
      else {System.out.println("Please choose f or b");}
      System.out.println("Do you want to go forwards (f) or backwards (b)?");
      decision = sc.next().charAt(0);
    }
  }
  public static double forwards(int brch, double stpln, double ttlh) {
    double stopline1 = stpln;
    double stopline2 = stpln - ttlh;
    double ratio = Math.pow(2, -(brch+2));
    StdDraw.line((1-ratio), stopline1, (1-ratio), stopline2);
    return stopline2;
  }
  public static void backwards() {
    // TODO: implement
  }
}
