import java.util.Scanner; 
 
class StudentDemo{ 
    private String sName; 
    private int sAge, sMarks; 
 
    StudentDemo(){ 
        this.sName = ""; 
        this.sAge = 0; 
        this.sMarks = 0; 
    } 
    StudentDemo(String name, int age, int marks){ 
        this.sName = name; 
        this.sAge = age; 
        this.sMarks = marks; 
    } 
    void Setdata(String name, int age, int marks){ 
        this.sName = name; 
        this.sAge = age; 
        this.sMarks = marks; 
    } 
    void DisplayDetails(){ 
        System.out.println("Name of Student is : "+this.sName+"\nAge of Student is : "+this.sAge+"\nMarks of Student is : "+this.sMarks); 
    } 
} 
 
public class Student{ 
    public static void main(String[] args) { 
        String Name; 
        int Age, Marks; 
 
        Scanner sobj = new Scanner(System.in); 
 
        System.out.print("Enter Name of Student : "); 
        Name = sobj.nextLine(); 
 
        System.out.print("Enter Age of Student : "); 
        Age = sobj.nextInt(); 
 
        System.out.print("Enter Marks of Student : "); 
        Marks = sobj.nextInt(); 
 
        StudentDemo s1 = new StudentDemo(); 
 
        s1.Setdata(Name, Age, Marks); 
 
        s1.DisplayDetails(); 
    } 
} 