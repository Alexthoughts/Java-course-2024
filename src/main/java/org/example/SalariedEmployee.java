package org.example;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, int birthYear, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthYear, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }
}
