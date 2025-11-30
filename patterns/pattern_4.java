
import java.util.Scanner;
public class pattern_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print : ");
        int n = sc.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=i;j<n;j++){

                System.out.print("\t");
            }
            for (int k=i; k>=1;k--){
                System.out.print("*\t");
            }
            System.out.print("\n");

        }
}
}

