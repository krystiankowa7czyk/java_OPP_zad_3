package B2;

public class MojaKlasa implements PierwszyInterfejs, DrugiInterfejs {
    public void f(int arg) {
        System.out.println("f z argumentem int: " + arg);
    }

    public void f(double arg) {
        System.out.println("f z argumentem double: " + arg);
    }
}