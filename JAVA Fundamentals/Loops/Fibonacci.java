import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0, b =1;
        int count = 3;

        while(count <= n){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b);


    }
}
