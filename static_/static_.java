package static_;

class sample{
    static int a =10 , b =110,result;
    String name = "Chitkara university";
    public 
    static int addition(){
        result = (a+b);
        return  result;}
    static void display_add(){
        System.out.println("Addition Result is = "+ sample.addition());} 
    void display_name(String name) {
        System.out.println(name + " is a student of "+ this.name );}
};
public class static_ { 
    public static void main(String[] args) {
        sample s1 = new sample();
        sample.addition(); 
        sample.display_add();
        s1.display_name("Deepak");
    }
}
