public class Kat {
    // int a = 20;// instance variable

    // void m1() {
    // // instancemethod and instance area
    // System.out.println(a);
    // }

    // void disp() {
    // // instance nethod and instance area
    // m1();
    // }

    // public static void main() {
    // // static method and static area
    // Kat k = new Kat();
    // // System.out.println(a); erroe we are directly trying acc of instance
    // variable
    // // in static area
    // k.disp();
    // System.out.println(k.a);
    // }

    // }
    static int a = 30;// static variable

    static void m1() {
        System.out.println("hii");
    }

    void disp() {
        // instance method and instance area
        Kat k1 = new Kat();
        System.out.println(a);
        System.out.println(k1.a);
        System.out.println(Kat.a);
        m1();
        k1.m1();
        Kat.m1();

    }

    static void show() {
        // static method and static area
        Kat k3 = new Kat();
        System.out.println(a);
        System.out.println(k3.a);
        System.out.println(Kat.a);
        k3.m1();
        Kat.m1();

    }

    public static void main(String[] args) {
        // static method and staic area
        Kat k = new Kat();
        k.disp();
        System.out.println("--show--");
        k.show();
    }
}