
// import java.util.List;
import java.util.Stack;

public class list {
    public static void main(String[] args) {
        Stack<Integer> lt = new Stack<>();
        lt.add(23);
        lt.add(24);
        lt.add(25);
        lt.add(26);
        lt.pop();
        System.out.println(lt.size());
        // System.out.println("print ArrayList : " + lt);
        // List<Integer> lt2 = new ArrayList<>();
        // lt2.add(20);
        // lt2.add(19);
        // lt2.add(18);
        // lt2.add(17);
        // System.out.println("print ArrayList 2 : " + lt2);
        // lt.addAll(lt2);
        // System.out.println("print merge arraylist : " + lt);
        // lt.removeFirst();//it remove the first index ellement of lt(list)
        // System.out.println(lt);
        // lt.add(3,80);//list ke 3 index pe 80 value add karega
        lt.contains(2);
        System.out.println(lt);

    }
}