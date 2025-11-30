import java.util.Scanner;

public class rotate_num {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();
        int digit =0;
        int temp = number;
        while(temp != 0){
            temp = temp/10;
            digit++;
        }
        int ro_num=0;

        int value = number % (int)(Math.pow(10,k));
        ro_num = value * (int)Math.pow(10,digit-1);
        number=number/(int)(Math.pow(10,k));
        ro_num=ro_num+number;
        System.out.println(ro_num);

    }

}

