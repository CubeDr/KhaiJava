import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("number of minimum moves required to move " + n + " disks : " + hanoi(n));
    }

    // hanoi(n) : number of minimum moves required to move n disks
    // 1. move (n-1) disks to an empty pole => hanoi(n-1)
    // 2. move 1 disk to target pole => 1
    // 3. move (n-1) disks from an empty pole to the target pole => hanoi(n-1)
    // return (1) + (2) + (3)
    public static int hanoi(int n) {
        // closing condition
        if(n<2) return -1;
        if(n==2) return 3;
        return 2*hanoi(n-1) + 1; // r-formula
    }
}
