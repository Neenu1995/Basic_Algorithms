public class TesterClass {
    public static void quicksort(int[] nums , int start, int end){
        if(start<end){
            int mid = partition(nums, start, end);
            quicksort(nums, start, mid-1);
            quicksort(nums, mid+1,end);
        }
    }
    public static int partition(int[] nums, int start, int end){
        int pivot = nums[start];
        int leftwall = start;
        for(int i = start+1;i<=end;i++){
            if(nums[i]<pivot){
                leftwall++;
                int temp = nums[i];
                nums[i] = nums[leftwall];
                nums[leftwall] = temp;
            }
        }
        int temp = nums[leftwall];
        nums[leftwall] = nums[start];
        nums[start] = temp;

        return leftwall;
    }
    public static void mergeSort(int[] array,int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(array,start,mid-1);
        mergeSort(array,mid+1,end);
        merge(array,start,mid,end);
    }
    public static void  merge(int[] array, int start,int mid, int end){
        int[] leftArr = new int[mid-start+1];
        int[] rightArr = new int[end-mid];
        for(int i = 0;i<leftArr.length;i++)
            leftArr[i] = array[start+i];
        for(int i = 0;i<rightArr.length;i++)
            rightArr[i] = array[i+mid+1];
        int left =0;
        int right = 0;
        for(int i =start;i<end;i++){
            if(left<leftArr.length && right<rightArr.length){
                if(leftArr[left]<=rightArr[right])
                    array[i] = leftArr[left++];
                else
                    array[i] = rightArr[right++];
            }else if(left<leftArr.length){
                array[i] = leftArr[left++];

            }else if( right<rightArr.length){
                array[i] = rightArr[right++];
            }
        }
    }


}
