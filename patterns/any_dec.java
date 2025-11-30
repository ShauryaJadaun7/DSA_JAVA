import java.util.Scanner;

public class any_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int d = sc.nextInt();
        System.out.print("Enter the base want to you want to convert to 10 : ");
        int b = sc.nextInt();
        System.err.print("The conversion of ( "+d+" )of base "+b+" to base 10 is : ");
        int p=1;
        int dis=0;
        while(d!=0){
            int rem = d%10;
            d=d/10;
            dis+=rem*p;
            p=p*b;
        }
        System.out.print(dis);
}
}
