package day05;

// 부모 클래스
class Parents {
    String name;
    int age;

    Parents(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("hello my name is "+name+" and im "+age+"years old");
    }
}

// 자식 클래스
class Childs extends Parents {
    int score;

    Childs(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    void study() {
        System.out.println(name + " is studying now... score is " + score);
    }
}


public class Inheritance {
    public static void main(String[] args){
        Childs s = new Childs("Lee", 21, 98);
        s.introduce();
        s.study();
    }
}

/*

[접근제어자] [static여부] [반환타입] 메서드이름(매개변수들..) {...}

public      static      void
private                 int
protected               string
default                 ...

 */