import java.util.Scanner;
public class factorial {
    private static Scanner sc;
    public static void main(String[] args){
       sc = new Scanner(System.in);
       System.out.print("Enter the number to find it's factorial ");
       int x = sc.nextInt();
       int fact = 1;
       if (x==0){
        System.out.print("The factorial of "+x+"is "+fact);
       }
       else{
        for (int i = 1;i<=x;i++){
            fact = fact * i ;

    }
        System.out.print("The factorial of "+x+" is "+fact);
       }

    }
    
}
