import java.util.Random;

public class PhoneNumber{
  public static void main(String[] args){
    Random rand = new Random();
    int firstDigit = (rand.nextInt(8)+2);
    int secondDigit = rand.nextInt(9);
    int thirdDigit = rand.nextInt(10);

    int fourthDigit = (rand.nextInt(8)+2);
    int fifthAndSixthDigit = rand.nextInt(100);

    int lastFourDigits = rand.nextInt(10000);

    System.out.println("("+firstDigit+secondDigit+thirdDigit+") "+fourthDigit
    +fifthAndSixthDigit+" - "+lastFourDigits);

  }
}
