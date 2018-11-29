import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        String str;

        Scanner in = new Scanner(System.in);
        str = in.next();
        char[] carr = str.toCharArray();

        // adslf;ajsdfl;kasjefoiasdjflkasdfja;lksdfjadsf
        /*
        sldakfjasdf // 0

        ad;liv;asdf // 1

        sdal;fkjasd // 2

        sdalfj;asdf // 3
        sdfla;kjsda // 4

        ads
         */
        for(int row=0; row < carr.length/10; row++) {
            for (int i = 0; i < 10; i++)
                System.out.print(carr[row * 10 + i]);
            System.out.println();
        }

        if(carr.length % 10 != 0)
            // 53 -> 5 -> 50
            for(int i= (carr.length/10)*10; i<carr.length; i++)
                System.out.print(carr[i]);
    }
}
