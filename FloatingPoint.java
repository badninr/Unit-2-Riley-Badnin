import java.util.Scanner;

public class FloatingPoint{
  public static void main(String[] args){
    Scanner floatingPoint = new Scanner(System.in);
    System.out.println("Enter two numbers (press enter after each):");
    double num1 = floatingPoint.nextDouble();
    double num2 = floatingPoint.nextDouble();

    System.out.println("Your numbers: "+num1+", "+num2);

    double sum=num1+num2;
    double difference=num1-num2;
    double product=num1*num2;
    double quotient=num1/num2;

    System.out.println("The sum is: "+sum);
    System.out.println("The difference is: "+difference);
    System.out.println("The product is: "+product);
    System.out.println("The quotient is: "+quotient);
  }
}
