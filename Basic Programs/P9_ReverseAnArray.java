import java.util.Arrays;

public class P9_ReverseAnArray {
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 7, 9, 11};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            swap(arr, start, end);

            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}