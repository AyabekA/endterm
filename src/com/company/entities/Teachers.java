package com.company.entities;

public class Teachers extends Member{
    private int group_id;
    private String subject_name;
    private double salary;

    public Teachers () {}

    public Teachers (String first_name, String last_name, int age, String email, int group_id, String subject_name, double salary) {
        super(first_name, last_name, age, email);
        setGroup_id(group_id);
        setSubject_name(subject_name);
        setSalary(salary);
    }

    public Teachers(int id, String first_name, String last_name, int age, String email, int group_id, String subject_name, double salary) {
        super(id, first_name, last_name, age, email);
        setGroup_id(group_id);
        setSubject_name(subject_name);
        setSalary(salary);
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
