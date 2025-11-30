import java.util.Scanner;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numberc of rows you want to print : ");
        int n = sc.nextInt();
        int t1=0;
        int t2=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(t1+"\t");
                int t3=t1+t2;
                t1=t2;
                t2=t3;

            }
            System.out.println();
        }
    }
    
}
