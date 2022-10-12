public class Employee {
    private String FullName;
    private int department;
    private int salary;
    private int id;

    public Employee (String FullName, int department, int salary) {
        this.FullName= FullName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }


    public String getFullName() {
        return FullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.FullName +" "+this.department+" "+this.salary;
    }
}
