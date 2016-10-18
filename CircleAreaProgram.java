
/**
 * Write a description of class CircleAreaProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CircleAreaProgram
{
        public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );

        double pi = 3.14159;
        double r;
        double area;

        System.out.println( "Circle Area Calculator" );

        System.out.print( "What is the radius? " );
        r = scanner.nextDouble();

        area = pi * Math.pow( r, 2 );

        System.out.println( "Area: " + area );

        scanner.close();
    }
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CircleAreaProgram
     */
    public CircleAreaProgram()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
