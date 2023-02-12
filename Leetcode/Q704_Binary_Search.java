public class Q704_Binary_Search {
    public static void main(String[] args) {
        int[] nums = {-89, 6, 10, 13, 15 , 17, 19, 102};
        int target = 102;

        System.out.println(binarySearch(nums, target));
    }

    static int binarySearch(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
