// For_while.java
public class For_while {
    public static void main(String[] args) {
        // 원하는 메서드만 실행: 종합 콘솔 느낌
        runForExample();
        runWhileExample();
        runDowhileExample();
    }

    static void runForExample() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"f");
        }
    }

    static void runWhileExample() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i+"w");
            i++;
        }
    }

    static void runDowhileExample() {
        int i = 8;
        // 반드시 한 번은 실행된다
        do {
            System.out.println(i+"d");
            i++;
        } while (i<=10);
    }
}

// while과 do-while 비교
// while문은 조건부터 확인 vs do-while문은 블록 먼저 실행 후 조건 확인 (거짓이라도 한 번은 실행)
