import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sum_3 {
     public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0 ; i<nums.length-2;i++){
            int tar = -nums[i];
            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                int total = nums[l]+nums[r];
                if(total>tar){
                    r--;
                }
                else if(total==tar){
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        sum_3 solution = new sum_3();
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println("Triplets that sum to zero: " + result);
    }
}
