package skypro.java.coursework;

public class Main {
    public static void main(String[] args) {

        Employee[] allEmployees = new Employee[10];
        allEmployees[0] = new Employee("Alex", "Mayson", 70_000, 2);
        allEmployees[1] = new Employee("Julia", "Pim", 60_000, 4);
        allEmployees[2] = new Employee("Liam", "Cook", 98_000, 3);
        allEmployees[3] = new Employee("Max", "Brandon", 127_000, 5);
        allEmployees[4] = new Employee("Oliver", "Johnson", 87_350, 3);
        allEmployees[5] = new Employee("Amelia", "Williams", 55_900, 1);
        allEmployees[6] = new Employee("Lucas", "Davis", 110_000, 3);
        allEmployees[7] = new Employee("Emma", "Miller", 102_000, 2);
        allEmployees[8] = new Employee("Olivia", "Anderson", 256_000, 1);
        allEmployees[9] = new Employee("Noah", "Lee", 43_000, 5);

        // Печатаем список всех сотрудников со всеми данными
        printEmployees(allEmployees);

        // Считываем сумму затрат на зарплаты в месяц
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalaryMonthly(allEmployees));

        // Находим сотрудника с минимальной зарплатой
        System.out.println("Сотрудник с минимальной зарплатой: " + getMinSalaryEmployee(allEmployees));

        // Находим сотрудника с максимальной зарплатой
        System.out.println("Сотрудник с максимальной зарплатой: " + getMaxSalaryEmployee(allEmployees));

        // Считаем среднее всех зарплат
        calculateAverageSalary(allEmployees);

        // Печаем только ФИО сотрудников
        System.out.println("ФИО всех сотрудников:");
        printEmployeesFullName(allEmployees);

    }

    public static void printEmployees (Employee[] allEmployees) {
        for (Employee valueEmployee : allEmployees) {
            if (valueEmployee != null) {
                System.out.println(valueEmployee.toString());
            }
        }
    }

    public static int calculateTotalSalaryMonthly (Employee[] allEmployees) {

        int sum = 0;
        for (Employee valueEmployee : allEmployees) {
            if (allEmployees.length == 0) {
                return 0;
            } else {
                sum += valueEmployee.getSalary();
            }
        }

        return  sum;
    }

    public static String getMinSalaryEmployee (Employee[] allEmployees) {

        int min = allEmployees[0].getSalary();
        String employee = "";

        for (Employee valueEmployee : allEmployees) {

            if (allEmployees.length == 0) {
                return null;
            }

            if (valueEmployee.getSalary() < min) {
                min = valueEmployee.getSalary();
                employee = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }

        return employee;

    }

    public static String getMaxSalaryEmployee (Employee[] allEmployees) {

        int max = allEmployees[0].getSalary();
        String employee = "";

        for (Employee valueEmployee : allEmployees) {

            if (allEmployees.length == 0) {
                return null;
            }

            if (valueEmployee.getSalary() > max) {
                max = valueEmployee.getSalary();
                employee = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }

        return employee;
    }

    public static void calculateAverageSalary(Employee[] allEmployees) {
        double averageSumMonth = (calculateTotalSalaryMonthly(allEmployees) * 1.0) / allEmployees.length;
        System.out.println("Среднее значение зарплат: " + averageSumMonth);

    }

    public static void printEmployeesFullName(Employee[] allEmployees) {
        for (Employee valueEmployee : allEmployees) {
            if (valueEmployee != null) {
                System.out.println(valueEmployee.getFirstName() + " " + valueEmployee.getLastName());
            }
        }
    }


}
