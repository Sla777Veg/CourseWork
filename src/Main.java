public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees [0] = new Employee("Петров Петр Петрович",1, 200_000);
        employees [1] = new Employee("Петров Иван Петрович",1, 150_000);
        employees [2] = new Employee("Иванов Петр Петрович",2, 160_000);
        employees [3] = new Employee("Иванов Петр Иванович",2, 170_000);
        employees [4] = new Employee("Сидоров Петр Петрович",3, 130_000);
        employees [5] = new Employee("Иваненко Петр Петрович",3, 180_000);
        employees [6] = new Employee("Петрунко Петр Петрович",4, 220_000);
        employees [7] = new Employee("Петрова Анна Ивановна",4, 90_000);
        employees [8] = new Employee("Сидоненко Петра Васильевна",5, 115_000);
        employees [9] = new Employee("Алиненко Тамара Игорьевна",5, 105_000);

        allEmployees(employees);
        allExpenses(employees);
        minSalary(employees);
        maxSalary(employees);
        averageExpenses(employees);
        allFullNameEmployees(employees);

    }

    //8-a, Список всех сотрудников вместе с id

    public static void allEmployees(Employee[] Employees) {
        for (Employee employee : Employees) {
            if (employee == null) continue;
            System.out.println(employee);
        }
    }

    //8-b, Сумма затрат на зарплаты в месяц
    public static int allExpenses(Employee[] Employees) {
        int sum = 0;
        for (Employee employee : Employees) {
            if (employee == null) continue;
            sum +=  employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: "+sum);
        return sum;
    }

    //8-c,  Найти сотрудника с минимальной зарплатой

    public static void minSalary(Employee[] Employees) {
        int minSalary = 1_000_000_000;
        String name = null;
        int i = 0;
        while (i < Employees.length) {
            if (Employees [i].getSalary() <  minSalary) {
                minSalary = Employees [i].getSalary();
                name = Employees [i].getFullName();
            }
            i++;
        }
        System.out.println("Cотрудник с минимальной зарплатой: "+name+". "+"Минимальная зарплата: "+ minSalary);
    }

    //8-d,  Найти сотрудника с максимальной зарплатой

    public static void maxSalary(Employee[] Employees) {
        int maxSalary = 1;
        String name = null;
        int i = 0;
        while (i < Employees.length) {
            if (Employees [i].getSalary() >  maxSalary) {
                maxSalary = Employees [i].getSalary();
                name = Employees [i].getFullName();
            }
            i++;
        }
        System.out.println("Cотрудник с максимальной зарплатой: "+name+". "+"Максимальная зарплата: "+ maxSalary);
    }
    //8-e, Среднее значение зарплат
    public static void averageExpenses(Employee[] Employees) {
        int AllEmp = 10;
        int AverageExp = allExpenses(Employees)/AllEmp;
        System.out.println("Среднее значение зарплат: "+AverageExp);
    }
    //8-f, Получить Ф. И. О. всех сотрудников
    public static void allFullNameEmployees(Employee[] Employees) {
        for (Employee employee : Employees) {
            System.out.println(employee.getFullName());
        }
    }
}


