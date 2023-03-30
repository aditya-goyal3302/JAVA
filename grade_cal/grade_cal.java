package grade_cal;

import java.util.Scanner;

public class grade_cal {
    static public void main(String []args){
        Scanner sn = new Scanner(System.in);
        int marks = sn.nextInt();
        marks /= 10;
        String grade = new String(); 
         switch(marks){
            case 0:
            case 1:
            case 2:
            case 3:
                grade = "F";
                break;
            case 4:
                grade = "B";
                break;
            case 5:
            case 6:
                grade = "A";
                break;
            case 7:
                grade = "A1";
                break;
            case 8:
                grade = "AA";
                break;
            case 9:
                grade = "AA1";
                break;
         }
         System.out.println(grade+" : is syour grade");

    }
}
