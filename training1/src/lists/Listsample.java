package lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listsample {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        System.out.println(a);
        a.add("Mumbai");
        a.add("Bangalore");
        System.out.println(a);
        a.add(1, "hyd");
        System.out.println(a);
        a.remove(1);
        a.add("abc");
        a.add("def");
        a.add("ghi");
        a.add("jkl");
        a.add("mno");
        System.out.println(a);
        System.out.println(a.indexOf("Bangalore"));
        System.out.println(a.lastIndexOf("Mumbai"));

        System.out.println("using for loop");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("using for each loop");
        //Iterator interface
        System.out.println("using iterator interface");
        Iterator<String>i=a.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("original order");
        ListIterator<String> x=a.listIterator();
        while(x.hasNext())
        {
            System.out.println(x.next());
        }
    }
}
