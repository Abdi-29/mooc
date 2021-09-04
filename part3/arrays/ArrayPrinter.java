public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int print = 0;
        while (print < array.length) {
            if (print != array.length - 1) {
                System.out.print(array[print] + ", ");
                print++;
                continue;
            }
            System.out.print(array[print]);
            print++;           
        }
    }
}

