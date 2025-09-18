package day02;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //전체출력
        for (int i=0; i<arr.length; i++) {
            System.out.println("arr["+i+"] = "+ arr[i]);
        }

        //합계 , for-each문
        int sum = 0;
        for (int v : arr) sum += v; // 생략된 중괄호 (선택적)
        System.out.println("sum = "+sum);

        //최댓값
        int max = arr[0];
        for (int v : arr) if (v > max) max = v; // 생략된 중괄호 (선택적)
        System.out.println("max = "+ max);
    }
}

// 기본배열 : int[], double[], char[], boolean[]
// for-each문 : for (타입 변수 : 배열또는컬렉션) { }