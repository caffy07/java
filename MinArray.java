// Program to find minimum in an array

public class MinArray {
    public static void main(String[] args) {
        int arr[] = {23, 43, 56, 76, 777, 111, 333};
        int min = Integer.MAX_VALUE;

        for(int element: arr){
            if(element<min){
                min = element;
            }
        }
        System.out.println("The minimum is: " + min);
    }
}
