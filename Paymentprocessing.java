class payment{
    void Topay(int amount) {
        System.out.println("payment via networking"+amount);
    }
}
class Atm extends payment {
     void Topay(int amount){
        System.out.println("payment Atm "+amount);

     }
}
class upi extends payment{
    void Topay(int amount) {
        System.out.println("payment via upi"+amount);
    }
}
public class Paymentprocessing{
    public static void main(String[] args) {
        payment ac=new payment();
        ac.Topay(amount:3000);
    }
}