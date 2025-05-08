// Write a function to print the nth term of the Fibonacci series using recursion.

public class FibonacciRecursive{
    public static int fibonacci(int n){
        if(n == 1 || n == 2 ){
            return n-1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public static void main(String[] args){
        int result = fibonacci(5);
        System.out.println("The fibonacci series is: " + result);
    }
}