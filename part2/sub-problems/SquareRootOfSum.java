import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int first = Integer.valueOf(scanner.nextLine());
	int second = Integer.valueOf(scanner.nextLine());
	
	if ((first + second) > 0) {
	    double value = Math.sqrt(first + second);
	    int squareRoot = (int) value;
	    System.out.println(squareRoot);
	}
    }
}

