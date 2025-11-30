import java.util.Scanner;


//Enter the number : 17
// Enter the base : 8
// Enter the base want to convert : 10
// The conversion of ( 17 ) of base 8 to base 10 is : 15


public class any_any {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int d = sc.nextInt();
        System.out.print("Enter the base : ");
        int b = sc.nextInt();
        System.out.print("Enter the base want to convert : ");
        int b2 = sc.nextInt();

        System.out.print("The conversion of ( "+d+" ) of base "+b+" to base "+b2+" is : ");
        int p=1;
        int rev=0;
        while(d!=0){
            int rem = d%b2;
            d=d/b2;
            rev += rem *p;
            p=p*b;
        }
        System.out.print(rev);
}
}  

