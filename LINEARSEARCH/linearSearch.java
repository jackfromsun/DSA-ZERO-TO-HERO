public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {14, 25, 89, 96, 17};
        int key = 89;
        int ans = linear(arr,key);
        System.out.println(ans);
    }

    static int linear(int[] arr,int key)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for (int i=0;i<arr.length;i++)
        {
            int element = arr[i];
            if (element==key)
            {
                return i;
            }
        }
        return -1;
    }
}
