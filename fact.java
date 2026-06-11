public class fact {
    public static int fact(int n) {
        if (n == 0) {
            return n;
        } else {
            return n *= n;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
