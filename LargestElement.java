import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int aSize = 0;
        int max = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        aSize = sObj.nextInt();

        int Arr[] = new int[aSize];

        GetData(Arr, aSize);
        max = FindLargest(Arr, aSize);

        System.out.println("Largest Element in Array is : "+max);

    }
    static void GetData(int[] Arr, int length){
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the elements of Array : ");

        for(int iCnt = 0; iCnt < length; iCnt++){
            Arr[iCnt] = sObj.nextInt();
        }
    }
    static int FindLargest(int[] Arr, int length){
        int Max = Arr[0];

        for(int iCnt = 0; iCnt < length; iCnt++){
            if(Max < Arr[iCnt]){
                Max = Arr[iCnt];
            }
        }
        return Max;
    }
}