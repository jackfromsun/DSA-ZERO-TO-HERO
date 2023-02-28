public class evendigit {
    public static void main(String[] args) {
        int[] arr ={12,55,478,88993,2};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int [] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
  return count;
    }
// check num contains even or odd
     static boolean even(int num) {
        int numbersofdigits = digits(num);
       return numbersofdigits % 2 == 0;
    }
    static int digits(int num )
    {
       int count = 0;
       while(num>0)
       {
           count++;
           num = num/10;

       }
        return count;
    }
}

