package skypro.java.coursework;

public class EmployeeBook {

    private final Employee[] employee;

    public EmployeeBook(int employeeSize) {
        this.employee = new Employee[employeeSize];
    }

    public void addEmployee(Employee employees) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = employees;
                return;
            }
        }
    }

    public void removeEmployee(String firstName, String lastName) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFirstName().equals(firstName) && employee[i].getLastName().equals(lastName)) {
                employee[i] = null;
                return;
            }
        }
    }

    public void changeSalaryAndDepartmentEmployee(String firstName, String lastName, double salary, int department) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee.getFirstName().equals(firstName) && valueEmployee.getLastName().equals(lastName)) {
                valueEmployee.setSalary(salary);
                System.out.println("Зарплата сотрудника " + firstName + " " + lastName
                        + " изменена. " + "Новое значение: " + salary);
                valueEmployee.setDepartment(department);
                System.out.println("Департамент сотрудника " + firstName + " " + lastName
                        + " изменен. " + "Новый департамент: " + department);
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == (id)) {
                employee[i] = null;
            }
        }
    }

    public void printEmployees() {
        for (Employee valueEmployee : employee) {
            if (valueEmployee != null) {
                System.out.println(valueEmployee);
            }
        }
    }

    public double calculateTotalSalaryMonthly() {

        double sum = 0;
        for (Employee valueEmployee : employee) {
            sum += valueEmployee.getSalary();
        }

        return sum;
    }

    public String getMinSalaryEmployee() {

        double min = Double.MAX_VALUE;
        String employees = "";

        for (Employee valueEmployee : employee) {

            if (valueEmployee.getSalary() < min) {
                min = valueEmployee.getSalary();
                employees = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }
        return employees;
    }

    public String getMaxSalaryEmployee() {

        double max = Double.MIN_VALUE;
        String employees = "";

        for (Employee valueEmployee : employee) {

            if (valueEmployee.getSalary() > max) {
                max = valueEmployee.getSalary();
                employees = valueEmployee.getFirstName() + " " + valueEmployee.getLastName();
            }
        }
        return employees;
    }

    public void calculateAverageSalary() {
        double averageSumMonth = (calculateTotalSalaryMonthly()) / employee.length;
        System.out.println("Среднее значение зарплат: " + averageSumMonth);

    }

    public void printEmployeesFullName() {
        for (Employee valueEmployee : employee) {
            if (valueEmployee != null) {
                System.out.println(valueEmployee.getFirstName() + " " + valueEmployee.getLastName());
            }
        }
    }

    public void changeSalaryAllEmployee(double byPercent) {
        for (Employee valueEmployee : employee) {
            double salary = valueEmployee.getSalary() * byPercent / 100;
            valueEmployee.setSalary(valueEmployee.getSalary() + salary);
        }
        System.out.println("Зарплата всех сотрудников проиндексирована на " + byPercent + "%.");
    }

    public String getMinSalaryEmployeeDepartment(int department) {

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

    public String getMaxSalaryEmployeeDepartment(int department) {

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

    public void calculateAverageSalaryDepartment(int department) {

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
        System.out.println("Средняя зарплата по выбранному отделу: " + (sum / countEmployeeDepartment));
    }

    public void changeSalaryEmployeeDepartment(int department, double byPercent) {

        for (Employee valueEmployee : employee) {
            if (valueEmployee.getDepartment() == department) {
                double salary = valueEmployee.getSalary() * byPercent / 100;
                valueEmployee.setSalary(valueEmployee.getSalary() + salary);
            }
        }
        System.out.println("Зарплата сотрудников департамента " + department + " проиндексирована на " + byPercent + "%.");

    }

    public void printEmployeesDepartment(int department) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee.getDepartment() == department) {
                System.out.println(valueEmployee.getFirstName() + " " + valueEmployee.getLastName() + ", "
                        + valueEmployee.getSalary());
            }
        }
    }

    public void getEmployeesLessSalary(double value) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee.getSalary() < value) {
                System.out.println("ID:" + valueEmployee.getId() + "." + " Имя - " + valueEmployee.getFirstName() +
                        "." + " Фамилия - " + valueEmployee.getLastName() + "." + " Зарплата - " +
                        +valueEmployee.getSalary());
            }
        }

    }

    public void getEmployeesBigSalary(double value) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee.getSalary() > value) {
                System.out.println("ID:" + valueEmployee.getId() + "." + " Имя - " + valueEmployee.getFirstName() +
                        "." + " Фамилия - " + valueEmployee.getLastName() + "." + " Зарплата - " +
                        +valueEmployee.getSalary());
            }
        }

    }

    public void printEmployeesDepartmentNoSalary(int department) {
        for (Employee valueEmployee : employee) {
            if (valueEmployee.getDepartment() == department) {
                System.out.println(valueEmployee.getFirstName() + " " + valueEmployee.getLastName());
            }
        }
    }


    public void printAllEmployeesDepartments() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел " + i + ":");
            printEmployeesDepartmentNoSalary(i);

        }
    }
}
