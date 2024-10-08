import java.util.Scanner;

class Bubble_Sort{
    private int Arr[];

    Bubble_Sort(int A[]){
        this.Arr = A;
    }
    void bSort(){
        int temp;
        for(int i = 0; i < Arr.length; i++){
            for(int j = 0; j < Arr.length; j++){
                if(Arr[i] < Arr[j]){
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
    }
    void Display(){
        for(int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
}


public class Bubble_Demo{
    public static void main(String[] v) {
        
        Scanner sObj = new Scanner(System.in);
        int length = 0;

        System.out.print("Enter Size of Array : ");
        length = sObj.nextInt();

        int Arr[] = new int[length];
        AcceptArray(Arr);

        Bubble_Sort b = new Bubble_Sort(Arr);

        System.out.print("Array Before Sort : ");
        b.Display();

        System.out.print("Array After Sort : ");
        b.bSort();
        b.Display();
        
    }
    static void AcceptArray(int[] arr){        
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the elements of Array : ");
        
        for(int iCnt = 0; iCnt < arr.length; iCnt++){
            arr[iCnt] = sObj.nextInt();
        }
    }
}