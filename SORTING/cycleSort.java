import java.util.Arrays;
public class cycleSort {
    public static void main(String[] args) {
        int [] arr = {5,3,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int current = arr[i]-1;
            if (arr[i]!=arr[current])
            {
                swap(arr,i,current);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
