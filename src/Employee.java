public class Employee {
    private String SNP;
    private int department;
    private int salary;
    //  private int id;

    public Employee (String SNP, int department, int salary) {
        this.SNP= SNP;
        this.department = department;
        this.salary = salary;
    }

    public String getSNP() {
        return SNP;
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
        return this.SNP +" "+this.department+" "+this.salary;
    }
}
