package day02;

public class Method_basic {
    public static void main(String[] args) {
        int[] arr = {70, 85, 90, 45, 100};

        System.out.println("add = " + add(3, 5));
        System.out.println("sum = " + sumArray(arr));
        System.out.println("max = " + maxArray(arr));
        System.out.println("avg = " + avgArray(arr));
    }

    public static int add(int a , int b) {
        return a + b;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int v : arr) sum += v;
        return sum;
    }

    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int v : arr) if (v > max) max = v;
        return max;
    }

    public static double avgArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }
}

//[접근제어자] [static] 반환타입 메서드이름(매개변수들) { return 값 }