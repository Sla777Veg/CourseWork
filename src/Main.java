public class Main {


    public static void main(String[] args) {

        Employee[] Employees = new Employee[10];

        Employees [0] = new Employee("Петров Петр Петрович",1, 200_000);
        Employees [1] = new Employee("Петров Иван Петрович",1, 150_000);
        Employees [2] = new Employee("Иванов Петр Петрович",2, 160_000);
        Employees [3] = new Employee("Иванов Петр Иванович",2, 170_000);
        Employees [4] = new Employee("Сидоров Петр Петрович",3, 130_000);
        Employees [5] = new Employee("Иваненко Петр Петрович",3, 180_000);
        Employees [6] = new Employee("Петрунко Петр Петрович",4, 220_000);
        Employees [7] = new Employee("Петрова Анна Ивановна",4, 90_000);
        Employees [8] = new Employee("Сидоненко Петра Васильевна",5, 115_000);
        Employees [9] = new Employee("Алиненко Тамара Игорьевна",5, 105_000);

        AllEmployees(Employees);
        AllExpenses(Employees);
        MinSalary(Employees);
        EmplMin(Employees);
        MaxSalary(Employees);
        EmplMax(Employees);
        AverageExpenses(Employees);
        AllFullNameEmployees(Employees);

    }


    //8-a, Список всех сотрудников вместе с id

    public static void AllEmployees(Employee[] Employees) {
        int id = 0;
        for (Employee employee : Employees) {
            id++;
            System.out.println(employee + " id: " + id);
        }
    }

    //8-b, Сумма затрат на зарплаты в месяц
    public static int AllExpenses(Employee[] Employees) {
        int sum = 0;
        for (Employee employee : Employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: "+sum);
        return sum;
    }


    //8-c,  Найти сотрудника с минимальной зарплатой
    public static void  EmplMin(Employee[] Employees) {
        String name = Employees [0].getFullName();
        int minSal = Employees [0].getSalary();
        for (Employee employee : Employees) {
            if (employee != null) {
                if (employee.getSalary() < minSal) {
                    minSal = employee.getSalary();
                    name = employee.getFullName();
                }
            }
        }
        System.out.println("Cотрудник с минимальной зарплатой: "+name);
    }
    public static void MinSalary(Employee[] Employees) {
        int minSalary = 1_000_000;
        int i = 0;
        while (i < Employees.length) {
            if (Employees [i].getSalary() <  minSalary) {
                minSalary = Employees [i].getSalary();
            }
            i++;
        }
        System.out.println("Минимальная зарплата: "+ minSalary);
    }

    //8-d,  Найти сотрудника с максимальной зарплатой
    public static void EmplMax(Employee[] Employees) {
        String name = Employees [0].getFullName();
        int maxSal = Employees [0].getSalary();
        for (Employee employee : Employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSal) {
                    maxSal = employee.getSalary();
                    name = employee.getFullName();
                }
            }
        }
        System.out.println("Cотрудник с максимальной зарплатой: "+name);
    }
    public static void MaxSalary(Employee[] Employees) {
        int maxSalary = 1;
        int i = 0;
        while (i < Employees.length) {
            if (Employees [i].getSalary() >  maxSalary) {
                maxSalary = Employees [i].getSalary();
            }
            i++;
        }
        System.out.println("Максимальная зарплата: "+ maxSalary);
    }
    //8-e, Среднее значение зарплат
    public static void AverageExpenses(Employee[] Employees) {
        int AllEmp = 10;
        int AverageExp = AllExpenses(Employees)/AllEmp;
        System.out.println("Среднее значение зарплат: "+AverageExp);
    }
    //8-f, Получить Ф. И. О. всех сотрудников
    public static void AllFullNameEmployees(Employee[] Employees) {
        for (Employee employee : Employees) {
            System.out.println(employee.getFullName());
        }
    }

}


