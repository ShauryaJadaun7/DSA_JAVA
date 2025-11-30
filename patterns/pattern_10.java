import java.util.Scanner;

//                *
//         *               *
// *                               *
//         *               *
//                 *








public class pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numberc of rows you want to print : ");
        int n = sc.nextInt();
        int o_sp =(n/2);
        int i_sp= -1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=o_sp;j++){
                System.out.print("\t");

            }
            System.out.print("*\t");
            for(int j=1;j<=i_sp;j++){
                System.out.print("\t");

            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }
            if(i<=n/2){
                o_sp--;
                i_sp+=2;
            }
            else{
                o_sp++;
                i_sp-=2;
            }

            // space star space star
            //    for(int j=1;j<=n;j++){
            //        for (int k = (n / 2); k>= j; k--) {
            //            System.out.print("\t");
            //        }
            //        if (((i+j)>2) && ((i+j)%2==0) ){
            //         System.out.print("*\t");
            //        }
            //        else{
            //         System.out.print("\t");
            //        }

            //     }
                System.out.println();
        }
    }
}
