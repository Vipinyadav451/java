// student name ki class 
public class Student {
    // private ka matalab name ko class ke bahar directly acces nahi kiya ja sakata
    // hai
    private String name;

    // age bhi private hai to bhi acces directly nahi hogi
    private int age;

    // setter method name , ki value ko set ya change kar sakta hai
    public void setName(String name) {
        // 'this.name' class ka vairiable hai
        // ' name method ka parameter hai
        // means parameter ki value clas ke variableme store ho rahi hai
        this.name = name;
    }

    // getter method name ki value ko return karega
    public String getName() {
        return name;

    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("invailid age");
        }
        // this.age=age;
    }

    public int getage() {

        return age;
    }

    public static void main(String[] args) {
        // student class ka s1 object create kar rahe hai
        Student s1 = new Student();
        // calling setName() method
        s1.setName("vipin");
        System.out.println("name " + s1.getName());
        s1.setAge(60);
        System.out.println("age " + s1.getage());
    }
}
