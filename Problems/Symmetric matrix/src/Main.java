import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (n > 2) {
            boolean check = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == matrix[j][i]) {
                        check = true;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                }
            }

            if (check == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } else if (n == 2){
            if (matrix[0][1]==matrix[1][0]){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        } else{
            System.out.println("YES");
        }



    }
}
