
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // asking for the two indices
        System.out.println("Give two indices to swap: ");
        // and then swapping them
        int swap1 = Integer.valueOf(scanner.nextLine());
        int swap2 = Integer.valueOf(scanner.nextLine());
        
        int swap = array[swap1];
        array[swap1] = array[swap2];
        array[swap2] = swap;
        

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
