package nyc.c4q.hyunj0;

//Created by c4q-hyunj0 & alizinha on 3/16/15.

public class DivisorPatternArt {

    //keyboard shortcut to type main method is
    //key psvm then tab
    public static void main(String[] args) {
        int size = 5;
        box(size);
    }

    //Make a method to print strings without having to type the whole print line
    public static void print(String text) {
        System.out.print(text);
    }

    public static String pattern (int i, int j) {
        if (i % j == 0 || j % i == 0) {
            return "@ ";
        } else {
            return "  ";
        }
    }

    //test each column of the same row before moving on to the second row
    public static void box (int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                print(pattern(i,j));
            }
            print("\n");
        }
    }
}
