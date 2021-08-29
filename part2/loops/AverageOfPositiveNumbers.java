import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int count = 0;
        int ave = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
	    else if (number < 0) {
		continue;
	    }
            ave += number;
            count++;
        }
	while (true) {
	    if (count == 0) {
	        System.out.println("Cannot calculate the average");
	        break;
	    }
            System.out.println("Average of the numbers: " + ((1.0 * ave) / count));
	    break;
	}
    }
}
