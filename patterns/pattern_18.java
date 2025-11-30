// // *       *       *       *       *
//         *               *
//                 *
//         *       *       *
// *       *       *       *       *




import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print : ");
    int n = sc.nextInt();
    int str=n;
    int sp =1;

    for(int i =1;i<=n;i++){
        for(int j=1;j<sp;j++){
            System.out.print("\t");
        }
        for(int j=1;j<=str;j++){
            if(i>1&&i<=n/2 && j>1 && j<str){
                System.out.print("\t");
            }
            else{
            System.out.print("*\t");                

            }

        }

        if(i<=n/2){
            str-=2;
            sp++;
        }
        else{
            sp--;
            str+=2;
        }
        System.out.println();
    }
    }
    
}
