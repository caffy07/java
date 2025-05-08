// Create an array of 5 floats and calculate their sum
public class FloatArraySum {
    public static void main(String[] args){
        float num[] = {7.7f, 11.11f, 12.12f, 55.4f, 8.9f, 10.99f};
        float sum =0;
        // using for loop
        for(float element: num){
            sum = sum + element;
        }
        System.out.print("The sum of elements in array is: " + sum);
    }
}
