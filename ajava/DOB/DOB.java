import java.util.Scanner;
public class grtnumber {
 public static void main(String[] args) {
    Data d= new Data();
    d.dataa();
}   
}
class Data{
    int d,m,s=0,y;
    void dataa(){
        System.out.println("Enter the DOB in this format-->(DD MM YYYY)");
        Scanner sc = new Scanner(System.in);
        d= sc.nextInt();
        m= sc.nextInt();
        y= sc.nextInt();
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    s=1;
                }
                else s=0;
            }
            else s=1;
        }
        else s=0;
        if(s==1){
            System.out.println(" is leap year");
        }
        else{
            System.out.println(" is not leap year");
        }
    }
}
