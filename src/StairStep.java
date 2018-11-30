import java.util.Scanner;

public class StairStep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("minimum moves required to go up " + n + " stairs : " + stairStep(n));
    }
    public static int fibo(int n) {
        if(n==1 || n==2) return 1; // closing condition
        return fibo(n-1) + fibo(n-2); // recursive formula
    }

    public static int stairStep(int n) {
        // closing condition
        return fibo(n+1); // r-formula
    }

}