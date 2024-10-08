import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int iRow, iCol = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        iRow = sObj.nextInt();

        System.out.print("Enter Number of Columns : ");
        iCol = sObj.nextInt();

        int Arr1[][] = new int[iRow][iCol];
        int Arr2[][] = new int[iRow][iCol];

        GetData(Arr1, iRow, iCol);
        GetData(Arr2, iRow, iCol);

        // Display(Arr1, iRow, iCol);

        AddMatrix(Arr1, Arr2, iRow, iCol);
    }

    static void GetData(int[][] arr, int row, int col){
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter Elements of Array : ");

        for(int rCnt = 0; rCnt < row; rCnt++){
            for(int cCnt = 0; cCnt < col; cCnt++){
                arr[rCnt][cCnt] = sObj.nextInt();
            }
        }
    }

    static void Display(int[][] arr, int row, int col){

        System.out.println("Elements of Array are : ");

        for(int rCnt = 0; rCnt < row; rCnt++){
            for(int cCnt = 0; cCnt < col; cCnt++){
                System.out.print(arr[rCnt][cCnt]+" ");
            }
            System.out.println();
        }
    }

    static void AddMatrix(int[][] arr1, int[][] arr2, int row, int col){
        int [][] sum = new int[row][col];

        for(int rCnt = 0; rCnt < row; rCnt++){
            for(int cCnt = 0; cCnt < col; cCnt++){
                sum[rCnt][cCnt] = arr1[rCnt][cCnt] + arr2[rCnt][cCnt];
            }
        }

        Display(sum, row, col);
    }
}
