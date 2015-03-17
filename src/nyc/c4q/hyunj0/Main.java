package nyc.c4q.hyunj0;

/**
 * Created by c4q-hyunj0 & alizinha on 3/16/15.
 */

public class Main {

    public static void print(String text) {
        System.out.print(text);
    }

    //psvm tab
    public static void main(String[] args) {
        int size = 50;
        box(size);
    }

    public static String pattern (int i, int j) {
        if (i % j == 0 || j % i == 0) {
            return "@ ";
        } else {
            return "  ";
        }
    }

    public static void box (int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                print(pattern(i,j));
            }
            print("\n");
        }
    }
}
