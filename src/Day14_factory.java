public class Day14_factory {
    interface Notification {
        void send(String to, String message);
    }

    class EmailNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("sending email:" + message + ",to " + to);

        }
    }

    class WhatsappNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("sending through whatsapp:" + message + ",to " + to);
        }
    }

    static Notification getNotification(Day14_factory day14_factory, String type) {
        return switch (type) {
            case "email" -> day14_factory.new EmailNotification();
            case "whatsapp" -> day14_factory.new WhatsappNotification();
            default -> throw new IllegalArgumentException("Invalid notification type" + type);
        };
    }
    static void main(){
        Day14_factory factory = new Day14_factory();
      //  String type ="whatsapp";
       // getNotification(factory,type).send("770890","HII");
        String type ="email";
        getNotification(factory,type).send("dyro04@mail.com", "hii");
    }
}





