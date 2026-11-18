package a.basic_program;

public class Noduco {
    int empId;
    String empName;

    @Override
    public int hashCode() {
        return empName.hashCode();
    }

    @Override
    public boolean equals(Object str){
        return str.equals(empId);
    }



}
