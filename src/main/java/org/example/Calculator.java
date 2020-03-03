package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Calculator
{
    public double rectangle(double width, double length ){
        double total = width * length;
        return total;
    }
    public static void main( String[] args )
    {   double width, length;
        Calculator rectangleCal = new Calculator();

    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for width: ");
        width = sc.nextDouble();
        System.out.println("Please enter a value for length: ");
        length = sc.nextDouble();
        System.out.println("Calculated Area is: "+ rectangleCal.rectangle(width,length));

    }catch (Exception e){
        System.out.println(e.getMessage());

    }


    }
}
