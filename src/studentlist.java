import java.util.LinkedList;

public class studentlist {



        static class Student {
            String name;
            int regNo;
            int marks;

            Student(String name, int regNo, int marks) {
                this.name = name;
                this.regNo = regNo;
                this.marks = marks;
            }
        }

        static void removeStudent(LinkedList<Student> students) {
            System.out.println("Removed : " + students.removeFirst().name);
        }

        static void updateStudent(LinkedList<Student> students) {
            for (Student s : students) {
                if (s.name.equals("104")) {
                    s.marks = 95; // Update marks from 85 to 95
                }
            }
        }

        public static void main(String[] args) {

            LinkedList<Student> students = new LinkedList<>();

            // Add 5 Students
            students.add(new Student("anu",    01, 80));
            students.add(new Student("abi",    02, 75));
            students.add(new Student("lisa",   03, 90));
            students.add(new Student("vaani",  04, 85));
            students.add(new Student("maya",   05, 88));

            // Remove 1 Student
            removeStudent(students);

            // Update 1 Student
            updateStudent(students);

            // Display Students
            System.out.println("\nStudent Details");
            for (Student s : students) {
                System.out.println(
                                s.name     + " " +
                                s.regNo    + " " +
                                s.marks
                );
            }
        }
    }


