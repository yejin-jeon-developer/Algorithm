package yjjeon.study.code.book.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int m;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.m = math;
    }

    @Override
    public int compareTo(Student other) {
        if (this.kor == other.kor && this.eng == other.eng && this.m == other.m) {
            return this.name.compareTo(other.name);
        }
        if (this.kor == other.kor && this.eng == other.eng) {
            return Integer.compare(other.m, this.m);
        }
        if (this.kor == other.kor) {
            return Integer.compare(this.eng, other.eng);
        }
        return Integer.compare(other.kor, this.kor);
    }
}
/*
Junkyu 50 60 100
Sangkeun 80 60 50
Sunyoung 80 70 100
Soong 50 60 90
Haebin 50 60 100
Kangsoo 60 80 100
Donghy 80 60 100
Sei 70 70 70
Wonseob 70 70 90
Sanghyun 70 70 80
nsj 80 80 80
Taewhan 50 60 90
 */

public class StudentScore {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            students.add(new Student(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3])));
        }

        Collections.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i).name);
        }

    }
}
