public class Q852_Peak_Index_in_a_MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};

        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}