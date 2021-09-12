import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int old = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            String word = scanner.nextLine();
            String[] split = word.split(",");
            
            if (word.equals("")) {
                break;
            }           
            if (old < split[0].length()) {
                old = split[0].length();
                name = split[0];
            }
            sum += Integer.valueOf(split[1]);
            count++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years:  " + (1.0 * sum / count));
    }
}

