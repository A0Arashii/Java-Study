import java.util.Scanner;

public class Score_to_gpa {
    public static void main(String[] args){
        Scanner score = new Scanner(System.in);

        int sc = score.nextInt();
        if (sc>=90) {
            System.out.println("A");
        } else if (sc>=80) {
            System.out.println("B");
        } else {
            System.out.println("fuck you shit");
        }
    }
}
