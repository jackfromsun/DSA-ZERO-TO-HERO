public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6};
        findRepeatAndMissingNumber(arr);
    }

   static void findRepeatAndMissingNumber(int[] arr) {
        int n = arr.length;
        int repeat = 0, missing = 0;

        // Find the repeating and missing numbers using XOR operator
        int xor = arr[0];
        for (int i = 1; i < n; i++) {
            xor ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // Find the rightmost set bit of xor
        int rightmostSetBit = xor & ~(xor - 1);

        // Divide the numbers into two groups based on the rightmost set bit
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & rightmostSetBit) != 0) {
                x ^= arr[i];
            } else {
                y ^= arr[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                x ^= i;
            } else {
                y ^= i;
            }
        }

        // Check which number is missing and which is repeating
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                repeat = x;
                missing = y;
                break;
            } else if (arr[i] == y) {
                repeat = y;
                missing = x;
                break;
            }
        }

        System.out.println("Repeat number is " + repeat + " and Missing number is " + missing);
    }
}
