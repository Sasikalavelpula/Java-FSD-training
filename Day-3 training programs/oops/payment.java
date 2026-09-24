package full;
// Abstraction
abstract class Payment{
    abstract void pay();

    public static void main(String[] args){
        Payment upi = new UPI();
        Payment card = new Card();
        upi.pay();
        card.pay();
    }
}
//Inheritance+Polymorphism
class UPI extends Payment{
    void pay(){
        System.out.println("paying through UPI");
    }
}
class Card extends Payment{
    void pay(){
        System.out.println("paying through Card");
    }
}
//Encapsulation
class Customer{
    private String name;
    private double balance;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void addMoney(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
}