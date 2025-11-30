import java.util.Scanner;

public class digit_print {
     private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the number you want to count its digit : ");
        int number = sc.nextInt();
        int digit =0;
        int temp = number;
        while(temp != 0){
            temp = temp/10;
            digit++;
        }
        int divisor = (int)Math.pow(10,digit-1);
        while(divisor!=0){
            int q=number/divisor;
            number = number%divisor;
            divisor=divisor/10;
            System.out.println(q);
        }

    
}
}
