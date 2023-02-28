import java.util.Arrays;

public class maxvalue2d {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2},
                {3,4},
                {5,6,7},
                {9,12,19}
        };

        int[] ans =max(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            for (int j=0; j<arr[i].length;j++)
            {
                if (arr[i][j]>max)
                {
                    max = arr[i][j];
                }
            }
        }
        return new int[]{max};
    }
}
