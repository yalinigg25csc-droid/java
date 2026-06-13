/*public class Day7 {
     static class Payment {
        String amount;

        void transfer() {
            System.out.println("Made a transfer");
        }
    }

    static class UPIPayment extends Payment {
        @Override
        void transfer() {
            System.out.println("TRANSFER IS MADE");
        }
    }


    static class CardPayment extends Payment {
        @Override
        void transfer() {
            System.out.println("TRANSFER IS MADE");
        }
    }
    }

    static class NBPayment extends Payment {
        @Override
        void transfer() {
            System.out.println("TRANSFER IS MADE");
        }
    }
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.transfer();

        CardPayment card = new CardPayment();
        card.transfer();

        NBPayment nb = new NBPayment();
        nb.transfer();
    }
*/
public class Day7 {

    interface Employee {

        String name = "xyz";
        String id = "12345";
        String salary = "50_000";


        String name();
    }

    void solveproblem() {
        System.out.println("solving the problem");

    }

    void work() {
        System.out.println("working");
    }

    static class BankEmployee implements Employee {

        @Override
        public String name() {
            System.out.println("name : " + name);
            System.out.println("id : " + id);
            System.out.println("salary : " + salary);

            return "";
        }
    }
        static class CheckingEmployee implements Employee {
            @Override
            public String name() {
                System.out.println("name : " + name);
                System.out.println("id : " + id);
                System.out.println("salary : " + salary);
                return "";

            }
        }

            static void main() {
                BankEmployee Bank = new BankEmployee();
                Bank.name();

                CheckingEmployee check = new CheckingEmployee();
                check.name();

            }
    }


