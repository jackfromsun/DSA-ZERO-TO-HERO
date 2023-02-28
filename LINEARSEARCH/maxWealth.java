public class maxwealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {8,1},
                {9,5}
        };
        System.out.println(maxw(arr));
    }
    static int maxw(int[][] arr)
    {
        int ans = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++)
        {
            int isum=0;
            for (int j=0;j<arr[i].length; j++)
            {
                isum += arr[i][j];
            }
            if (isum > ans)
            {
                ans= isum;
            }
        }
        return ans;
    }
}
