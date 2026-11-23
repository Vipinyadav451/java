package college;

class student {
   static void getstudent() {
      System.out.println("student is studying");
   }
}

class teacher {
   static void getteacher() {
      System.out.println("teacher is teaching");
   }
}

public class pack {
   public static void main() {
      student.getstudent();
      teacher.getteacher();
   }
}
