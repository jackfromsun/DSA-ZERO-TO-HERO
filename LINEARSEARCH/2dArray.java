import java.util.Arrays;
public class d2array {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2},
                {3,4},
                {5,6,7},
                {9,12,19}
        };
        int target = 2;
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target)
    {
        for (int i=0;i< arr.length;i++)
        {
            for (int j=0; j<arr[i].length;j++)
            {
                if (arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
