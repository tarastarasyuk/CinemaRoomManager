import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void method(int[] array) {
        array = new int[]{1, 2, 3};
    }

    public static void main(String[] args) {

        int[] numbers = {4, 5, 6};


        method(numbers);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println(Arrays.toString(numbers));
    }
}