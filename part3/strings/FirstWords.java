import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            String[] split = word.split(" ");
            for (int i = 0; i < 1; i++) {
                System.out.println(split[i]);
            }
            if (word.equals("")) {
                break;
            }
        }
    }
}
