package day05;

class Teacher extends Parents {
    String subjects;

    Teacher(String name, int age, String subjects){
        super(name, age);
        this.subjects = subjects;
    }

    @Override
    void introduce() {
        System.out.println("저는 " + subjects + " 선생님 " + name + "입니다.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parents p1 = new Parents("normal person", 30);
        Parents p2 = new Childs("steve", 24, 98);
        Parents p3 = new Teacher("sam", 34, "mathematics");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
