import java.util.Scanner;

class sum_of_two_digits{
    static int sum_of_digits(int a, int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum_of_digits(a, b));
        sc.close();
    }
}
