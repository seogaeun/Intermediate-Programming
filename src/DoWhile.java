import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("번호 입력해: ");
            num = sc.nextInt();
        } while (num<1||num>100);
    }
}
