public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "BSIT", 85.0, 90.0, 88.0);
        Student s2 = new Student("Bob", 19, "BSCS", 92.0, 95.0, 89.0);
        Student s3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        Student[] students = {s1, s2, s3};
        int PilayNakapasar = 0;

        System.out.println("\nStudent Information:");

        for (Student HEHE : students) {
            HEHE.UnsayInfo();
            if (HEHE.PasarBa()) {
                PilayNakapasar++;
            }
        }

        System.out.println("\nSummary: " + PilayNakapasar + " out of 3 students are passing.");
    }
}
