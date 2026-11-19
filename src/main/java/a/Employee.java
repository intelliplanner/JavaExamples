package a;

/** Purpose: Encapsulates employee behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Employee implements  Comparable<Employee> {
    int id;
    String name;
    int salary;

//    public Employee(int id,String name) {
//        this.id = id;
//        this.name =
//    }

    @Override
    
    /** Purpose: Performs the compare to operation. */
    public int compareTo(Employee e) {
        return e.name.compareTo(this.name);
    }
}
