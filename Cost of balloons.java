import java.util.*;

public class TestClass {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   // test cases

        while(t-- > 0){

            int green = sc.nextInt();
            int purple = sc.nextInt();

            int n = sc.nextInt();

            int p1 = 0;
            int p2 = 0;

            for(int i = 0; i < n; i++){

                int a = sc.nextInt();
                int b = sc.nextInt();

                p1 += a;
                p2 += b;
            }

            int cost1 = p1 * green + p2 * purple;
            int cost2 = p1 * purple + p2 * green;

            System.out.println(Math.min(cost1, cost2));
        }
    }
}
