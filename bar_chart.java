import java.util.Scanner;

public class bar_chart {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for( int i =1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //printing of stars

        for(int i=max;i>0;i--){
            for(int j=0;j<n;j++){
                if(arr[j]-i<0){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
