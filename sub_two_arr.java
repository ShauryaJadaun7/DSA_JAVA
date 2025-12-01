import java.util.Scanner;

public class sub_two_arr {
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
        int d = 0;
        int[] sum = new int[m];
        int i = n - 1;
        int j = m - 1;
        int k = sum.length - 1;
        int c =0;
        while (i>=0) {
            d = arr2[j]+c-arr[i]; 
            if ( d < 0){
                c = -1;
                sum[k]=arr2[j]+c-arr[i]+10;
            } 
            else {
                sum[k]=d;
            }
            i--;
            j--;
            k--;          
        }
        System.out.println("\b");
        for( int x = j ; x>=0;x--){
            d=arr2[x]+c;
            if(d<0){
                c=-1;
                d=arr2[x]+c+10;
                sum[k]=d;
                k--;
            }
            else{
                d=arr2[x]+c;
                sum[k]=d;
                k--;
                
            }
        }
        for( int val : sum){
            System.out.println(val);
        }
    }
}
