public class Q162_Find_Peak_Element {
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(findPeakElement(nums));  // will print peak element's index
    }
    
    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[mid + 1]) {
                // you're in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }
            else {
                // you're in asc part of an array
                start = mid + 1;    // because we know that mid + 1 element  > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible ans till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that the best possible ans
        return start;// or return and as both are =
    }
}
