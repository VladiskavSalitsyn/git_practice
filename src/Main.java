import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int число = new Scanner(System.in).nextInt();

        boolean истина = 0 >= число && число <= 12;
        boolean лож = число >= 12 && число <= 24;

        if (истина) {
            System.out.printf("Косплее врет");
        } else {
            System.out.printf("Косплее говорит правду");
        }
    }
}