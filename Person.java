import java.util.Scanner; 
 
 
class PersonDemo{ 
    private String Name; 
    private int Age; 
 
    PersonDemo(){ 
        this.Name = ""; 
        this.Age = 0; 
    } 
    PersonDemo(String name, int age){ 
        this.Name = name; 
        this.Age = age; 
    } 
 
    void DisplayDetails(){ 
        System.out.println("Name of Person is : "+this.Name+"\nAge of "+this.Name+" is : "+this.Age); 
    } 
 
} 
 
public class Person { 
    public static void main(String[] args) { 
        Scanner sobj = new Scanner(System.in); 
         
        String name; 
        int age; 
 
        System.out.print("Please Enter the Name of Person : "); 
        name = sobj.nextLine(); 
 
        System.out.print("Please Enter Age of Person : "); 
        age = sobj.nextInt(); 
 
        PersonDemo p1 = new PersonDemo(); 
        PersonDemo p2 = new PersonDemo(name, age); 
 
        p1.DisplayDetails(); 
        p2.DisplayDetails(); 
 
    } 
} 