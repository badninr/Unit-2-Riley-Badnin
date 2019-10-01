import java.util.Scanner;

public class Seconds{
  public static void main(String[] args){
    Scanner time = new Scanner(System.in);
    System.out.println("Enter a number of hours:");
    double hours = time.nextDouble();

    System.out.println("Enter a number of minutes:");
    double minutes = time.nextDouble();

    System.out.println("Enter a number of seconds:");
    double seconds = time.nextDouble();

    double totalSeconds= (hours*60*60)+(minutes*60)+seconds;

    System.out.println("The total number of seconds is: "+totalSeconds);


  }
}
