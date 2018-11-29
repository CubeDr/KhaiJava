import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + "th fibonacci number is " + fibo(n));
    }
    public static int fibo(int n) {
        if(n==1 || n==2) return 1; // closing condition
        return fibo(n-1) + fibo(n-2); // recursive formula
    }
}

/* f(5) = f(4) + f(3) = 5
    f(4) = f(3) + f(2) = 3
    f(3) = f(2) + f(1) = 2
    f(2) = 1
    f(1) = 1
*/