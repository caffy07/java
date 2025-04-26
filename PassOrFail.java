// Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 
// 35 marks out of 100 in each subject to pass. 
// Assume 3 subjects and take marks as input from the user.

import java.util.*;
public class PassOrFail{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks of subject 1: ");
     double m1 = sc.nextDouble();
    System.out.println("Enter marks of subject 2: ");
     double m2 = sc.nextDouble();
    System.out.println("Enter marks of subject 3: ");
     double m3 = sc.nextDouble();
    
    double percentage = ((m1+m2+m3)/300)*100;
    
    System.out.println("The percent scored by the Student is: " + percentage);
    
    if(m1 >= 35 && m2>=35 && m3>=35 && percentage>=40){
        System.out.println("PASS");
    }
    else{
        System.out.println("FAIL");
        }
    }
}
