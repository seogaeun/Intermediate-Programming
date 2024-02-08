public class Loop {
    public static void main(String[] args) {
        int j = 100, sum = 0;
        while ( j > 0) {
            sum += j--;
        }
        System.out.println("sum is "+ sum);

    }
}
