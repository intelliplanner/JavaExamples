package a.basic_program;

/** Purpose: Encapsulates noduco behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Noduco {
    int empId;
    String empName;

    @Override
    
    /** Purpose: Validates hash code conditions. */
    public int hashCode() {
        return empName.hashCode();
    }

    @Override
    
    /** Purpose: Supports reliable object comparison. */
    public boolean equals(Object str){
        return str.equals(empId);
    }

}
