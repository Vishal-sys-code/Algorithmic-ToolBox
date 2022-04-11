import java.util.Arrays;
import java.util.Scanner;

public class maximum_pairwise_product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;++i){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[n-1] * array[n-2]);
        sc.close();
    }
}
