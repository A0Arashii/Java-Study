import java.util.Scanner;

public class Sum_and_subtract {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("합:"+(x+y));
        System.out.println("차:"+(x-y));
    }
}
