package twelve;

public class twelve {
    public static void main(String[] args) {
        fibo t1 = new fibo();
        t1.start();
        large t2 = new large();
        t2.start();
        reverse t3 = new reverse();
        t3.start();
        arm t4 = new arm();
        t4.start();
        bsort t5 = new bsort();
        t5.start();
        bsearch t6 = new bsearch();
        t6.start();
}}

class fibo extends Thread{
    public void run(){
        int N = 10;
        int num1 = 0, num2 = 1;
        int counter = 0;
        
        while (counter < N) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter ++;
}}}
class large extends Thread{
    int arr[] = new int[]{-10,20,30,-40,-50};
    public void run(){
        int max = arr[0];
        for(int x = 0; x < 5; x++)
            if(max < arr[x])
                max = arr[x];
        System.out.println("\n" + "Largest number is : " + max);
}}
class reverse extends Thread{
    int num = 798;
    int sum = 0,rem;
    public void run(){
        while(num!=0){
            rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        System.out.println("\n" +"Reverse of number is : " + sum);
}}
class arm extends Thread{
    int arm = 153;
    int temp = arm;
    int sum = 0,rem;
    public void run(){
        while(arm!=0){
            rem = arm % 10;
            sum = sum + (rem*rem*rem);
            arm /= 10;
        }
        if(sum == temp)
            System.out.println("\n" + temp + " is a arm number");
        else
            System.out.println("\n" +temp + " is not a arm number");
}}
class bsort extends Thread{
    int arr[] = new int[]{50,40,30,20,10};
    int n = 5;
    public void run(){
        for(int x =0; x <n-1; x++)
            for(int y =0; y <n-x-1; y++)
                if(arr[y] > arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
        for(int x = 0; x <5; x++)
            System.out.println(arr[x] + "\t");
}}
class bsearch extends Thread{
    int arr[] = new int[]{50,40,30,20,10};
    int n = 5,low = 0,high = n,key = 20;

    public void run(){
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key){ 
                System.out.println("\n"+ key +" found at index : " + mid);
                break;
            }
            else if(arr[mid] > key)
                low = mid + 1;
            else
                high = mid - 1;
}}}