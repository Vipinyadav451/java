// //exception is unexpected/unwanted/abnormal situation occur at run time 
// //   
// public class exception {
//     static void main(String[] args) {
//         System.out.println("main method started");
//         int a = 10, b = 0, c;
//         try {
//             c = a / b;
//             System.out.println(c);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         System.out.println("main method ended");
//     }

// }
public class exception {
    static void getexception() {
        int a = 10, b = 0, c;
        System.out.println("start method");
        try {
            try {
                String str = "null";
                System.out.println(str.toUpperCase());
            } catch (Exception o) {
                System.out.println(o);
            }

            System.out.println("hello vipin");
            c = a / b;
            System.out.println(c);
            System.out.println("sum is:" + a + b);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("bye vipin");
    }

    static void main(String[] args) {
        getexception();
    }

}