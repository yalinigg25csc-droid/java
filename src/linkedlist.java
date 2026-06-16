import java.util.LinkedList;

public class linkedlist {

        static void main() {
            LinkedList<String> queue = new LinkedList<String>();
            queue.add("ram");
            queue.add("ravi");
            queue.add("ragu");
            queue.add("raamu");
            queue.add("zen");
            while(!queue.isEmpty()) {
                process(queue);
            }
        }
        static void process(LinkedList<String> queue){
            String removed=queue.removeFirst();
            System.out.println("Removed:"+removed);

        }
    }
