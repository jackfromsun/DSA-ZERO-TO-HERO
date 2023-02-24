public class sum {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(sum(arr,0));
    }
    static int sum(int[] arr,int summ)
    {

        for (int i = 0; i<arr.length;i++)
        {
            summ=summ+arr[i];
        }
       return summ;
    }
}
