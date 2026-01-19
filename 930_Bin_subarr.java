//Medium type sliding window patten problem


class Solution {

    // Ye function count karta hai total subarrays jinka sum <= goal ho
    public int numSubarraysAtmostWithSum(int[] nums, int goal) {
        int subarr = 0;   // total valid subarrays ka count
        int sum = 0;      // current window ka sum
        int l = 0;        // left pointer

        // right pointer se array traverse kar rahe hain
        for (int r = 0; r < nums.length; r++) {

            // right element ko window me add karo
            sum += nums[r];

            // agar sum goal se zyada ho jaye
            // to left se window shrink karo
            while (sum > goal && l <= r) {
                sum -= nums[l++];
            }

            // current window ke sab possible subarrays count karo
            // jo r par end ho rahe hain
            subarr += r - l + 1;
        }

        return subarr;
    }

    // exact goal wale subarrays nikalne ke liye
    // atMost(goal) - atMost(goal - 1) ka use
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysAtmostWithSum(nums, goal)
             - numSubarraysAtmostWithSum(nums, goal - 1);
    }
}

// Time complexity is O(n) kyoki func do barr  call hoga so 2*n which is equavalent to n
