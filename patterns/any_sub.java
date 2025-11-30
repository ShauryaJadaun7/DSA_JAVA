import java.util.Scanner;

public class any_sub {
    


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
        while(n2>0){
            int rem1=n1%10;
            int rem2=n2%10;
            n1=n1/10;
            n2=n2/10;
            if (rem1>rem2){
                int nor = (rem2-rem1)+b;
                rev+=(nor*p);
                p=p*10;
                n2-=1;
            }
            else{
                int nor = rem2-rem1;
                rev+=(nor*p);
                p=p*10;
            }

        }
        System.out.print("The addition of "+temp1+" and "+temp2+" of base "+b+" is "+rev);
}
    
}

    
