import java.util.*;

public class TestClass {

    static int countBits(int n){
        return Integer.bitCount(n);
    }

    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  

        while(t-- > 0){

            int n = sc.nextInt();

            Integer[] arr = new Integer[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr, (a,b) -> {

                int pa = countBits(a) % 2;
                int pb = countBits(b) % 2;

                if(pa != pb)
                    return pa - pb;

                return a - b;
            });

            for(int x : arr){
                System.out.print(x + " ");
            }

            System.out.println();
        }
    }
}
