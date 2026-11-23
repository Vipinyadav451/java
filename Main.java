// abstract class Bird {
//     abstract void fly();

//     abstract void makeSound();
// }

// class sparrow extends Bird {
//     void fly() {
//         System.out.println("Sparrow can fly");
//     }

//     void makeSound() {
//         System.out.println("Sparrow makes a chirping sound");
//     }

// }

// class crow extends Bird {
//     void fly() {
//         System.out.println("Crow can fly");
//     }

//     void makeSound() {
//         System.out.println("Crow makes a cawing sound");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Bird b1 = new sparrow();
//         Bird b2 = new crow();
//         // void fly() {
//         // System.out.println("Anonymous bird can fly");
//         // }

//         // void makeSound() {
//         // System.out.println("Anonymous bird makes a sound");
//         // }
//         // };
//         b1.fly();
//         b1.makeSound();
//         b2.fly();
//         b2.makeSound();
//     }
// }/**
interface Bird {
    void fly();

    void eat();

}

class sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow can fly");
    }

    public void eat() {
        System.out.println("Sparrow eats seeds");
    }
}

class crow implements Bird {
    public void fly() {
        System.out.println("Crow can fly");
    }

    public void eat() {
        System.out.println("Crow eats insects");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b1 = new sparrow();
        Bird b2 = new crow();
        b1.fly();
        b1.eat();
        b2.fly();
        b2.eat();
    }
}