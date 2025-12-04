import java.util.Scanner;
public class even_odd{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number to check : ");
       int n = sc.nextInt();
       if ((n & 1) ==0){
           System.out.println(n+" is Even");
       }
       else{
        System.out.println(n+" is Odd");
       }


    }
}