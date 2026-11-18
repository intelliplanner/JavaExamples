package a;

public class Employee implements  Comparable<Employee> {
    int id;
    String name;
    int salary;

//    public Employee(int id,String name) {
//        this.id = id;
//        this.name =
//    }

    @Override
    public int compareTo(Employee e) {
        return e.name.compareTo(this.name);
    }
}
