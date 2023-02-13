package employee_hr;

import java.util.Scanner;
class myMethod  {

    public static int[] largest_smallest(int arr[], int size){ 
        int x[] =new int[2];
        x[1] = arr[0];
        for(int i =0;i<size;i++){
            if(arr[i]> x[0])
                x[0] = arr[i];
            if(arr[i] < x[1])
                x[1] = arr[i];
        }
        return x;
    }
    public static int greater(int arr[],int s, int n){
        int x=0;
        for(int i=0;i<s;i++){
            if(arr[i] > n){
                x++;
            }
        }
        return x;
    }
}
public class employee_data {
    public static void main(String[] args ){
        int emp[] = new int[10];
        int ans[] = new int[2];
        int s = args.length,n;

        Scanner myObj = new Scanner(System.in);
        for(int i =0; i<s;i++){
        emp[i] = Integer.parseInt(args[i]); 
        }
        System.out.println("Salary greater then what: ");
        n = myObj.nextInt();
        ans = myMethod.largest_smallest(emp, s);

        System.out.println("Greatest number is: "+ans[0]);
        System.out.println("smallest number is: "+ans[1]); 
        System.out.println("Numbers greater then "+n+" are:"+myMethod.greater(emp,s,n));       
    }
}
