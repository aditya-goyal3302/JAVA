import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a , b;
        System.out.print("enter 2 number to check if they are even or odd: ");
        a = sn.nextInt();
        b = sn.nextInt();

        if(a%2 == 0)
            System.out.println("1st No. is Even");
        else 
            System.out.println("1nd No. is Odd");
        
        if(b%2 == 0)
            System.out.println("2st No. is Even");
        else 
            System.out.println("2nd No. is Odd");
    }
}