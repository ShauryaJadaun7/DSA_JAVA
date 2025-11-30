import java.util.Scanner;

public class lcm_gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd =0;
        int rem =0;
        int temp1=n1;
        int temp2=n2;
        while(n1%n2!=0){
            rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        gcd = n2;
        System.out.println("the gcd of "+temp1+" and "+temp2+" is "+gcd+" Lcm is "+(temp1*temp2)/gcd);

        


    }
}
