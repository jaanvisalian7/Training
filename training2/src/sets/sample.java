package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        System.out.println(s);
        TreeSet<Integer> t=new TreeSet<>();
        t.add(100);
        t.add(200);
        t.add(300);
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());

        System.out.println(t.headSet(20));
        System.out.println(t.headSet(20));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());

        System.out.println(t.subSet(2,60));
        System.out.println(t.higher(51));
        System.out.println(t);
    }
}
