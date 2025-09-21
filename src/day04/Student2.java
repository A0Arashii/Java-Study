package day04;

// 클래스 선언
public class Student2 {
    //필드 , 멤버 변수
    private final String name;
    private int score;

    //생성자
    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    //getter method : 필드가 private라서 외부에서 접근 불가, 그러나 값은 읽어올 수 있음
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // setter method
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return name + "(" + score + ")";
    }
}

