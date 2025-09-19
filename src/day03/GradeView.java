package day03;

import java.util.*;

public class GradeView {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(70,85,90,45,100,95,88));

        Collections.sort(scores);
        System.out.println("오름차순: "+scores);

        Collections.sort(scores);
        System.out.println("내림차순: "+scores);

        int top = Math.min(3,scores.size());
        System.out.println("Top" + top + ": "+scores.subList(0,top));
    }
}
