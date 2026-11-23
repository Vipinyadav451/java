public class me {
    int a = 5;// instance variable

    void getsame() {
        // int b ;
        // System.out.println(b);it gave compile time error because local variable could
        // not gave default value
        System.out.println(a);// it gives us default value because if i could not intialize instance variable
    }

    void getlocal() {
        int a = 23;// yaha pe local variable ko jyada priority milegi comprision than instance
                   // variable
        System.out.println(a);
        if (true) {
            int b = 9;
        }
    }

    static void main(String[] args) {
        // instane method ko diractly static method me call nahi kar sakate uske liye
        // hame usng class name hame object bana hoga

        me s = new me();
        s.getlocal();

        s.getsame();// call the instance method
        System.out.println(s.a);
    }
}