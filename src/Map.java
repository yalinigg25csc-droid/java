import java.util.HashMap;

public class Map {



        public static void main(String[] args) {
            java.util.Map<String, Integer> mark = new HashMap<>();
            mark.put("ram", 100);
            mark.put("ravi", 99);
            mark.put("ragu", 98);
            mark.put("sam", 89);
            System.out.println(mark.get("percent"));
            mark.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            });
        }
    }
