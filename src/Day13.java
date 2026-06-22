import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day13 {


    /*static void main() {
        Path path = Path.of("files", "report.txt");
        try {
            List<String> data = Files.readAllLines(path);

            for (String line : data) {
                System.out.println(line);
            }
            List<String> newData = new ArrayList<>();
            newData.add("orange");
            newData.add("mango");
            newData.add("grapes");
            newData.add("apple");
            newData.add("jamun");

            Files.write(path,newData);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}

*/

    static void main() {
        Path path = Path.of("files", "students.csv");
        try {
            List<String> students = Files.readAllLines(path);

            for (String line : students) {
                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " | ");
                }
                System.out.println();
            }
        } catch (IOException io) {

            io.printStackTrace();
        }
    }
}

