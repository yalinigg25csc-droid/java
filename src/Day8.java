
     public class Day8 {
         record Coursevetrecord(String course_name, String dept) {

         }

         static void main() {

             Coursevetrecord coursevet = new Coursevetrecord("PYTHON", "CS");
             System.out.println(coursevet.course_name);
             System.out.println(coursevet.dept);
         }
     }


