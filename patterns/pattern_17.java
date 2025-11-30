import java.util.Scanner;

public class pattern_17 {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print : ");
    int n = sc.nextInt();
    int mid = n/2;
    int str =1;
    for(int i=1;i<=n;i++){
        for( int sp =1;sp<=mid;sp++){
            if(i==mid+1){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        for(int j=1;j<=str;j++){
            System.out.print("*\t");
        }
        if(i<=mid){
            str++;
        }
        else{
            str--;
        }
        System.out.println();
    }

  }
    
}
