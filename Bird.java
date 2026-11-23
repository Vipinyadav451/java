
/**
 * Bird
 */
import college.student;

interface bird {
    void fly();

    void eat();

}

class sparrow implements bird {
    public void fly() {
        System.out.println("Sparrow can fly");
    }

    public void eat() {
        System.out.println("Sparrow eats seeds");
    }
}

class crow implements bird {
    public void fly() {
        System.out.println("Crow can fly");
    }

    public void eat() {
        System.out.println("Crow eats insects");
    }
}

public class Bird {

    public static void main(String[] args) {
        bird b1 = new sparrow();
        bird b2 = new crow();
        b1.fly();
        b1.eat();
        b2.fly();
        b2.eat();
    }
}
