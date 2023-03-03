public class stringSmallestletter {
    public static void main(String[] args) {
        char [] arr = {'c','d','e'};
        char target = 'a';
        char ans = findSmallestLetterGreaterThanTarget(arr,target);
        System.out.println(ans);
    }
    static char findSmallestLetterGreaterThanTarget(char[] letters, char target) {
        int n = letters.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // At this point, left points to the index of the first element in the array
        // that is greater than the target, or n if no such element exists.
        return letters[left % n];
    }
}
