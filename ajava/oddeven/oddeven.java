public class oddeven {
    public static void main(String[] args){
        odd ob = new odd();
        ob.even();
    }
}
class odd{
    int a=10;
    void even(){
        if(a%2==0)
        System.out.println(a+" is even number");
        else
        System.out.println(a+" is odd number");
    }
}

