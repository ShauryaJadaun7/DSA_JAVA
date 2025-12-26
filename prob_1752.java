public class prob_1752 {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        if(nums.length==1 || nums.length==0){
            System.out.println("True");
            return;
        }
        else{
        }
        int [] nums2 = new int [nums.length];
        int x = 2;

        for(int i = 0 ; i < nums.length ; i++){
            nums2[i]=nums[(i+x)%nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
        if (nums[i]!= nums2[i]){
            System.out.println("False");
            return;
        }
    }
    System.out.println("True");
    }
}
