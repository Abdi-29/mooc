import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int old = 0;
        while (true) {
            String word = scanner.nextLine();
            String[] split = word.split(",");
            
            if (word.equals("")) {
                break;
            }           
            if (old < Integer.valueOf(split[1])) {
                old = Integer.valueOf(split[1]);
                name = split[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}

