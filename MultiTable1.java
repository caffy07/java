// Write a Java method to print the multiplication table of a number n.

import java.util.*;
public class MultiTable1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table you want: ");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.format("%d x %d = %d\n", n, i, n*i);
        }
        
    }
}