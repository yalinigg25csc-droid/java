public class Day14 {
    static class Student {
            String name;
            int age;
            int regNo;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regNo = builder.regNo;
        }
        static class Builder {
            public String name;
            public int age;
            public int regNo;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }
            public Builder age(int ageValue) {
                this.age = ageValue;
                return this;
            }
            public Builder regNo(int regNoValue) {
                this.regNo = regNoValue;
                return this;
            }
            public Student build() {
                return new Student(this);
            }


        }
    }

    static void main() {
        // Student student = new Student("John",23, 425235, "21-12-5555",);
        Student student = new Student.Builder()
                .name("yalini")
                .age(18)
                .regNo(66)
                .build();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.regNo);

}
        }

