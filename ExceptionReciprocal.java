/*
Write a program that reads an integer from the user and prints its reciprocal. Handle the
exception when the user enters zero.
*/

import java.util.*;

public class ExceptionReciprocal{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        
         
         try{
             System.out.println("Enter an integer: ");
              int n = sc.nextInt();
         double reciprocal = calculateReciprocal(n);
           
             System.out.println("The reciprocal of " + n + " is: "+ reciprocal);
         }
         catch(ArithmeticException e){
             System.out.println("Error: Cannot be divided by 0");
         }
          catch(Exception e){
              System.out.println("Error: Undefined error occurred");
          }
          finally{
              sc.close();
          }
    }
    public static double calculateReciprocal(int n) {
        if (n == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return 1.0 / n;
    }
}

    
