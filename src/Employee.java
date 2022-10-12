public class Employee {
    private String FullName;
    private int department;
    private int salary;
    private int id;
    private static int count;

    public Employee (String FullName, int department, int salary) {
        this.FullName= FullName;
        this.department = department;
        this.salary = salary;
        this.id = ++count;
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
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник:"+this.FullName +". "+"Отдел: "+this.department+". "+"Зарплата: "+this.salary+". "+"Номер id:"+this.id;
    }
}
