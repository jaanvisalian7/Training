package Lists;
import java.util.ArrayList;
import java.util.List;
public class Main2 {
    public static void main(String[] args){
        //list<string> list=new ArrayList<>(); //upcasting
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        System.out.println(list);

        list.add("Apple");
        list.add("Mango");
        list.add("Apple");
        list.add("Mango");
    }
}

