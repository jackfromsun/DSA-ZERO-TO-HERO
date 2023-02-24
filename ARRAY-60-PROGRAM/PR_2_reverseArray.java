import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
      rev(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    static void rev(int[] myArray)
    {
        int start = 0;
        int end = myArray.length-1;
      while(start<end)
        {
     swap(myArray,start,end);
     start++;
     end--;
        }
    }
        static void swap(int[] myArray,int i,int j)
        {
            int temp = myArray[i];
            myArray[i]=myArray[j];
            myArray[j]=temp;
        }
    }
