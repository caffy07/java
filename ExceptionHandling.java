/*
Write a program that accepts two integers from the user and performs
division. Implement exception handling to handle the following scenarios:
a. Division by zero (ArithmeticException).
b. Invalid input, such as entering a non-integer value (InputMismatchException).
c. Any other unhandled exceptions that may occur (Exception).
*/

import java.util.*;
import java.util.InputMismatchException;

public class ExceptionHandling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("Enter an integer: ");
        int n1 = sc.nextInt();
        
        System.out.println("Enter another integer: ");
        int n2 = sc.nextInt();
        
        int divide = n1/n2;
        System.out.println("The result is: " + divide);
        } catch(InputMismatchException e){
            System.out.println("Error: Enter Integers");
        } catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        } catch(Exception e){
            System.out.println("Error: An unknown error occurred");
        }
        finally{
            sc.close();
        }
    }
}
