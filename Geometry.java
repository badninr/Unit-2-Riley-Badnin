public class Geometry{
    public static void main (String[] args){
        int sides=7;
        int radius=5;
        final double PI= 3.14159265359;
        System.out.println("A heptagon has "+sides+" sides");
        sides=10;
        System.out.println("A decagon has "+sides+" sides");
        sides=12;
        System.out.println("A dodecagon has "+sides+" sides");
        System.out.println("The circumference of a circle with a radius of "
        +radius+" is "+ (2*PI*radius));

        int a=40;
        double b=7.0;
        double y= 6.0;
        double z;
        z= a/b;

        System.out.println("z="+z);
    }
}
