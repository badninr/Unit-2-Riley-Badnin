import java.util.Scanner;

public class ScanPractice
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers (press enter after each):");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        System.out.println("Your numbers: "+num1+", "+num2+", and "+num3);

        double avgNum=(num1+num2+num3)/3;

        System.out.println("The average is: "+avgNum);
    }
}
