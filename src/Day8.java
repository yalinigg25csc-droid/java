 public  class Day8 {

   /* interface Employee {
        String Name();
        String id();
        String Salary();
    }

    static class BankEmployee implements Employee {

        @Override
        public String Name() {
            return "shree";
        }

        @Override
        public String id() {
            return "105";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }

    static class CheckingEmployee implements Employee {

        @Override
        public String Name() {
            return "SHREE";
        }

        @Override
        public String id() {
            return "102";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String work() {
            System.out.println("process");
            return "process";
        }
    }

    public static void main(String[] args) {

        BankEmployee bank = new BankEmployee();

        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.Salary());
        bank.solveprogram();

        System.out.println();

        CheckingEmployee checking = new CheckingEmployee();

        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.Salary());
        checking.work();
    }
}
*/

     record Coursevetrecord(String course_name, String dept) {

     }

     static void main() {
         Coursevetrecord coursevet = new Coursevetrecord("PYTHON","CS");
         System.out.println(coursevet.course_name);
         System.out.println(coursevet.dept);
     }
 }


