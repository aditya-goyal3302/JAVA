package key_creation;
import java.util.Scanner;

public class key_creation {
     static int key(int a, int b , int c){
        int max =0, min =a;
        max = a>b?(a>c?a:c):(b>c?b:c);
        min = a<b?(a<c?a:c):(b<c?b:c);
        
        return max-min;
    }
    static public void main(String arg[]){
        int arr[] = new int[3] , final_ans = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter 3 4-Digit Numbers: ");
        for(int i = 0; i<3; i++){
            arr[i] = obj.nextInt();
        }

        for(int i = 0; i<4; i++){
            final_ans += (key(arr[0]%10,arr[1]%10,arr[2]%10))* Math.pow(10, i);
            arr[0] /=10;
            arr[1] /=10;
            arr[2] /=10;
        }
        System.out.println("Answer is : "+final_ans);
    }
}
