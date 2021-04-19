import org.junit.Test;

public class binarySearch_demo {
    public int search (int[] nums, int target) {
        // write code here
        int start = 0;
        int end = nums.length-1;
        int temp;

        while(start <= end){
            int mid = (end+start)/2;
            if (nums[mid] > target) end = mid-1;
            else if (nums[mid] < target) start = mid+1;
            else{
                temp = mid;
                while (nums[temp]==target){
                    if (temp-1>=0){
                        if (nums[temp-1]!=target) break;
                        else temp--;
                    }
                    else break;
                }
                return temp;
            }
        }
        return -1;
    }
    @Test
    public void test(){
        System.out.println(search(new int[]{-1,-1,-1,2},-1));
    }
}
