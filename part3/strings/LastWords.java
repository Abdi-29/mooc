import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            String[] split = word.split(" ");
            for (int i = 0; i < 1; i++) {
                System.out.println(split[(split.length - 1)]);
            }
            if (word.equals("")) {
                break;
            }
        }
    }
}

