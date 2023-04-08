package lab_8;

class constructor{
    private double one,two;
    public constructor(double one, double two) {
        System.out.println("Copy Paremeter Called:"); 
        this.one = one;
        this.two = two;
    }
    public constructor() {}
    public constructor(constructor s){
        System.out.println("Copy Constructor Called:"); 
        this.one = s.one; 
        this.two = s.two;
    }
    public double getOne() {return one;}
    public double getTwo() {return two;} 
}
class con_chain{ 
    public con_chain(){ 
        System.out.println("This is default constructor."); } 
    con_chain(int a){ 
        this(); 
        System.out.println("This is single parameter constructor."); } 
    con_chain(int b,int c){ 
        this(b); 
        System.out.println("This is multiple parameter constructor."); } 
    con_chain(int d,int e,int f){ 
        this(d,e); 
        System.out.println("With three parameters"); } 
    con_chain(int one,int two,int three,int four){ 
        this(one,two,three); 
        System.out.println("With four parameters"); } 
    con_chain(int de,int ef,int gf,int ab,int bc){ 
        this(de,ef,gf,ab);
        System.out.println("With five parameters"); } 
}  
class hotel{ 
    void bill(){ 
        float amount_single=76.98f; 
        System.out.println("Bill for single room is = Rs."+amount_single); } 
    void bill(float dormitory){ 
        System.out.println("Bill for Dormitory is = Rs."+dormitory); } 
    void bill (double special_rooms,double guest_rooms){ 
        System.out.println("Bill for special room is = Rs."+special_rooms+" And Bill of Guest Room is = Rs."+guest_rooms); } 
} 
public class lab_8 {
    public static void main(String[] args) { 
        constructor x = new constructor(11.56,56.8);
        System.out.println("First value is "+x.getOne()); 
        System.out.println("Second value is"+x.getTwo()); 
        constructor x2 = new constructor(x);
        System.out.println("First value is "+x2.getOne());
        System.out.println("Second value is "+x2.getTwo());
        System.out.println();
        con_chain ob = new con_chain(10,76,89,98,9); 
        System.out.println();
        hotel h = new hotel();
        h.bill();
        h.bill(98.76f);
        h.bill(98.76, 76.98);
    }
}