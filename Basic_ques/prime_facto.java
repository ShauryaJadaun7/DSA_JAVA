import java.util.Scanner;
import java.lang.Math;

public class prime_facto {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n= sc.nextInt();
        for(int i=2;i*i<n;i++){
            while(n%i==0){
                n = n/i;
                System.out.print(i+" , ");
            }
        }
        if(n!=1){
            System.out.print(n);
        }

    }
}