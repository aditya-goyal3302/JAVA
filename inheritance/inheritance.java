package inheritance;

import java.util.Scanner;

public class inheritance {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int roll,m_java,m_css,m_ds;
        String g_evs,g_sports;
        System.out.print("Enter Roll No.: ");
        roll = sn.nextInt();
        System.out.print("Enter marks of Java: ");
        m_java = sn.nextInt();
        System.out.print("Enter marks of CSS: ");
        m_css = sn.nextInt();
        System.out.print("Enter marks of DS: ");
        m_ds = sn.nextInt();
        System.out.print("Grade marks of EVS: ");
        g_evs = sn.next();
        System.out.print("Grade marks of Sports: ");
        g_sports = sn.next();

        Grade ob = new Grade(roll,m_java,m_css,m_ds,g_evs,g_sports);
        
        ob.display();
    }
}
class university{
    String name,course;
    public
    university(){
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        name = sn.next();
        System.out.print("Enter Student's course: ");
        course = sn.next();
    }

    void display(){
        System.out.println("Student Name: "+name +"\nStudents Course: "+course);
    }

}
class Student extends university{
    protected
    int percent;
    int roll;
    String grade;
    private
    int m_java,m_css,m_ds;
    public
    Student(){
        super();
    }
    Student(int roll){
        super();
        this.roll = roll;
        m_css = m_ds = m_java = 0;
    }
    Student(int roll,int m_java,int m_css,int m_ds){
        super();
        System.out.println();
        this.roll = roll ;
        this.m_java = m_java;
        this.m_css = m_css;
        this.m_ds = m_ds;
    }

    int compute(){
        percent = (((m_java+m_ds+m_css)/3)*100)/60;
        if(percent>=0 && percent<=40)
            grade = "F";
        else if(percent<=60)
            grade="B";
        else if(percent<=80)
            grade="A";
        else if(percent<=100)
            grade="A+";
        
        return percent;
    }
    
}
class Grade extends Student{
    String g_evs,g_sports;
    public
    Grade(){}
    Grade(int roll){
        super(roll);
        g_evs = g_sports = " ";
    }
    Grade(int roll,int m_java,int m_css,int m_ds,String g_evs,String g_sports){
        super(roll,m_java,m_css,m_ds);
        if(g_evs.equals("A+") ||(g_evs.length() == 1 && g_evs.charAt(0) >= 'A' &&  g_evs.charAt(0) <= 'C'))
            this.g_evs = g_evs;
        if(g_sports.equals("A+") ||(g_sports.length() == 1 && g_sports.charAt(0) >= 'A' &&  g_sports.charAt(0) <= 'C'))    
        this.g_sports = g_sports;
    }
    void display(){
        super.display();
        System.out.println("Roll No.: " + roll+ "\nPercentage & Grade of 3 subjects: "+super.compute() +"%  "
        +grade+"\nGrade of EVS: "+g_evs+"\nGrade of Sports: "+g_sports);
    }
}