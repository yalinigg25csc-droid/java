
import java.util.ArrayList;

public class Day10 {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("ram");
        list.add("ravi");
        list.add("ragu");
        list.add("sita");
        list.add("radha");
        for (String s : list) {
            System.out.println( s);
        }
        list.remove("ram");
        for (String s : list) {
            System.out.println(s);
        }
    }
}