package skypro.java.coursework;

public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee(new Employee("Alex", "Mayson", 70_000, 2));
        employeeBook.addEmployee(new Employee("Julia", "Pim", 60_000, 4));
        employeeBook.addEmployee(new Employee("Liam", "Cook", 98_000, 3));
        employeeBook.addEmployee(new Employee("Max", "Brandon", 127_000, 5));
        employeeBook.addEmployee(new Employee("Oliver", "Johnson", 87_350, 3));
        employeeBook.addEmployee(new Employee("Amelia", "Williams", 55_900, 1));
        employeeBook.addEmployee(new Employee("Lucas", "Davis", 110_000, 3));
        employeeBook.addEmployee(new Employee("Emma", "Miller", 102_000, 2));
        employeeBook.addEmployee(new Employee("Olivia", "Anderson", 256_000, 1));
        employeeBook.addEmployee(new Employee("Noah", "Lee", 43_000, 5));


        // Печатаем список всех сотрудников со всеми данными
        employeeBook.printEmployees();

        System.out.println();

        // Считаем сумму затрат на зарплаты в месяц
        System.out.println("Сумма затрат на зарплаты в месяц: " + employeeBook.calculateTotalSalaryMonthly());

        // Находим сотрудника с минимальной зарплатой
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.getMinSalaryEmployee());
        // Находим сотрудника с максимальной зарплатой
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.getMaxSalaryEmployee());

        // Считаем среднее всех зарплат
        employeeBook.calculateAverageSalary();

        System.out.println();

        // Печатаем только ФИО сотрудников
        System.out.println("ФИО всех сотрудников:");
        employeeBook.printEmployeesFullName();

        System.out.println();

        // Индексируем зарплату сотрудников
        employeeBook.changeSalaryAllEmployee(5);

        // Находим сотрудника с минимальной зарплатой в определенном департаменте
        String minSalaryEmployee = employeeBook.getMinSalaryEmployeeDepartment(3);
        System.out.println("Сотрудник с минимальной зарплатой в департаменте: " + minSalaryEmployee);

        // Находим сотрудника с максимальной зарплатой в определенном департаменте
        String maxSalaryEmployee = employeeBook.getMaxSalaryEmployeeDepartment(5);
        System.out.println("Сотрудник с максимальной зарплатой в департаменте: " + maxSalaryEmployee);

        // Средняя зарплата по в определенном департаменте
        employeeBook.calculateAverageSalaryDepartment(2);

        // Индексируем зарплату сотрудников определенного департамента
        employeeBook.changeSalaryEmployeeDepartment(3, 5);

        System.out.println();

        // Печатем сотрудниковы определенного департамента
        System.out.println("Сотрудники выбранного отдела: ");
        employeeBook.printEmployeesDepartment(3);

        System.out.println();

        // Находим и печатем всех сотрудников с зарплатой меньше заданного числа
        employeeBook.getEmployeesLessSalary(100_000);

        System.out.println();

        // Находим и печатем всех сотрудников с зарплатой больше заданного числа
        employeeBook.getEmployeesBigSalary(100_000);

        System.out.println();

        // Изменяем зарплату и департамент определенному сотруднику
        employeeBook.changeSalaryAndDepartmentEmployee("Alex", "Mayson", 88_000, 3);

        System.out.println();

        // Печатаем всех сотрудников, разделяя их по отделам
        employeeBook.printAllEmployeesDepartments();









    }
}
