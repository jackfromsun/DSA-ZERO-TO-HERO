public class small {
    public static int getSmallest(int[] a){
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
    public static void main(String[] args){
        int[] a ={5,4,3,2,1};
        System.out.println("Smallest: "+getSmallest(a));

    }
}
