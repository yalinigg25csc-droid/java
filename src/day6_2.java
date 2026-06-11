
public class day6_2 {

    static class Students {
        String name;
        int regNo;
        String department;
        int mathsMarks;
        int phyMarks;
        int csemarks;

        Students(String name, int regNo, String department,
                 int mathsMarks, int phyMarks, int csemarks) {

            this.name = name;
            this.regNo = regNo;      // Fixed
            this.department = department;
            this.mathsMarks = mathsMarks;
            this.phyMarks = phyMarks;
            this.csemarks = csemarks;
        }

        void printDetails() {
            System.out.println("Name: " + name);
            System.out.println("RegNo: " + regNo);
            System.out.println("Department: " + department);
            System.out.println("Maths Marks: " + mathsMarks);
            System.out.println("Physics Marks: " + phyMarks);
            System.out.println("CSE Marks: " + csemarks);
        }
    }

    public static void main(String[] args) {
        Students student1 = new Students("yalini", 63, "cs", 67, 80, 90);
        student1.printDetails();
    }
}