import java.util.Scanner;

class MergeArray{
    public static void main(String[] args) {

        int aSize = 0;
        Scanner sObj = new Scanner(System.in);

        //---------------------------------------//
        System.out.println("Enter the Size of First Array : ");
        aSize = sObj.nextInt();
        
        int[] arr1 = new int[aSize];
        
        AcceptArray(arr1);

        //---------------------------------------//
        System.out.println("Enter the Size of Second Array : ");
        aSize = sObj.nextInt();

        int[] arr2 = new int[aSize];

        AcceptArray(arr2);
        //---------------------------------------//

        int len = arr1.length + arr2.length;

        int[] MergedArray = new int[len];

        Display(arr1);
        Display(arr2);

        Merge(MergedArray ,arr1, arr2);

        System.out.println("Array After Merging is : ");
        Display(MergedArray);
    }

    static void Merge(int[] Final, int[] Arr1, int[] Arr2){
        int index = 0;
        
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++){
            Final[index] = Arr1[iCnt];
            index++;
        }
        
        for(int iCnt = 0; iCnt < Arr2.length; iCnt++){
            Final[index] = Arr2[iCnt];
            index++;
        }
    }

    static void AcceptArray(int[] arr){        
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the elements of Array : ");
        
        for(int iCnt = 0; iCnt < arr.length; iCnt++){
            arr[iCnt] = sObj.nextInt();
        }
    }

    static void Display(int[] arr){
        System.out.println("Elements of Array are : ");

        for(int iCnt = 0; iCnt < arr.length; iCnt++){
            System.out.print(arr[iCnt]+" ");
        }
        System.out.println();
    }
}