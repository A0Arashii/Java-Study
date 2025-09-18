public class exercise_problems {
    public static void main(String[] args) {
        runSum();
        runEvenNum();
        runGugudan();
    }

    static void runSum() {
        int sum = 0;
        for (int i = 1; i<=10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void runEvenNum() {
        for (int i = 2; i<=10; i+=1) {
            if (i%2==0) {
                System.out.println(i+" : Even number");
            } else {
                // void is pass
            }
        }
    }

    static void runGugudan() {
        for (int i = 2; i<=9; i++) {
            for (int j = 1; j<=9; j++) {
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}
