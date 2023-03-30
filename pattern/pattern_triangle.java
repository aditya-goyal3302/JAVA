package pattern;

import java.util.Scanner;

public class pattern_triangle {
    static public void main(String []args){
        Scanner sn = new Scanner(System.in);

        int rows,c=0;
        System.out.print("Enter Number of Rows: ");
        rows = sn.nextInt();

        System.out.println("1.) ");
        for(int i=0; i< rows; i++){
            for(int j=0; j< i+1; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("2.) ");
        for(int i=0; i< rows; i++){
            for(int j=0; j< rows-i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("3.) ");
        for(int i=0; i< rows; i++){
            for(int j=0; j< i+1; j++)
                System.out.print(++c+" ");
            System.out.println();
        }

        System.out.println("4.) ");
        for(int i=1; i<=rows; i++){

            for(int j=0; j< rows-i; j++)
            System.out.print(" ");

            for(int k = 1; k <= (i); k++)
                System.out.print("* ");
            System.out.println();
        }

    }
}
