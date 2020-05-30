import java.util.Arrays;

public class CountingSort {
    public static int[] countSort(int[] nums, int k){

            int[] count = new int[k+1];
            Arrays.fill(count,0);
            for(int i : nums){
                count[i] = count[i] +1;
            }
            for(int i =1 ;i<count.length;i++){
                count[i] += count[i-1];
            }

            int[] sorted = new int[nums.length];
            for(int i = nums.length-1;i>=0;i--){
                sorted[count[nums[i]]-1] = nums[i];
                count[nums[i]]-=1;
            }
            return sorted;
        }



}
