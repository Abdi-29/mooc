import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.println("Give numbers: ");
	int sum = 0, count = 0, even = 0, odd = 0;
	while (true) {
	    int number = Integer.valueOf(scanner.nextLine());
	    if (number == -1) {
		System.out.println("Thx! Bye!");
		break;
	    }
	    sum += number;
	    count++;
	    if (number % 2 == 0) {
		even++;
	    }
	    else {
		odd++;
	    }
	}
	System.out.println("Sum: " + sum);
	System.out.println("Numbers: " + count);
	System.out.println("Average: " + ((double) sum / count));
	System.out.println("Even: " + even);
	System.out.println("Odd: " + odd);
    }
}

