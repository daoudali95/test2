import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Runner1 {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("ali","lahore",10000, 23));
        emps.add(new Employee("david","isb", 20000, 24));
        emps.add(new Employee("logan", "mandi", 30000, 25));
        emps.add(new Employee("jack sparrow","london",50000, 27));

        Collections.sort(emps);

        for(Employee e : emps)
        {
            System.out.println(e);
        }
    }
}