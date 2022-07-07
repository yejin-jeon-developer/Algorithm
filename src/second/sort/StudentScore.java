package second.sort;

import java.util.*;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String name = s.split(" ")[0];
            int score = Integer.parseInt(s.split(" ")[1]);
            students.add(new Student(score, name));
        }

        Collections.sort(students, (o1, o2) -> o1.getScore() - o2.getScore());

        for (Student s : students) {
            System.out.print(s.getName() + " ");
        }
    }

    public static class Student {
        private int score;
        private String name;

        public int getScore() {
            return score;
        }

        public Student(int score, String name) {
            this.score = score;
            this.name = name;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
