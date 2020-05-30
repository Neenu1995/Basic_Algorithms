import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] nums, int val){
        Arrays.sort(nums);
        int start = 0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid] == val)
                return mid;
            else if(nums[mid]<val){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

}
