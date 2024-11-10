public class Lesson {
    public static void main(String[] args) throws Exception {
      System.out.println("Hello, World!");
      char grade = 'A';
      switch (grade) {
         case 'A':
            System.out.println("Congratulations!");    
         case 'B':
            System.out.println("Good work");
         case 'C':
            System.out.println("Average");
         case 'D':
            System.out.println("Barely passing");
         case 'F':
            System.out.println("Failed");
      }
    }
}
