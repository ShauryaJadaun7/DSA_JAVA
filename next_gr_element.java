//496

// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

// You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

// For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

// Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

// Example 1:

// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

import java.util.*;
public class next_gr_element {
    public static int [] ngetr(int [] nums1, int [ ] nums2) {
        int [] ngetr = new int[800];
        Stack <Integer>st = new Stack<>();
        for( int i = nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ngetr[nums2[i]]=-1;
            }
            else{
                ngetr[nums2[i]]=st.peek();
            }
            st.push(nums2[i]);
        }
        for(int i = 0 ; i<nums1.length;i++){
            nums1[i]=ngetr[nums1[i]];
        }
        return nums1;
    }
    public static void main(String[] args) {
        int []nums1={4,1,2};
        int []nums2={1,3,4,2};
        ngetr(nums1,nums2);

        for(int i =0 ; i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }

    }

    
}
