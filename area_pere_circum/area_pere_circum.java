package area_pere_circum;

import java.util.Scanner;

public class area_pere_circum{
    static public void main(String arg[]){
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter Radious of Circle: ");
        float r = ob.nextFloat();

        System.out.print("Enter side of square: ");
        int s = ob.nextInt();
        
        System.out.print("Enter length of rectangle: ");
        int l = ob.nextInt();

        System.out.print("Enter breath of rectangle: ");
        int b = ob.nextInt();


        System.out.println("Circumfrence of circle is: "+ 3.14*r*2);
        System.out.println("area of circle is: "+ 22*r*r/7);
        
        System.out.println("parameter of square is: "+ s*4);
        System.out.println("area of square is: "+ s*s);
        
        System.out.println("parameter of rectangle is: "+ 2*(l+b));
        System.out.println("area of rectangle is: "+ l*b);
        
    }

}