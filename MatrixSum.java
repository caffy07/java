// Program to find sum of two matrices

public class MatrixSum {
    public static void main(String[] args){
       int arr1[][] = {{2, 3, 4}, {5, 6, 1}};
       int arr2[][] = {{4, 5, 6}, {7, 8, 9}};
       int result[][] = {{0,0,0}, {0,0,0}};

       for(int i = 0; i<arr1.length; i++){    //for rows
        for(int j = 0; j<arr1[i].length; j++){       // for columns
            result[i][j] = arr1[i][j] + arr2[i][j];
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
       }
    }
}
