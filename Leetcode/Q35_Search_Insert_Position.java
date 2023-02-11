public class Q35_Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;  // wil return index 2
        // int target = 2;  // wil return index 1
        // int target = 4;  // wil return index 2
        // int target = 7;  // wil return index 4
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) 
        {
            int mid = start + (end - start)/2;

            if(target == nums[mid]) {
                return mid;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return end + 1;
    }
}
