public class Question1 {
    public static void main(String[] args) {

        int n = 15, x = 0, y = 1;
        System.out.println("This is the fibonacci sequence for " + n + " values: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(x + ", ");

            int z = x + y;
            x = y;
            y = z;
        }
    }
}