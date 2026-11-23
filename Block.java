public class Block {
    {
        System.out.println("tit bhopal ");
    }

    Block(int id, String name) {
        System.out.println("id" + "  " + "name   ");
    }

    static void main(String[] args) {
        Block b = new Block(1, "vipin");// constructer se pahale instance block and variable execute hota hai at the
        // time of object cration
        // System.out.println(b.a + " " + " " + b.b);

    }
}