import java.util.*;
public class choco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();

        int[] chocs = new int[n];
        System.out.println("Enter the chocolate requirements of each person:");
        for (int i = 0; i < n; i++) {
            chocs[i] = sc.nextInt();
        }

        System.out.print("Enter the number of chocolates: ");
        int m = sc.nextInt();

        Arrays.sort(chocs); // sort the requirements array

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int diff = chocs[i + m - 1] - chocs[i]; // calculate the difference
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println("Minimum difference between maximum and minimum amount of chocolate distributed: " + minDiff);
    }

}
