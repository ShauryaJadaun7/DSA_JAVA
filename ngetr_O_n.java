
import java.util.*;
public class ngetr_O_n {
    public static void main(String[] args) {
       int[] arr = {6,8,0,1,3};
        Stack <Integer> st = new Stack<>();
        int [] new_arr = new int [arr.length];
        for(int i =arr.length-1 ; i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                new_arr[i]=-1;
            }
            else{
                new_arr[i]=st.peek();
            }
            st.push(arr[i]);
            
        }
        for(int i =0 ; i< arr.length;i++){
            System.out.print(new_arr[i]+" ");
        }
        
    }
}
