package a.basic_program;

/**
 * Encapsulates noduco behavior for the represented example workflow.
 */
public class Noduco {
    int empId;
    String empName;

    @Override
    /**
 * Verifies hash code conditions before processing continues.
 */
    public int hashCode() {
        return empName.hashCode();
    }

    @Override
    /**
 * Supports reliable object comparison and collection lookup.
 */
    public boolean equals(Object str){
        return str.equals(empId);
    }



}
