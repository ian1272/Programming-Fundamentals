
/**
 * Write a description of class QuadraticProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class QuadraticProgram
{
        public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "QUADRATIC CALCULATOR" );
        System.out.println( "ax^2 + bx + c" );

        double a, b, c;

        System.out.print( "Enter a: " );
        a = scanner.nextDouble();

        System.out.print( "Enter b: " );
        b = scanner.nextDouble();

        System.out.print( "Enter c: " );
        c = scanner.nextDouble();

        double x1, x2;

        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println( "x1 = " + x1 );
        System.out.println( "x2 = " + x2 );

        scanner.close();
    }
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class QuadraticProgram
     */
    public QuadraticProgram()
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
