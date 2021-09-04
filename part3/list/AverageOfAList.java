import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //reads user input
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            // adding them on a list until user gives -1.
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        // Then it computes the average of the numbers on the list
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        // and prints it.
        System.out.println("Average: " + (1.0 * sum / list.size()));
    }
}

