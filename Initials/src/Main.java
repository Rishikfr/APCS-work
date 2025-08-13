import kareltherobot.*;

public class Main implements Directions{
  public static void turnRight(Robot r) {
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
}
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(EastVal);
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,8,West,100);
    // examples of commands you can invoke on a Robot
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    turnRight(r);
    r.move();
    r.move();
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    turnRight(r);
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    turnRight(r);
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    turnRight(r);
    r.move();
	  r.putBeeper();
    r.turnLeft();
    r.move();
	  r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
	  r.putBeeper();
    r.move();
    r.move();
    r.move();
    r.move();
    r.turnLeft();
    r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
	  r.putBeeper();
    turnRight(r);
    r.move();
    r.move();
    r.putBeeper();
    turnRight(r);
    r.move();
    turnRight(r);
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.move();
    turnRight(r);
    r.move();
    r.putBeeper();
    r.move();
    r.move();
    r.move();
    r.move();
    turnRight(r);
  }
}