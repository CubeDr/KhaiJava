package learning;

// learning.Instances
public class Instances {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass(10);


        sc.setA(20); // success
        sc.setA(1000); // ignored: out of range


        SampleClass sc2 = new SampleClass(50);

        // 20 50
        swap(sc, sc2);
        // 50 20
        swap2(sc, sc2);
        // 50 20

        System.out.println(sc.getA());
        System.out.println(sc2.getA());

    }

    public static void swap(SampleClass v1, SampleClass v2) {
        int a1 = v1.getA();
        int a2 = v2.getA();

        v1.setA(a2);
        v2.setA(a1);
    }


    // java handles instances as a pointer
    // call by value
    public static void swap2(SampleClass v1, SampleClass v2) {
        SampleClass t = v1;
        v1 = v2;
        v2 = t;
    }
}
