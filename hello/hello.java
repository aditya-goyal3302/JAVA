import java.util.Scanner;


 class hello{
    public static void main(String abc[] ) {
        int a[] = new int[10];
        int i=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(i =0 ; i<10; i++){
            a[i] = myObj.nextInt();
            
        }
        int max = a[0], min = a[0],avg = 0;
        for(i=0;i< 10; i++){
            if(max < a[i])
                max = a[i];
            if(min> a[i])
                min = a[i];
            avg += a[i];

        }
        avg /=10;
        System.out.println("max is: "+ max);
        System.out.println("min is: "+ min);
        System.out.println("avg is: "+ avg);

    }
}