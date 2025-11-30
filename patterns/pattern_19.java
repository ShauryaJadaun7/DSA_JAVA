// *       *       *               *
//                 *               *
// *       *       *       *       *
// *               *
// *               *       *       *

//for n=5 if want to go for n=7,9,11,.. so some modifications are required.

import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print : ");
    int n = sc.nextInt();
    for(int i =1;i<=n/2+1;i++){
        for(int j=1;j<=n;j++){
            if((j>n/2+1 && j<n && i<=n/2 )|| (i==n/2 && j<=n/2 )){
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }
        }
        System.out.println();
    }
    for(int i = n/2+2;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j==n/2 || (i==n-1 && j>n/2+1)){
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
