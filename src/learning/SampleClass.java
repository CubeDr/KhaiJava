package learning;

public class SampleClass {
    // constraint: a >= 0 && a <= 100
    private int a;

    // sub constructor
    public SampleClass() {
        this(0); // this call at the first line of constructor: call to my other constructor
    }

    // main constructor
    public SampleClass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(a < 0 || a > 100) return;;

        this.a = a;
    }
}
