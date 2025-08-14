import java.util.Scanner;
import kareltherobot.*;
import java.util.Scanner;

public class Main implements Directions{
  public static void turnRight(Robot r) {
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
}

  public static void Diamondgo(Robot r, int jj) {
    for (int i = 0; i < jj; i++) {
      r.putBeeper();
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
      r.turnLeft();
      r.putBeeper();
    }
  }
  public static void main(String[] args) {
    World.setVisible(true);
    World.setDelay(0);
    System.out.println("Enter the size of the grid (x enter, then y enter):");
    Scanner bigx = new Scanner(System.in);
    int xGRID = bigx.nextInt();
    Scanner bigy = new Scanner(System.in);
    int yGRID = bigy.nextInt();
    World.setSize(xGRID, yGRID);
    Robot r = new Robot(2,yGRID/2,South,2003203492);
    Scanner z = new Scanner(System.in);
    int y = z.nextInt();
    //gets input for how big to make the diamond
    System.out.println("how big do you want the diamond to be? (half the x value then -1)");
    for (int x = 0; x < 30; x++) {
      turnRight(r);
      Diamondgo(r,y);
      turnRight(r);
      Diamondgo(r,y);
      turnRight(r);
      Diamondgo(r,y);
      turnRight(r);
      y=y-1;
      Diamondgo(r,y);
    }
    // examples of commands you can invoke on a Robot
    
  }
}