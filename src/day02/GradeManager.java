package day02;

import java.util.Scanner;

public class GradeManager {
    //전역변수
    static int[] scores = new int[10];
    static int size = 5;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //초기 데이터
        scores[0]=70; scores[1]=85; scores[2]=90; scores[3]=45; scores[4]=100;

        while (true) {
            printMenu();
            int cmd = sc.nextInt();
            if (cmd == 1) printAll();
            else if (cmd == 2) createScore();
            else if (cmd == 3) printMaxMin();
            else if (cmd == 0){
                System.out.println("bye");
                break;
            }
            else System.out.println("wrong choice!");
            System.out.println(); // 빈 줄 하나 출력 -> 줄 띄어쓰기 효과
        }
    }

    static void printMenu() {
        System.out.println("=== 성적 관리 ===");
        System.out.println("1) 전체 점수 출력 (Read)");
        System.out.println("2) 점수 추가 (Create)");
        System.out.println("3) 최고/최저 점수 (Read)");
        System.out.println("0) 종료");
        System.out.print("선택> ");
    }

    static void printAll() {
        System.out.println("Scores: ");
        for (int i = 0; i < size; i++) {
            System.out.print(scores[i]);
            if (i<size-1) System.out.print(",");
        }
        System.out.println();
        System.out.println("합계: "+ sumArray());
        System.out.println("평균: " + ((double) sumArray() / size));
    }

    static void createScore(){
        if (size >= scores.length) {
            System.out.println("더 이상 추가할 수 없어(배열 가득).");
            return;
        }
        System.out.print("추가할 점수 입력: ");
        int v = sc.nextInt();
        scores[size++] = v;
        System.out.println("추가됨!");
    }

    static void printMaxMin() {
        int max = scores[0], min = scores[0];
        for (int i = 1; i<size; i++){
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }
        System.out.println("최고: " + max + ", 최저: " + min);
    }

    static int sumArray() {
        int sum = 0;
        for (int i = 0; i<size; i++) sum += scores[i];
        return sum;
    }
}

/*
                    <접근 제어자 종류>

- public : 어디서든 접근 가능 (다른 클래스, 다른 패키지에서도).
- protected : 같은 패키지 + 상속받은 클래스에서 접근 가능.
- default(아무것도 안 씀) : 같은 패키지 안에서만 접근 가능.
- private : 같은 클래스 안에서만 접근 가능.


                    <println vs print>

- println은 출력 후 줄바꿈
- print는 출력 후 줄바꿈 안 함
 */


