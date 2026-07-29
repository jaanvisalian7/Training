public class demo {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b.acc_number);
        System.out.println(b.balance);
       // System.out.println(b.pin);

        b.setData(1111);
        System.out.println(b.getData());
        b.deposits(1110,5000);
        b.deposits(1111,5000);
        b.checkbalance(1111);
        b.withdrawal(1111,600);



    }
}
