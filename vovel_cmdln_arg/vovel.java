package vovel_cmdln_arg;

public class vovel {
    public static void main(String []args ){
        int x= args.length;
        for(int i=0;i<x;i++){
            if(args[i].startsWith("a")||args[i].startsWith("e")||args[i].startsWith("i")||args[i].startsWith("o")||args[i].startsWith("u")||
            args[i].startsWith("A")||args[i].startsWith("E")||args[i].startsWith("I")||args[i].startsWith("O")||args[i].startsWith("U")){
                System.out.println(args[i]+" : DO START WITH A VOVEL");
            }
            else if(args[i].charAt(0) >= '0' && args[i].charAt(0) <= '9'){
                System.out.println(args[i]+" : IT IS INVALID INPUT NAME CANT START FROM NUMBERS");
            }
            else{
                System.out.println(args[i]+" : DOES NOT START WITH A VOVEL");
            }
        }
    }
}
