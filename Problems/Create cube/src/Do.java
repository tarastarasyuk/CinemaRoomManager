import java.util.Arrays;
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        int[][] twoDimArray = {
                {0,0,9,9,5},
                {1,2,3,4},
                {5,6,7,8},
        };

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = twoDimArray[i].length-1; j >= 0; j--) {
                System.out.print(twoDimArray[i][j]+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length/2; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray.length-j-1];
                twoDimArray[i][twoDimArray.length-j-1] = temp;
            }
        }


        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
