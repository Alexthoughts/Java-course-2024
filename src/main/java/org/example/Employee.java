package org.example;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(String name, int birthYear, long employeeId, String hireDate) {
        super(name, birthYear);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
