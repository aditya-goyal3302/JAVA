package lab_9;

class top { 
    public top(int data) { 
        System.out.println("Top Constructor - " + data); } 
} 
class bottom extends top { 
    public bottom(int data2) { 
        super(44); 
        System.out.println("Bottom Constructor- " + data2);
    }
} 
abstract class animal{ 
    abstract void voice(); 
} 
class Rat extends animal { 
    void voice() { 
    System.out.println("rat voice ....."); } 
} 
class Dog extends Rat { 
    void display(){ 
    System.out.println("Bhow Bhow..."); } 
} 
class animalTwo extends Dog { 
    void show(){ 
    System.out.println("this is animal two class"); } 
}
        
class Employee { 
    float salary = 40000; 
} 
class PermanentEmp extends Employee { 
    double hike = 0.5; 
} 
class TemporaryEmp extends Employee { 
    double hike = 0.35; 
} 
    
public class lab_9 { 
    public static void main(String[] args) { 
        bottom b1 = new bottom(56);
        animalTwo an = new animalTwo(); 
        an.show();
        an.display(); 
        an.voice();
        PermanentEmp p = new PermanentEmp(); 
        TemporaryEmp t = new TemporaryEmp(); 
        System.out.println("Permanent Employee salary is :" + p.salary); 
        System.out.println("Hike for Permanent Employee is:" + p.hike); 
        System.out.println("Temporary Employee salary is :" + t.salary); 
        System.out.println("Hike for Temporary Employee is :" + t.hike); 
    
    } 
}
                