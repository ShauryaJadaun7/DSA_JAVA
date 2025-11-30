import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print : ");
        int num =1;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(num);
            
            num=num*11;
            }
        
    }
}
