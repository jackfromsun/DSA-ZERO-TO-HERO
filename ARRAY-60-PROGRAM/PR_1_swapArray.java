import java.util.Arrays;

public class swap {
    static void swap(int[] myArray,int i,int j)
    {
     int temp = myArray[i];
     myArray[i]=myArray[j];
     myArray[j]=temp;
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        swap(myArray,0,4);
        System.out.println(Arrays.toString(myArray));
    }
}

