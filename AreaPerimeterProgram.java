
/**
 * Write a description of class AreaPerimeterProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AreaPerimeterProgram
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );

        double width, length, area, perimeter;

        System.out.println( "Area and Perimeter Calculator" );

        System.out.print( "What is the width? " );
        width = scanner.nextDouble();

        System.out.print( "What is the length? " );
        length = scanner.nextDouble();

        area = width * length;
        perimeter = 2 * width + 2 * length;

        System.out.println( "Area: " + area );
        System.out.println( "Perimeter: " + perimeter );

        scanner.close();
    }
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class AreaPerimeterProgram
     */
    public AreaPerimeterProgram()
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
