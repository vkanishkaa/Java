package oops;

class Car{
     String carname="BMW";
     void manufactureyear (int year){
        System.out.println(year);
     }

}
public class car{
    public static void main(String[] args){
        Car c=new Car();
        System.out.println(c.carname);
        c.manufactureyear(2000);
    }
}