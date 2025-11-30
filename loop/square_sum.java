import java.util.Scanner;
import java.lang.Math;
public class square_sum {
    private static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.print("Enter the number of terms square sum you want to find out : ");
        int x = sc.nextInt();
        double sum =0;
        for (int i =1 ; i<(x+1) ;i++){
            double z = Math.pow(i,2);
            sum = sum + z ;
        }
        System.out.println("The sum of "+x+" terms are "+sum);
    }
    
}
