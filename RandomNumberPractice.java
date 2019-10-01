import java.util.Random;

public class RandomNumberPractice{
  public static void main (String[] args){
    Random rand = new Random();
    System.out.println("Your number between 0 and 9 is: "+(rand.nextInt(10)));
    System.out.println("Your number between 1 and 10 is: "+(rand.nextInt(10)+1));
    System.out.println("Your number between 20 and 34 is: "+(rand.nextInt(15)+20));
    System.out.println("Your number between -10 and 9 is: "+(rand.nextInt(20)-10));
    System.out.println("Your number between 0 and 1 is: "+(rand.nextDouble()));
    System.out.println("Your number between 0 and 6 is: "+(rand.nextDouble()*6));

  }
}
