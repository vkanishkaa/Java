package constructor;

public class demo { 
    String Sname;
	demo(String Sname){
        this.Sname=Sname;
     System.out.println(x:"this is constructor");
}
public static void main (String[] args){
    demo d=new demo(Sname:"js");
    System.out.println(d.Sname);
}
}