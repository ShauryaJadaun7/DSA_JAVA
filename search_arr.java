import java.util.Scanner;

public class search_arr {

    public static int b_search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element to search : ");
        int x = scn.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // int cnt = 0;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == x) {
        //         System.out.print(x + " is at " + i + " index");
        //     } else {
        //         cnt++;
        //         if (cnt == n - 1) {
        //             System.out.println("-1");
        //         }
        //     }

        // }
        int element = b_search(arr, x);
        System.out.println("The index of " + x + " is: " + element);

    }

}
