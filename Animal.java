import java.util.*;
// //funcction /methods overloading
// public class poly {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     static void main(String[] args) {
//         poly c = new poly();
//         System.out.println(c.add(2, 3));
//         System.out.println(c.add(3, 4, 4));
//     }
// }
// run time polymorphism
public class Animal {
    void sound() {
        System.out.println("Animals are make sound");
    }

    class dogs extends Animal {
        // @Override
        void sound() {
            System.out.println("dog barks");
        }
    }

    class cat extends Animal {
        // @Override
        void sound() {
            System.out.println("cat meaws");
        }
    }

    public static void main(String[] args) {
        Animal a1 = new dogs();
        //// cat a2 = new cat();
        a1.sound();
        // a2.sound();

    }

}
