import java.util.Arrays;

public class firstAndlast {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target =8;
        int[] ans = firstNlast(arr,target);
        System.out.println(Arrays.toString(ans));

    }

     static int[] firstNlast(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = seearch(arr,target,true);
        int end = seearch(arr,target,false);
        ans[0]=start;
        ans[1]= end;
        return ans;
    }

     static int seearch(int[] arr, int target, boolean findstartindex) {
        int ans = -1;
        int[] rt = {-1, -1};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //  int mid =(start+end)/2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
               ans = mid ;
               if (findstartindex == true)
               {
                   end = mid -1;
               }
               else {
                   start = mid+1;
               }
            }
        }
        return ans;
    }
}
