import java.util.Scanner;

public class digit_cnt {
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
        System.out.print("The number of digits in "+number+" are "+digit);
    }

}
