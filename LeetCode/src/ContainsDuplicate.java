import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    /*
    LINEAR SEARCH
     int low = 0;
        int high = nums.length;
        int mid;
        for(int i=0;i<nums.length;i++){

            while(low != high){
                mid = low + (high - low)/2;
                if()
            }
    }
     */

        public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1,2,3,4};

        boolean result = cd.containsDuplicate(nums);

            System.out.println("The Integer arrays contain duplicate: "+result);


    }
}

