import java.util.*;

public class stock_span {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,21,4};
        Stack <Integer> st = new Stack<>();
        int [] new_arr = new int [arr.length];
        new_arr[0]=1;
        st.push(0);
        for(int i = 1; i<arr.length;i++){
                while(arr[st.peek()]<arr[i] && st.size()>0){
                    st.pop();
                }
                if(st.size()==0){
                    new_arr[i]=i+1;
                }
                else{
                    new_arr[i]=i-st.peek();
                }
                st.push(i);

        }
        for(int i =0;i<arr.length;i++){
            System.out.println(new_arr[i]);
        }
    }
}
