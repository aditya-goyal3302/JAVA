package lab_10;
abstract class design { 
    int a; 
    public int getA() { return a; } 
    abstract void shape(); 
    design(int ax) { this.a = ax; } 
    void generateReceipt() { 
        System.out.println("Your receipt is ready to print..");} 
};
class subClass extends design { 
    subClass(int ax) { super(ax); } 
    @Override void shape() { 
        System.out.println("I am in a subclass"); } 
};
class square extends design { 
        square(int ax) { super(ax); } 
    @Override void shape() { 
        System.out.println("I m in square"); } 
}; 
interface rectangle{ 
    float length = 15.8f,breadth=121.98f; 
    void area(); 
};
interface Sq{ 
    float side=4; void area();
}; 
interface circle{ 
    float pi = 3.14f, radius=4;
    void area(); 
};
class des implements rectangle,Sq,circle{ 
    float result_1,result_2,res_3;
    @Override public void area() { 
        result_1 = side*side;
        result_2 = length*breadth; 
        res_3 = pi* radius*radius; 
    } 
    void show(){ 
        System.out.println("Area of square is "+result_1+"\nArea of rectangle is "+result_2); 
        System.out.println("Area of cirlce is "+res_3); 
    } 
};
public class lab_10 { 
    public static void main(String[] args) { 
        design ref;  
        ref = new square(44); 
        ref.shape(); 
        ref.generateReceipt(); 
        ref = new subClass(89); 
        ref.shape();
        des x = new des();
        x.area(); 
        x.show(); 
    } 
};    