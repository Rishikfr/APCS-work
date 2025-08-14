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
    World.setSize(50, 50);
    Robot r = new Robot(2,25,South,20000);
    Scanner z = new Scanner(System.in);
    int y = z.nextInt();
    //gets input for how big to make the diamond
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