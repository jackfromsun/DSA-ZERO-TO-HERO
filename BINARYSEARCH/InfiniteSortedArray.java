public class infiniteSorted {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,15,20,23,30};
        int target =11;
        System.out.println(searchInfiniteArray(arr,target));

    }
    public static int searchInfiniteArray(int[] arr, int target) {
        int left = 0;
        int right = 1;

        // find the boundaries of the array
        while (arr[right] < target) {
            left = right;
            right *= 2;
        }

        // perform binary search within the boundaries
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // target not found
        return -1;
    }
}
