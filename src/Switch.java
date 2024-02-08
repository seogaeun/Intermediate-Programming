//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Switch {
    public static void main(String[] args) {
        int myNumber = 10;
        switch (myNumber) {
            case 1: case 2: case 3:
                System.out.println("hello");
                break;
            case 5:
                System.out.println("world");
                break;
            default:
                System.out.println("hahaha");
        }
    }
}