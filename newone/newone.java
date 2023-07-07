package newone;
import java.util.Scanner;

public class newone {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BCA[] dents = new BCA[9];
    dents[0] = new BCA(); dents[0].get();
    dents[1] = new BCA(); dents[1].get();
    dents[2] = new BCA(); dents[2].get();
    MCA[] ob=new MCA[9];
    ob[3] = new MCA(); ob[3].get();
    ob[4] = new MCA(); ob[4].get();
    Btech[] ob1=new Btech[9];
    ob1[5] = new Btech(); ob1[5].get();
    ob1[6] = new Btech(); ob1[6].get();
    ob1[7] = new Btech(); ob1[7].get();
    ob1[8] = new Btech(); ob1[8].get();

    // Finding the number of BCA and MCA dents that have CGPA more than 8
    int bcaCount = 0, mcaCount = 0;
    for (int i = 0; i < dents.length; i++) 
      if (dents[i] instanceof BCA) {
        BCA bcadent = (BCA) dents[i];
        if ((bcadent.m10 + bcadent.m12) / 20 > 8)
          bcaCount++;
      } 
      else if (ob[i] instanceof MCA) {
        MCA mcadent = (MCA) ob[i];
        if ((mcadent.m12 + mcadent.gm) / 2 > 8)
          mcaCount++;
      }
    System.out.println("Number of BCA students with CGPA > 8: " + bcaCount);
    System.out.println("Number of MCA students with CGPA > 8: " + mcaCount);
    System.out.println("Btech and MCA students of same city and name starts with a vowel and ends with a consonant:");
    for (int i = 0; i < dents.length; i++)
      if (ob1[i] instanceof Btech) {
        Btech btechdent = (Btech) ob1[i];
        if (btechdent.city.equalsIgnoreCase("example_city") &&
            btechdent.name.matches("^[AEIOUaeiou]\\w*[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]$")) 
          btechdent.display();
      } 
      else if (ob[i] instanceof MCA) {
        MCA mcadent = (MCA) ob[i];
        if (mcadent.city.equalsIgnoreCase("example_city") &&
        mcadent.name.matches("^[AEIOUaeiou]\\w*[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]$"))
        mcadent.display();
      }
      
      int mcaGMC = 0;
    for (int i = 0; i < dents.length; i++) 
      if (ob[i] instanceof MCA) {
        MCA mcadent = (MCA) ob[i];
        if (mcadent.city.equalsIgnoreCase("example_city") && mcadent.gm > 80) 
          mcaGMC++;
        }
        System.out.println("Number of MCA dents with grad. marks>80% and of same city: " + mcaGMC);
}}

abstract class dent{
  public
  String name, city;
}

class BCA extends dent {
  float m10, m12;

  void get() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Data of BCA Students");
    System.out.print("Enter name:");
    name = sc.next();
    System.out.print("Enter city:");
    city = sc.next();
    System.out.print("Enter marks in 10th:");
    m10 = sc.nextFloat();
    System.out.print("Enter marks in 12th:");
    m12 = sc.nextFloat();
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("City: " + city);
    System.out.println("Marks in 10th: " + m10);
    System.out.println("Marks in 12th: " + m12);
  }
}

class MCA extends dent {
  float gm, m12;

  void get() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Data of MCA Students");
    System.out.print("Enter name:");
    name = sc.next();
    System.out.print("Enter city:");
    city = sc.next();
    System.out.print("Enter marks in 12th:");
    m12 = sc.nextFloat();
    System.out.print("Enter graduation marks:");
    gm = sc.nextFloat();
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("City: " + city);
    System.out.println("Marks in 12th: " + m12);
    System.out.println("Graduation marks: " + gm);
  }
}

class Btech extends dent {
  String stream_name;
  float m10, m12;

  void get() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Data of B.Tech Students");
    System.out.print("Enter name:");
    name = sc.next();
    System.out.print("Enter city:");
    city = sc.next();
    System.out.print("Enter stream name:");
    stream_name = sc.next();
    System.out.print("Enter marks in 10th:");
    m10 = sc.nextFloat();
    System.out.print("Enter marks in 12th:");
    m12 = sc.nextFloat();
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("City: " + city);
    System.out.println("Stream name: " + stream_name);
    System.out.println("Marks in 10th: " + m10);
    System.out.println("Marks in 12th: " + m12);
  }
}