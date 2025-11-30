import java.util.Scanner;
import java.lang.Math;

public class pythagorean_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value  : ");
        int  a= sc.nextInt();
        System.out.print("Enter the value  : ");
        int b= sc.nextInt();
        System.out.print("Enter the value  : ");
        int c= sc.nextInt();
        // check for max value 
        if (a>b){
            if (a>c){
                System.out.print(a+" is hypotenous\n");
                int pytha = (int)(Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2));
                if (pytha == 0){
                    System.out.println(a+","+b+" , "+c+" are p_trip.");
                }
            }
            else{
                System.out.print(c+" is hypotenous\n");
                int pytha = (int)(Math.pow(b,2) + Math.pow(a,2) - Math.pow(c,2));
                if (pytha == 0){
                    System.out.println(a+","+b+" , "+c+" are p_trip.");
                }
            }
        }
        else {
            if (b>c){
                System.out.print(b+" is hypotenous\n");
                int pytha = (int)(Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2));
                if (pytha == 0){
                    System.out.println(a+","+b+" , "+c+" are p_trip.");
                }
            }
            else{
                System.out.print(c+" is hypotenous\n");
                int pytha = (int)(Math.pow(b,2) + Math.pow(a,2) - Math.pow(c,2));
                if (pytha == 0){
                    System.out.println(a+","+b+","+c+" are p_trip.");
                }
            }
        }
    }
}
