public class Day7 {
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
}
