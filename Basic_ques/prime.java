import java.util.Scanner;
import java.lang.Math;

public class prime {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.err.print("Enter the number you want to check : ");
        int count = 0;
        int x = sc.nextInt();
        // for (int i =1 ; i <= Math.pow(x,0.5);i++){
        //     if (x%i == 0){
        //         count = count+1;   
        //     }//Time complexity in O((n**0.5))
        // }

        //More optimized
        
        // if (count <= 1){
        //     System.out.println(x+" Is a prime number ");
        // }
        // else{
        //     System.out.println(x+" Not a prime number ");

        // }


         //More optimized
         for (int i=2 ; i<=Math.pow(x,0.5);i++){
            if (x%i==0){
                count++;
                break;
            }
         }
         if (count==0){
            System.out.println(x+" Is Prime");
         }
         else{
            System.out.println(x+" Not prime");
         }
        

    }
}