package abc;

public class Calc {

    private static int z;

    static {
        System.out.println("in static block");
        z = 10;
    }

    private int x;
    private  int y;


    public Calc(int x, int y) {
        System.out.println("end constructor");
        this.x = x;
        this.y = y;
    }




    public void sum(int a, int b) {
        System.out.println(a+b);
    }


    public void sum(int c, float d) {
        System.out.println(c+d);
    }
}
