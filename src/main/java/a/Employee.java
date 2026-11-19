package a;

/**
 * Encapsulates employee behavior for the represented example workflow.
 */
public class Employee implements  Comparable<Employee> {
    int id;
    String name;
    int salary;

//    public Employee(int id,String name) {
//        this.id = id;
//        this.name =
//    }

    @Override
    /**
 * Performs the compare to operation required by the represented example.
 */
    public int compareTo(Employee e) {
        return e.name.compareTo(this.name);
    }
}
