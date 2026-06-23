public class Day15 {
    static void main() throws InterruptedException {
        Runnable chefTask = () -> {
            String[] items = {"Brownie", "Italian chocochip icecream", "French Fries"};
            for (int i = 0; i < items.length; i++) {
                System.out.println("Preparing orders:" + items[i]);
                try {
                    Thread.sleep(10000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread chefThread = new Thread(chefTask, "chef-thread");
        chefThread.start();
        chefThread.join();
    }


}
