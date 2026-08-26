package que;

//functional interface--->one method;
interface Nsam{
    void cal(int a,int b);
//    void cse();
//    void ece();
}
//class students implements Nsam{
//    public void cse(){
//        System.out.println("students from cse dept");
//    }
//}
public class sample2 {
    public static void main(String[] args) {
        Nsam n = (int x, int y) -> {
            System.out.println("sum" + (x + y));
        };
//        Nsam n=new Nsam() {
//            @Override
//            public void cse() {
//                System.out.println("cse dept");
//            }
//            public void ece(){
//                System.out.println("cse dept");
//            }
//        };
        n.cal(20, 10);
        Nsam n1=(int x,int y)->{
            System.out.println("Difference"+(x-y));
        };
        n1.cal(20, 10);
        Nsam n2=(int x,int y)->{
            System.out.println("Product"+(x*y));
        };
        n2.cal(5, 6);
        Nsam n3 = (int x, int y) ->{
            System.out.println("Division"+(x/y));
        };
        n3.cal(10, 20);




    }
    }