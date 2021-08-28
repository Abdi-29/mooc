import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.println("Give speed:");
        int orwell = Integer.valueOf(scanner.nextLine());
	if (orwell == 1984){
	    System.out.println("Orwell");
	}
    }
}

