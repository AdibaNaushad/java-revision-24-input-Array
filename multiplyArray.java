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
    static void multiply(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
        if (c1 != r2){
            System.out.println("invalid input! Multiplication not possible");
            return;
        }
        else {
            int[][] mul = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) { //k is aar1 col
                        /*
                        C[i][j] = A[i][0] * B[0][j] +
                                  A[i][1] * B[1][j] +
                                    A[i][2] * B[2][j]
                         */

                        mul[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }

            }
            System.out.println("Multiplication is : ");
            printArray(mul);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter row and col");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter element");

        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1 [i][j] = sc.nextInt();

            }

        }


        System.out.println("enter row and col");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("enter element");

        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2 [i][j] = sc.nextInt();

            }

        }
        System.out.println("1st array");
        printArray(arr1);
        System.out.println("2nd array");
        printArray(arr2);

        multiply(arr1,r1,c1,arr2,r2,c2);


    }

}
