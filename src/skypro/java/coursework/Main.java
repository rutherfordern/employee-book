package skypro.java.coursework;

public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Alex", "Mayson", 70_000, 2);
        employee[1] = new Employee("Julia", "Pim", 60_000, 4);
        employee[2] = new Employee("Liam", "Cook", 98_000, 3);
        employee[3] = new Employee("Max", "Brandon", 127_000, 5);
        employee[4] = new Employee("Oliver", "Johnson", 87_350, 3);
        employee[5] = new Employee("Amelia", "Williams", 55_900, 1);
        employee[6] = new Employee("Lucas", "Davis", 110_000, 3);
        employee[7] = new Employee("Emma", "Miller", 102_000, 2);
        employee[8] = new Employee("Olivia", "Anderson", 256_000, 1);
        employee[9] = new Employee("Noah", "Lee", 43_000, 5);

        // Печатаем список всех сотрудников со всеми данными
        printEmployees(employee);

        // Считываем сумму затрат на зарплаты в месяц
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalaryMonthly(employee));

        // Находим сотрудника с минимальной зарплатой
        System.out.println("Сотрудник с минимальной зарплатой: " + getMinSalaryEmployee(employee));

        // Находим сотрудника с максимальной зарплатой
        System.out.println("Сотрудник с максимальной зарплатой: " + getMaxSalaryEmployee(employee));

        // Считаем среднее всех зарплат
        calculateAverageSalary(employee);

        // Печатаем только ФИО сотрудников
        System.out.println("ФИО всех сотрудников:");
        printEmployeesFullName(employee);

        // Индексируем зарплату сотрудников
        changeSalaryAllEmployee(employee, 5);

        // Находим сотрудника с минимальной зарплатой в определенном департаменте
        String minSalaryEmployee = getMinSalaryEmployeeDepartment(employee, 3);
        System.out.println("Сотрудник с минимальной зарплатой в департаменте: " + minSalaryEmployee);

        // Находим сотрудника с максимальной зарплатой в определенном департаменте
        String maxSalaryEmployee = getMaxSalaryEmployeeDepartment(employee, 5);
        System.out.println("Сотрудник с максимальной зарплатой в департаменте: " + maxSalaryEmployee);

        // Средняя зарплата по в определенном департаменте
        calculateAverageSalaryDepartment(employee, 2);

        // Индексируем зарплату сотрудников определенного департамента
        changeSalaryEmployeeDepartment(employee, 3, 5);

        System.out.println();

        // Печатем сотрудниковы определенного департамента
        System.out.println("Сотрудники выбранного отдела: ");
        printEmployeesDepartment(employee, 3);

        System.out.println();

        // Находим и печатем всех сотрудников с зарплатой меньше заданного числа
        getEmployeesLessSalary(employee, 100_000);

        System.out.println();

        // Находим и печатем всех сотрудников с зарплатой больше заданного числа
        getEmployeesBigSalary(employee, 100_000);


    }

    public static void printEmployees(Employee[] employee) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee != null) {
                System.out.println(valueEmployee);
            }
        }
    }

    public static int calculateTotalSalaryMonthly(Employee[] employee) {

        int sum = 0;
        for (Employee valueEmployee : employee) {
                sum += valueEmployee.getSalary();
            }

        return sum;
    }

    public static String getMinSalaryEmployee(Employee[] employee) {

        double min = employee[0].getSalary();
        String employees = "";

        for (Employee valueEmployee : employee) {

            if (valueEmployee.getSalary() < min) {
                min = valueEmployee.getSalary();
                employees = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }

        return employees;

    }

    public static String getMaxSalaryEmployee(Employee[] employee) {

        double max = employee[0].getSalary();
        String employees = "";

        for (Employee valueEmployee : employee) {

            if (valueEmployee.getSalary() > max) {
                max = valueEmployee.getSalary();
                employees = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }

        return employees;
    }

    public static void calculateAverageSalary(Employee[] employee) {
        double averageSumMonth = (calculateTotalSalaryMonthly(employee) * 1.0) / employee.length;
        System.out.println("Среднее значение зарплат: " + averageSumMonth);

    }

    public static void printEmployeesFullName(Employee[] employee) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee != null) {
                System.out.println(valueEmployee.getFirstName() + " " + valueEmployee.getLastName());
            }
        }
    }

    public static void changeSalaryAllEmployee(Employee[] allEmployees, double byPercent) {
        for (Employee valueEmployee : allEmployees) {
            double salary = valueEmployee.getSalary() * byPercent / 100;
            valueEmployee.setSalary(valueEmployee.getSalary() + salary);
        }

    }

    public static String getMinSalaryEmployeeDepartment(Employee[] employee, int department) {

        double min = Double.MAX_VALUE;
        String employees = "";

        for (Employee valueEmployee : employee) {

            if (employee.length == 0) {
                return null;
            }

            if (valueEmployee.getDepartment() == department && valueEmployee.getSalary() < min) {
                min = valueEmployee.getSalary();
                employees = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }

        return employees;

    }

    public static String getMaxSalaryEmployeeDepartment(Employee[] employee, int department) {

        double max = Double.MIN_VALUE;
        String employees = "";

        for (Employee valueEmployee : employee) {

            if (employee.length == 0) {
                return null;
            }

            if (valueEmployee.getDepartment() == department && valueEmployee.getSalary() > max) {
                max = valueEmployee.getSalary();
                employees = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }

        return employees;
    }

    public static void calculateAverageSalaryDepartment(Employee[] employee, int department) {

        double sum = 0;

        for (Employee valueEmployee : employee) {
            if (valueEmployee.getDepartment() == department) {
                sum += valueEmployee.getSalary();
            }
        }

        int countEmployeeDepartment = 0;

        for (Employee valueEmployee : employee) {
            if (valueEmployee.getDepartment() == department) {
                countEmployeeDepartment++;
            }
        }

        System.out.println("Средняя зарплата по выбранному отделу: " + (sum/countEmployeeDepartment));
    }

    public static void changeSalaryEmployeeDepartment(Employee[] allEmployees, int department, double byPercent) {

        for (Employee valueEmployee : allEmployees) {
            if (valueEmployee.getDepartment() == department) {
                double salary = valueEmployee.getSalary() * byPercent / 100;
                valueEmployee.setSalary(valueEmployee.getSalary() + salary);
            }

        }

    }

    public static void printEmployeesDepartment(Employee[] employee, int department) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee.getDepartment() == department) {
                System.out.println(valueEmployee.getFirstName() + " " + valueEmployee.getLastName() + ", "
                                   + valueEmployee.getSalary());
            }
        }
    }

    public static void getEmployeesLessSalary(Employee[] employee, double value) {

        for (Employee valueEmployee : employee) {
            if (valueEmployee.getSalary() < value) {
                System.out.println("ID:" + valueEmployee.getId() + "." + " Имя - " + valueEmployee.getFirstName() +
                                  "." + " Фамилия - " + valueEmployee.getLastName() + "." + " Зарплата - " +
                                   + valueEmployee.getSalary());
            }
        }

    }

    public static void getEmployeesBigSalary(Employee[] employee, double value) {

        for (Employee valueEmployee : employee) {
            if (valueEmployee.getSalary() > value) {
                System.out.println("ID:" + valueEmployee.getId() + "." + " Имя - " + valueEmployee.getFirstName() +
                        "." + " Фамилия - " + valueEmployee.getLastName() + "." + " Зарплата - " +
                        + valueEmployee.getSalary());
            }
        }

    }


}
