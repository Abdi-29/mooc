import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
	System.out.println("Write a value");
	int value = Integer.valueOf(scanner.nextLine());
	System.out.println("You wrote " + value);
    }
}

