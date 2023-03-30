package bill_cal;

import java.util.Scanner;

public class bill_cal {
    public static void main(String a[]){
        bill ob = new bill();

        ob.get_data();
        ob.compute();
        ob.display();
    }
}
class bill{
    private
    String c_name ,c_id ;
    float or,cr,uc,tb=0, sur=0, ec=0;
    public
    void get_data(){
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Name: ");
        c_name = sn.nextLine();
        System.out.print("Enter Meter No.: ");
        c_id = sn.nextLine();
        System.out.print("Enter Opening Reading: ");
        or = sn.nextFloat();
        System.out.print("Enter Closing Reading: ");
        cr = sn.nextFloat();
        System.out.println();
    }
    void compute(){
        uc = cr- or;
        
        if(uc>0 && uc < 201){          //below 200 is free
            uc = 0;
        }
        else if(uc < 401){         // below 400 case
            uc -= 200;
            ec += uc*2.5;
            uc =0;
        }
        else if(uc < 1001){         // bleow 1000 case
            uc -= 400;
            ec += 500;
            ec += uc*4.5;
            uc =0;
        }
        else if(uc > 1000){         // bleow 1000 case
            uc -= 1000;
            ec += 3200;
            ec += uc*8;
            uc =0;
        }
        if(ec >= 1500){
            sur = ec/100;
        }
        tb = 250 + ec + sur;
    }

    void display(){
        System.out.print("Bill details:\nName: "+c_name+"\nMeter No.: "+c_id+
            "\nUnit Consumed: "+(cr-or)+"\nEle. charges: "+ ec+"\nSurcharge: "+sur+
            "\nRent: 250\n\nTotal Bill: "+tb);
    }
}
