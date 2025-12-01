import java.util.Scanner;

public class span_arr {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.err.println(arr[i]);
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }

        }

        System.out.println("The span of array is : " + (largest - smallest));

    }

}
