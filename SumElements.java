import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        int aSize = 0;
        int aSum = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        aSize = sObj.nextInt();

        int Arr[] = new int[aSize];

        GetData(Arr, aSize);
        aSum = ArraySum(Arr, aSize);

        System.out.println("Sum of all Elements in Array is : "+aSum);

    }
    static void GetData(int[] Arr, int length){
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the elements of Array : ");

        for(int iCnt = 0; iCnt < length; iCnt++){
            Arr[iCnt] = sObj.nextInt();
        }
    }
    static int ArraySum(int[] Arr, int length){
        int Sum = 0;

        for(int iCnt = 0; iCnt < length; iCnt++){
            Sum = Sum + Arr[iCnt];
        }
        
        return Sum;
    }
}