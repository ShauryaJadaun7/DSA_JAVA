import java.util.Scanner;

public class sum_two_array{
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the number of elements in the array2 : ");
        int m = scn.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        // ARRAY APPROACH
        int carry =0;
        int [ ]sum=new int[n>m?n:m];
        int i = n-1;
        int j=m-1;
        int k = sum.length-1;


        while(k>=0){
            int d = carry;
            if ( i>=0){
                d+=arr[i];
            } 
            if ( j>=0){
                d+=arr2[j];
            } 
            carry= d/10;
            sum[k]=d%10;
            k--;
            j--;
            i--;

        }
        System.err.println("The sum is : ");
        if(carry!=0){
            System.err.println(carry);
        }

        for (int val : sum){
            System.out.println(val);
        }
        // int p = 1;
        // int sum = 0;
        // if (m < n) {
        //     int x = n - 1;  // Fixed: Array indices start from 0
        //     int y = m - 1;  // Fixed: Array indices start from 0
        //     while (y >= 0) {  // Fixed: Changed condition
        //         sum += (arr[x] + arr2[y]) * p;
        //         p *= 10;
        //         x--;
        //         y--;
        //     }
        //     while (x >= 0) {  // Fixed: Changed to while loop for remaining elements
        //         sum += arr[x] * p;
        //         p *= 10;
        //         x--;
        //     }
        // } else {
        //     int x = n - 1;  // Fixed: Array indices start from 0
        //     int y = m - 1;  // Fixed: Array indices start from 0
        //     while (x >= 0) {  // Fixed: Changed condition
        //         sum += (arr[x] + arr2[y]) * p;
        //         p *= 10;
        //         x--;
        //         y--;
        //     }
        //     while (y >= 0) {  // Fixed: Changed to while loop for remaining elements
        //         sum += arr2[y] * p;
        //         p *= 10;
        //         y--;
        //     }
        // }
        
        // System.out.println("Sum of arrays is: " + sum);  // Added output statement
    }
}