public class Day6 {
    static class student {
        String name;
        int regno;
        String dept;

        student() {
            System.out.println("Constructor called");
        }

        student(String name, int regno, String dept) {
            this.name = name;
            this.regno = regno;
            this.dept = dept;
        }
      void printDetails(){
            System.out.println("Name: "+name);
            System.out.println("Regno: "+regno);
            System.out.println("Dept: "+dept);

        }
        public static void main(String[]args){

        }
    }
}