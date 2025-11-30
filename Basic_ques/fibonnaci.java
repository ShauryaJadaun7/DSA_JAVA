import java.util.Scanner;


public class fibonnaci {
     private static Scanner sc;
     public static void main(String[] args) {
        sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int term_1=0;
        int term_2=1;
        int term_3=1;
        for(int i=1;i<=terms;i++){
            System.out.print(term_1+" ");
            term_1=term_2;
            term_2 =term_3;
            term_3 =term_2+term_1;

        }
    
}
}
