package day03;

/*
목적: Create/Read/Update/Delete 4동작을 메뉴로 구현
내용: 정수 점수 리스트로 시작, 콘솔 메뉴 반복

입력: Scanner 정수/문자 처리
추가: add(value)
조회: 전체 출력(인덱스 함께), 합/평균/최고/최저
수정: 인덱스 유효성 체크 후 set(index, value)
삭제: 인덱스 유효성 체크 후 remove(index)
예외 처리: 숫자 아닌 입력 → 안내 후 다시
 */

import java.util.*;

public class GradeCrud {
    static final Scanner sc = new Scanner(System.in);
    static final List<Integer> scores = new ArrayList<>(Arrays.asList(70,85,90,45,100));

    public static void main(String[] args) {
        while (true) {
            // show all menus
            menu();
            // mode choice
            int cmd = readInt("choice>");

            // read and show information
            if (cmd == 1) readAll();
            // add information
            else if (cmd == 2) create();
            // update information
            else if (cmd == 3) update();
            // delete information
            else if (cmd == 4) deleteOne();
            // out of program
            else if (cmd == 0) {
                System.out.println("Bye!");
                break;
            }
            System.out.println();


        }
    }

    static void menu(){
        System.out.println("=== 점수 CRUD ==="); // titel of service
        System.out.println("1) 전체 조회 2) 추가 3) 수정 4) 삭제 0) 종료"); // choices of service
    }

    static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim()); // trim() : 앞뒤 공백 제거
            }
            catch (Exception e) {
                System.out.println("숫자를 입력해줘");
            }
        }
    }

    static void readAll() {
        if (scores.isEmpty()) {
            System.out.println("데이터없음");
            return;
        }
        System.out.print("scores: ");
        for (int i = 0; i<scores.size(); i++) {
            System.out.print("["+ i +"]"+scores.get(i) + (i < scores.size()-1 ? "," : ""));
        }

        int sum = 0, max = scores.get(0), min = scores.get(0);
        for (int s : scores) {
            sum += s;
            max = Math.max(max, s);
            min = Math.min(min, s);
        }
        System.out.println("\n합계=" + sum + ", 평균=" + (double)sum/scores.size() + ", 최고=" + max + ", 최저=" + min);
    }

    static void create() {
        int v = readInt("추가 점수: ");
        scores.add(v);
        System.out.println("추가됨");
    }

    static void update() {
        int idx = readInt("수정할 인덱스: ");
        if (!validIndex(idx)) return;
        int v = readInt("새 점수: ");
        scores.set(idx, v);
        System.out.println("수정됨");
    }

    static void deleteOne() {
        int idx = readInt("삭제할 인덱스: ");
        if (!validIndex(idx)) return; // 인덱스 범위 잘못된 경우, 즉시 종료
        scores.remove(idx);
        System.out.println("삭제함");
    }

    static boolean validIndex(int idx) {
        if (idx < 0 || idx >= scores.size()) {
            System.out.println("범위를 벗어남 (0 ~"+ (scores.size()-1) + ")");
            return false;
        }
        return true;
    }

}


/*
try-catch 예외처리

<기본 형식>
try {
    // 예외가 발생할 수도 있는 코드
} catch (예외타입 변수명) {
    // 예외가 발생했을 때 실행할 코드
} finally {
    // 예외와 상관없이 무조건 실행되는 코드 블록
}

 */


/*
            <(integer) vs Integer.parseInt()>

(int), (Integer) 같은 건 숫자 ↔ 숫자 변환이지, 문자열을 숫자로 바꾸지는 못 해

문자열 "123"을 진짜 숫자 123으로 바꾸려면 파싱(parsing) 이 필요해

Integer.parseInt("123") → 기본형 int 반환.
Integer.valueOf("123") → 래퍼 클래스 Integer 객체 반환

*/

// (i < scores.size()-1 ? "," : "") 삼항 연산자 : (조건 ? A : B) 조건이 참이면 A, 거짓이면 B

















