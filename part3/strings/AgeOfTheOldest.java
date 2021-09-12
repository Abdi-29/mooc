import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int old = 0;
        while (true) {
            String word = scanner.nextLine();
            String[] split = word.split(",");
            
            if (word.equals("")) {
                break;
            }
            if (old < Integer.valueOf(split[1]))
            {
                old = Integer.valueOf(split[1]);
            }
        }
        System.out.println("Age of the oldest: " + old);
    }
}
