import java.util.Scanner;


public class SumMul {
    static int newNumber;
    public static void main (String[]args)
    {
        System.out.println("input:");
        Scanner inputNumber = new Scanner(System.in);
        int newNumber=inputNumber.nextInt();

        System.out.println();
        int[] newArray= new int[newNumber];
        for (int i=0; i<newNumber; i++ ){
            Scanner input = new Scanner(System.in);
            newArray[i]=input.nextInt();
            //System.out.print(newArray[i]);
        }
        System.out.println("output: ");
        int sum = 0;
        for(int i=0; i<newArray.length; i++)
            sum=sum + newArray[i];

        System.out.print(sum);

        int mult = 1;
        for(int i=0; i<newArray.length; i++)
            mult=mult*newArray[i];

        System.out.print(" "+mult);


    }
}
