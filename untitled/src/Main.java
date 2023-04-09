public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 1;
        int d = 4;
        int sum_1 = a + b;
        int sum_2 = c + d;
        if (sum_1 > sum_2) {
            System.out.println(true);
        }
        sum_1++;
        sum_2 -= 2;
        if (sum_1 > sum_2) {
            System.out.println(true);
        }
        if (sum_1 % 2 == 0 || sum_2 % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
