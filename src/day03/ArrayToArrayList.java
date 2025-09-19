package day03;

import java.util.*;


public class ArrayToArrayList {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(70,84,90,45,100));

        int sum = 0, max = scores.get(0);
        for (int s : scores) {
            sum += s;
            if (s>max) max = s;
        }
        double avg = (double) sum / scores.size();

        System.out.println("합계=" + sum + ", 평균=" + avg + ", 최고=" + max);
    }

}
