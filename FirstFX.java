import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application {

  public void start(Stage stage){
    final int SNOWMANCENTER = 250;
    Text hello = new Text(50, 50, "This is a snowman.");
    Circle circle1 = new Circle(SNOWMANCENTER, 50, 20);
    Circle circle2 = new Circle(SNOWMANCENTER, 90, 30);
    Circle circle3 = new Circle(SNOWMANCENTER, 150, 40);
    Ellipse ellipse1 = new Ellipse(30,180,70,20);
    Ellipse ellipse2 = new Ellipse(170,180,70,20);
    Ellipse ellipse3 = new Ellipse(310,180,70,20);
    Ellipse ellipse4 = new Ellipse(450,180,70,20);
    Rectangle rectangle = new Rectangle(0,185,500,20);
    Polygon nose = new Polygon(SNOWMANCENTER,50,SNOWMANCENTER,55,275,52);
    Circle eye1 = new Circle(245, 45, 1);
    Circle eye2 = new Circle(255, 45, 1);
    Line arm1 = new Line(220,90,190,120);
    Line arm2 = new Line(280,90,310,120);
    Rectangle topOfHat = new Rectangle(235,7,30,30);
    Rectangle bottomOfHat = new Rectangle(230,28,40,10);



    circle1.setStroke(Color.GREY);
    circle1.setFill(Color.GREY);
    circle2.setStroke(Color.GREY);
    circle2.setFill(Color.GREY);
    circle3.setStroke(Color.GREY);
    circle3.setFill(Color.GREY);
    ellipse1.setStroke(Color.WHITE);
    ellipse1.setFill(Color.WHITE);
    ellipse2.setStroke(Color.WHITE);
    ellipse2.setFill(Color.WHITE);
    ellipse3.setStroke(Color.WHITE);
    ellipse3.setFill(Color.WHITE);
    ellipse4.setStroke(Color.WHITE);
    ellipse4.setFill(Color.WHITE);
    rectangle.setStroke(Color.WHITE);
    rectangle.setFill(Color.WHITE);
    nose.setStroke(Color.ORANGE);
    nose.setFill(Color.ORANGE);
    eye1.setStroke(Color.BLACK);
    eye1.setFill(Color.BLACK);
    eye2.setStroke(Color.BLACK);
    eye2.setFill(Color.BLACK);
    arm1.setStroke(Color.BROWN);
    arm1.setFill(Color.BROWN);
    arm2.setStroke(Color.BROWN);
    arm2.setFill(Color.BROWN);
    topOfHat.setFill(Color.BLACK);
    topOfHat.setStroke(Color.BLACK);
    bottomOfHat.setFill(Color.BLACK);
    bottomOfHat.setStroke(Color.BLACK);

    Group root = new Group(hello, ellipse1, ellipse2,
    ellipse3, ellipse4, rectangle, circle1, circle2, circle3, nose, eye1, eye2,
    arm1, arm2, topOfHat, bottomOfHat);
    Scene scene = new Scene(root, 500, 195, Color.LIGHTBLUE);

    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
