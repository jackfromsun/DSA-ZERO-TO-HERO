import java.util.ArrayList;
import java.util.List;

public class findAllduplicateCycle {
    public static void main(String[] args) {
        int[] arr = {5, 2, 2, 4,4, 3, 1};
        System.out.println(duplicate(arr));

    }
    static List<Integer> duplicate(int[] arr)
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

    List<Integer> ans =new ArrayList<>();
        for (int index =0; index<arr.length; index++)
    {
        if (arr[index]!= index+1)
        {
            ans.add(arr[index]);
        }
    }
        return ans;
}
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
