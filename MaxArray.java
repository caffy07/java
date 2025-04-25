// Program to find maximum in an array

public class MaxArray {
    public static void main(String[] args) {
        int arr[] = {23, 43, 56, 76, 777, 111, 333};
        int max = 0;

        for(int element: arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("The maximum is: " + max);
    }
}
