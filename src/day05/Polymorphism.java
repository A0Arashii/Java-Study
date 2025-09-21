package day05;

import java.util.*;

public class Polymorphism {
    public static void main(String[] args) {
        List<Parents> people = new ArrayList<>();
        people.add(new Childs("승기", 21, 95));
        people.add(new Teacher("미나", 40, "수학"));
        people.add(new Parents("켄", 33));

        for (Parents p : people) {
            p.introduce();
        }

        for (Parents p : people) {
            if (p instanceof Childs) {
                Childs c = (Childs) p;
                c.study();
            } else if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                System.out.println(t.name + " 선생님 과목: "+t.subjects);
            }
        }
    }
}
