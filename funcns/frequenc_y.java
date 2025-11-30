import java.util.Scanner;
//OUTPUT

// Enter the number : 948949
// Enter the digit : 9
// Number of times 9 occur in 948949 is 3

public class frequenc_y {
    public static int frequency(int n , int d){
        int cnt =0;
        while(n!=0){
            int rem = n%10;
            n=n/10;
            if(rem==d){
                cnt++;
            }

        }
        return cnt;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scn.nextInt();
        System.out.print("Enter the digit : ");
        int d = scn.nextInt();
        int freq = frequency(n,d);
        System.out.println("Number of times "+d+" occur in "+n+" is "+freq);
        
    }
}
