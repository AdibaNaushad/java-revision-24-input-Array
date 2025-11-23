import java.util.Scanner;

public class practice {

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter row and col");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("enter element");

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        printArray(arr);

    }


}
