package vector;
import java.util.Vector;
public class Vector1 {
    public static void main(String[] args) {

        Vector<Integer> a = new Vector<>();
        System.out.println(a.capacity());
        System.out.println(a.size());

        a.add(10);
        a.addElement(100);
        a.addElement(200);
        a.addElement(300);
        a.addElement(400);
        System.out.println(a);
        Vector<Integer> b = new Vector<>();
        a.addElement(1500);
        a.addElement(600);
        a.addElement(700);
        a.addElement(800);
        System.out.println(b);
        a.addAll(b);
        a.insertElementAt(1000,1);
        System.out.println(a);
        a.removeElement(300);
        System.out.println(a.firstElement());
        System.out.println(a.lastElement());

    }
}
