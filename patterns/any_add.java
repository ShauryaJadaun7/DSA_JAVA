


// Enter the first number : 775
// Enter the second number : 416
// The addition of 775 and 416 of base 8 is 1413

import java.util.Scanner;

public class any_add {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int b = sc.nextInt();
        System.out.print("Enter the first number : ");
        int n1= sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2= sc.nextInt();
        int temp1=n1;
        int temp2=n2;
        int p=1;
        int rev=0;
        while(n1!=0 || n2!=0){
            int rem1=n1%10;
            int rem2=n2%10;
            n1=n1/10;
            n2=n2/10;
            if (rem1+rem2>(b-1)){
                int nor = (rem1+rem2)%b;
                rev+=(nor*p);
                p=p*10;
                n1+=1;
            }
            else{
                int nor = rem1+rem2;
                rev+=(nor*p);
                p=p*10;
            }

        }
        System.out.print("The addition of "+temp1+" and "+temp2+" of base "+b+" is "+rev);
}
    
}
