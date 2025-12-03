//Sliding window max using O(n) complexity

import java.util.Stack;

public class sliding_win_max {
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k =3;
        int[] ngetr = new int[nums.length];
        if (k == 1) {
            for( int i = 0 ; i<nums.length;i++){
                System.out.println(nums[i]);
            }
        } else {
            Stack<Integer> st = new Stack<>();
            st.push(nums.length-1);
            ngetr[nums.length-1]=nums.length;
            for (int i = nums.length-2; i >=0; i--) {
                
                while (!st.isEmpty() &&nums[i]>=nums[st.peek()] ) {
                   
                        st.pop();
                        
                    }
                if(st.isEmpty()){
                    ngetr[i]=nums.length;
                }
                else{
                    ngetr[i]=st.peek();
                }          
                st.push(i);

                }
        }   

            
            int j = 0;
            System.out.println("The window is : ");
            for (int i = 0; i <= nums.length-k; i++) {
                if(j<i){
                    j=i;
                }
                while(ngetr[j]<i+k){
                    j = ngetr[j];
                }
               System.out.println(nums[j]);;
            }
        // int x= -121;
        // int temp = x;
        // int rev = 0;
        // int digit = 0 ;
        // while(temp!=0){
        //     digit = temp%10;
        //     rev = rev*10+digit;
            
        //     temp/=10;
        //     System.out.println(temp);
        // }
        // if(rev==x){
        //     System.out.println(rev+" True");;
        // }
        // else{
        //     System.out.println(rev+" False");;
        // }

    }
    
}
