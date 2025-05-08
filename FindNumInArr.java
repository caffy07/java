// Program to verify whether the integer is present in the array or not (using for-each loop)
import java.util.*;

public class FindNumInArr {
    public static void main(String[] args){
        int arr[] = {23, 44, 55, 76, 43, 77, 890};
        System.out.println("Enter the number you want to search: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isInArray = false;
        
        for(int element: arr)
        {
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The number is present");
        }
        else{
            System.out.println("The number is not present");
        }
    }
}
