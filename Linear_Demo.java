import java.util.Scanner;

class Linear_Search{
    private int Arr[];

    Linear_Search(int A[]){
        this.Arr = A;
    }

    int lSearch(int key){
        int index = -1;
        for(int i = 0; i < Arr.length; i++){
            if(Arr[i] == key){
                index = i;
                break;
            }
        }

        return index;
    }

}

class Linear_Demo{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int length = 0;
        int key;
        int Pos = -1;

        System.out.print("Enter Size of Array : ");
        length = sObj.nextInt();

        int Arr[] = new int[length];
        AcceptArray(Arr);
        
        System.out.print("Enter Element to Search in Array : ");
        key = sObj.nextInt();

        Linear_Search lobj = new Linear_Search(Arr);

        Pos = lobj.lSearch(key);

        if(Pos == -1){
            System.out.println("Entered Element not found in Array...");
        }
        else{
            System.out.println("Element : "+key+" is Present at Position : "+(Pos+1));
        }
    }
    static void AcceptArray(int[] arr){        
            Scanner sObj = new Scanner(System.in);
    
            System.out.println("Enter the elements of Array : ");
            
            for(int iCnt = 0; iCnt < arr.length; iCnt++){
                arr[iCnt] = sObj.nextInt();
            }
        }
}