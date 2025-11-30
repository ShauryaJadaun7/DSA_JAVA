import java.util.Scanner;

public class conditional_2 {
    private static Scanner sc;
    public static void main(String[] args){

        sc = new Scanner(System.in);
        System.out.print("Enter marks of the student : ");
        int x = sc.nextInt();
        if (x>=0){
            if (x>=90){
                System.out.println("Congrates your marks are "+x+" and grade is A+");
            }
            else if(x>=80 && x<90){
                System.out.println("You got grade A");
            }
            else{
                System.out.println("Grade B");
            }
        }

    }
}
