public class Student {
    String name;
    int age;
    String course;
    double g1, g2, g3;

    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.g1 = grade1;
        this.g2 = grade2;
        this.g3 = grade3;
    }

    public void UnsayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + g1 + ", " + g2 + ", " + g3);
        System.out.printf("Average: %.2f\n", UnsayAverage());
        System.out.println("Letter Grade: " + UnsayLetterGrade());
        System.out.println("Status: " + (PasarBa() ? "PASSING\n" : "FAILING"));

    }

    public double UnsayAverage() {
        return (g1 + g2 + g3) / 3;
    }

    public String UnsayLetterGrade() {
        double avg = UnsayAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public boolean PasarBa() {
        return UnsayAverage() >= 70;
    }
}