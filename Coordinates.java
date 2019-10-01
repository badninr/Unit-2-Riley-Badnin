import java.util.Scanner;

public class Coordinates{
  public static void main(String[] args){
    Scanner coordinates = new Scanner(System.in);
    System.out.println("Enter a x1 coordinate:");
    double x1 = coordinates.nextDouble();
    System.out.println("Enter a y1 coordinate:");
    double y1 = coordinates.nextDouble();
    System.out.println("Enter a x2 coordinate:");
    double x2 = coordinates.nextDouble();
    System.out.println("Enter a y2 coordinate:");
    double y2 = coordinates.nextDouble();

    double xDif= x1-x2;
    double yDif= y1-y2;

    double xSqrd=Math.pow(xDif,2);
    double ySqrd=Math.pow(yDif,2);

    double totalCoordinates=xSqrd+ySqrd;

    double distance=Math.sqrt(totalCoordinates);

    System.out.println("The distance between the two points is: "+distance);
  }
}
