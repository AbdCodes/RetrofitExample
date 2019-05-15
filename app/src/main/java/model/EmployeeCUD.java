package model;

public class EmployeeCUD {

    private int id;
    private String name;
    private float salary;
    private int age;
    private String profile_image;

    public EmployeeCUD(String employee_name, float employee_salary, int employee_age) {
        this.name = employee_name;
        this.salary = employee_salary;
        this.age = employee_age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


