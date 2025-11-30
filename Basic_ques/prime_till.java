import java.util.Scanner;
import java.lang.Math;

public class prime_till {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the low value : ");
        int low = sc.nextInt();
        System.out.print("Enter the high value : ");
        int high = sc.nextInt();
        for (int i = low;i<=high;i++){
            int count = 0 ;
            for (int j=2;j<=Math.pow(i,0.5);j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }

        }


    }
}
