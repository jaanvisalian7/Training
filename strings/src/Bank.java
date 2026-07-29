public class Bank {
    private int pin;
    String acc_number="SBI0001";
    double balance =2000.0000;

    //setter() is to initialize the private variable
    public void setData(int U_pin)
    {
        pin=U_pin;

    }
    //getter mathod == is used to return/get the private variable
    public int getData()
    {
        return pin;
    }
    void deposits(int pin ,double amount){
        if(this.pin==pin) {
            balance += amount;
            System.out.println("amount deposited successfully");
        }
        else
        {
            System.out.println("invalied pin");
        }
    }
    void withdrawal(int pin,double amount)
    {
        if(this.pin==pin)
        {
            if(amount>balance)
            {
                System.out.println("insufficient balance");
            }
            else {
                balance-=amount;
                System.out.println("amount withdrawal successfully");
            }
        }
        else {
            System.out.println("invalid pin");
        }
    }
    void checkbalance(int pin){
        if(this.pin==pin)
        {
            System.out.println("current balance:"+balance);
        }
        else {
            System.out.println("invalid pin");
        }
    }



}
