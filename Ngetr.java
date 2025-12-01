public class Ngetr {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,21,4};
//O(n^2) approach
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] > arr[i]){
                    System.out.println(arr[j]);
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(-1);
            }
        }
        
    }
    
}


