// 1
// 2       3
// 4       5       6


import java.util.Scanner;

public class pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numberc of rows you want to print : ");
        int n = sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                k++;
                System.out.print(k+"\t");
            }
            System.out.println();
        }
    }
}
