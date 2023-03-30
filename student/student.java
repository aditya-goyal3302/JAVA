package student;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class student {
    public static void main(String a[]) {
        Scanner sn1 = new Scanner(System.in);
        int s = 0;
        System.out.print("Enter No. of Students Data to be Stored: ");
        s = sn1.nextInt();
        student_data stu[] = new student_data[s];
        for(int i =0;i<s ; i++)
            stu[i] = new student_data(i+1);
        int count=0;
        System.out.print("Enter Initial of Names You wanna check: ");
        char check_name = sn1.next().charAt(0);
        for(int i =0;i<s ; i++)
            if(stu[i].name_start() == check_name)
                count++;
        System.out.println("No. of student for "+check_name+" are: "+count+"\n");
        String check_city = new String();
        System.out.print("Enter City You wanna check: ");
        check_city = sn1.next();
        System.out.println("Student of City "+check_city+" with CGPA >= 8 are: ");
        for(int i =0; i<s; i++)
            stu[i].check_city_cgpa(check_city);
        System.out.println();
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i =0; i<s; i++){
            String temp = new String();
            temp = stu[i].branch_show();
            if(map.containsKey(temp))
                map.put(temp,map.get(temp)+1);
            else
                map.put(temp,1);
        }
        System.out.println("No. of Student in each Stream: ");
        for(Map.Entry e : map.entrySet() )
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}

class student_data{
    private
    String name, branch,city, phone,roll;
    double cgpa;
    public
    student_data(int n){
        Scanner sn = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Data for Student "+n);
        System.out.print("Enter Name: ");
        name = sn.nextLine();
        System.out.print("Enter Rollno: ");
        roll = sn.nextLine();
        System.out.print("Enter Branch: ");
        branch = sn.nextLine();
        System.out.print("Enter City: ");
        city = sn.nextLine();
        System.out.print("Enter Phone Number: ");
        phone = sn.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sn.nextDouble();
    }
    char name_start(){
        return name.charAt(0);
    }
    String branch_show(){ return branch;}

    void check_city_cgpa(String check){
        if(city.equalsIgnoreCase(check) && cgpa >=8)
            System.out.println("    Name : "+name+"     Roll No.: "+roll);
    }
};