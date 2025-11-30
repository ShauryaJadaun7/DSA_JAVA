

//decimal to any base

//O|P

// Enter the number in base 10 : 57
// Enter the base want to convert 2,8 or 16 : 2
// The conversion of ( 57 )10 to base 2 is : 
// 111001

import java.util.Scanner;

public class dec_any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in base 10 : ");
        int d = sc.nextInt();
        System.out.print("Enter the base want to convert 2,8 or 16 : ");
        int b = sc.nextInt();
        System.err.print("The conversion of ( "+d+" )10 to base "+b+" is : ");
        int p=1;
        int rev=0;
        while(d!=0){
            int rem= d%b;
            d=d/b;
            rev += rem*p;
            p=p*10;

        }
        System.out.print(rev);

    }
}
