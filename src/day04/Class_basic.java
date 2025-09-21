package day04;

class Student {
    String name;
    int score;
}


public class Class_basic {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "이승기";
        s.score = 100;
        System.out.println(s.name + "의 점수는"+s.score);
    }
}
