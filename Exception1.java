/*
 * Write a program that reads two integers from the user and calculates their average.
Handle the exception when the user enters non-numeric values
 */
import java.util.*;
import java.util.InputMismatchException;
public class Exception1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
try{
        System.out.println("Enter an Integer: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = sc.nextInt();
        double average = (n1+n2)/2.0;
        System.out.println("Average = " + average);
    } catch(InputMismatchException e){
        System.out.println("Error: Please enter a numeric value");
    } catch(Exception e){
        System.out.println("Error: An undefined error occured");
    } finally{
        sc.close();
    }
  }
}