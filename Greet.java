// Write a Java program that greets a user.

import java.util.*;
public class Greet{
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        System.out.println("Hello, " + name + " have a good day.");
    }
}
