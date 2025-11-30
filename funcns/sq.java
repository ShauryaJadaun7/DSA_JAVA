
import java.util.Scanner;
public class sq {
    public static int square(int x){
        return x*x;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = square(n);
        System.out.println(s);

    }
}
