/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalmath;

import java.util.Scanner;

/**
 * Create a table of values for a cubic, quadratic or linear function
 *
 * @author hunterlaverty
 */
public class CubricDataCollector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This code will follow the ax^3+bx^2+cx+d=f(x) format
        //Create an integer for x
        int x = -10;
        
        //create a space to put converion in
        Scanner input = new Scanner(System.in);

        //Welcome to the program
        System.out.println("Hello, this table of values program runs with the formula layout format being ax^3+bx^2+cx+d=f(x)");
        System.out.println("If you want a quadratic table of values, then enter 0 for the value of a");

        //ask them to enter values
        System.out.println("Please enter the value for a");
        double a = input.nextInt();
        
        System.out.println("Please enter the value for b");
        double b = input.nextInt();
        
        System.out.println("Please enter the value for c");
        double c = input.nextInt();
       
        System.out.println("Please enter the value for d");
        double d = input.nextInt();
        
        while(x <= 10){
            //Do the exponents outside of the equation
            double x3 = Math.pow(x,3);    
            double x2 = Math.pow(x,2);
            
            //do the math creating the double 'f'
            double f = (a*x3)+(b*x2)+(c*x)+d;
            System.out.println("f("+x+") = "+f);
            x++;
        }
    }

}
