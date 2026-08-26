package Stream;

import java.util.ArrayList;

class employee {
    int age;
    String name;
    String dept;
    public employee(int age, String name, String dept){
        this.age=age;
        this.name=name;
        this.dept=dept;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}

public class sample {
    public static void main(String[] args) {
        ArrayList<employee>list=new ArrayList<>();
        employee e1=new employee(20,"Siya","Sales");
        list.add(e1);
        list.add(new employee(20,"Diya","sales"));
        list.add(new employee(30,"Ram","finance"));

        for(employee e:list){
            System.out.println(e.getAge()+" "+e.getName()+" "+e.getDept());
        }
    }
}
