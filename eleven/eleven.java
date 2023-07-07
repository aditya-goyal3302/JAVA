package eleven;

import java.util.Scanner;
public class eleven {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n,no;
        System.out.print("Enter the number of elements: ");
        n = sn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) 
            arr[i] = sn.nextInt();
        try {
            int sum = 0;
            for (int i = 0; i < n; i++) 
                sum += arr[i];
            System.out.println("Enter the total number of elements");
            no=sn.nextInt();
            double average = sum / no;
            System.out.println("The average is: " + average);
        } 
        catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }
        upperr ob = new upperr();
        stringg ob1 = new stringg();
        EmpCode ob2 = new EmpCode();
        
        ob.work();
        ob1.work();
        ob2.work();
}}

class upperr{
    public static void work() {
        Scanner input = new Scanner(System.in);
        int upperLimit = 10; // assuming the upper limit is 10 entries
        try {
            System.out.print("Enter the number of entries: ");
            int numEntries = input.nextInt();
            if (numEntries > upperLimit) 
                throw new Exception("You have crossed the upper limit");
            System.out.println("Data entry successful");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
}}}
class stringg{
    public static void work() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a string (max 10 characters): ");
        try {
            String input = sn.nextLine();
            if (input.length() > 10) 
                throw new Exception("String entered by you should not be more than 10 characters");
            System.out.println("Input accepted: " + input);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
}}}

class EmpCode {
    public static void work() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter employee code: ");
        int code = sn.nextInt();
        try {
            if (code < 1) 
                throw new IllegalArgumentException("Do not enter a negative value");
            if (code > 100) 
                throw new IllegalArgumentException("Do not enter more than 100");     
            System.out.println("Employee code entered: " + code);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
}}}
