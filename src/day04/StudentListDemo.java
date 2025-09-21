package day04;

import java.util.*;

public class StudentListDemo {
    public static void main(String[] args){
        List<Student2> students = new ArrayList<>(
                List.of(
                        new Student2("승기", 98),
                        new Student2("tina", 88),
                        new Student2("peter", 72)
                )
        );

        for (Student2 s:students) {
            System.out.println(s.getName() + ": " + s.getScore());
        }
        int sum = 0;
        Student2 top = students.get(0);
        for (Student2 s: students){
            sum += s.getScore();
            if (s.getScore() > top.getScore()) top = s;
        }

        double avg = (double)sum / students.size();
        System.out.println("합계=" + sum + ", 평균=" + avg
                + ", 최고=" + top.getName() + "(" + top.getScore() + ")");

        students.add(new Student2("yuki", 94));
        students.get(0).setScore(97);

        students.sort(Comparator.comparingInt(Student2::getScore).reversed());
        System.out.println("점수 내림차순: " + students);

    }
}
