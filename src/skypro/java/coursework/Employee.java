package skypro.java.coursework;

public class Employee {

    public static final int MAX_DEPARTMENT = 5;
    public static final int MIN_DEPARTMENT = 1;

    private static int countId;

    private String firstName;
    private String lastName;
    private double salary;
    private int department;
    private int id;

    public Employee(String firstName, String lastName, double salary, int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.id = countId++;

        if (department >= MIN_DEPARTMENT && department <= MAX_DEPARTMENT) {
            this.department = department;
        } else {
            throw new RuntimeException("Департаментов всего 5. Укажите, пожалуйста, правильный департамент.");
        }
    }

    public static int getCountId() {
        return countId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        if (department >= MIN_DEPARTMENT && department <= MAX_DEPARTMENT) {
            this.department = department;
        } else {
            throw new RuntimeException("Департаментов всего 5. Укажите, пожалуйста, правильный департамент.");
        }
    }

    @Override
    public String toString() {

        return "Имя сотрудника - " + firstName + ". " +
                "Фамилия сотрудника - " + lastName + ". " +
                "Зарплата - " + salary + ". " +
                "Отдел - " + department;

    }
}
