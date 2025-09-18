package day02;

public class Mini_training {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 45, 100};

        int sum = 0, max = scores[0]; // 같은 타입 변수라면 ,로 연결 가능
        for (int s : scores) {
            sum += s;
            if (s > max) max = s;
        }

        // (double) 변수 : 변수 타입을 실수형으로 변경
        double avg = (double) sum / scores.length;

        System.out.println("전체 합 = " + sum);
        System.out.println("평균 = " + avg);
        System.out.println("최고점 = " + max);
    }
}
