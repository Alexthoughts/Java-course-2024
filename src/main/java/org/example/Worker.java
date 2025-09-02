package org.example;

import java.time.LocalDate;

public class Worker {
    private String name;
    private int birthYear;
    private String endDate;

    public Worker(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge() {
        LocalDate date = LocalDate.now();
        return date.getYear() - birthYear;
    }

    public double collectPay(){
        return 1.1;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
