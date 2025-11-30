
import java.util.Scanner;

public class rev_num {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the number you reverse : ");
        int number = sc.nextInt();
        while(number!=0){
            int r=number%10;
            number=number/10;
            System.out.println(r);
        }


    }}
