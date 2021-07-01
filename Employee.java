import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
       private String name;
       private String address;
       private int salary;
       private int age;

    public Employee(String name, String address, int salary, int age) {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee emps2){
        // TODO Auto-generated method stub
        //this > lap2 =
        //this < lap2 = 0

        if (this.getAge() > emps2.getAge())
            return 1;
        else
            return -1;

    }

}
