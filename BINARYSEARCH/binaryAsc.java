public class binaryWithSort {
    public static void main(String[] args) {
        int [] arr = {75,45,50,30,15,7,5,2};
        int target = 7;
        int ans = binary(arr,target);
        System.out.println(ans);
    }
    static int binary(int[] arr,int target)
    {
        int left = 0;
        int right = arr.length-1;
        boolean isasc = arr[left] < arr[right];
         while(left<=right)
         {
             int mid = left+(right-left)/2;
             if (arr[mid]==target)
             {
                 return mid;
             }
             if (isasc)
             {
                 if (target < arr[mid])
                 {
                     right=mid-1;
                 }
                 else
                 {
                     left = mid+1;
                 }
             }
             else
             {
                 if (target > arr[mid])
                 {
                     right=mid-1;
                 }
                 else
                 {
                     left = mid+1;
                 }
             }
         }
        return -1;
    }
}
