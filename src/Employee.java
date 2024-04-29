import java.util.Objects;

public class Employee {
    private static int idEmploy = 1;
    private int id;
    private String fullName;
    private int department;
    private double salary;



    public Employee(String fullName, int department, int salaryEmploy) {
        this.id =  idEmploy++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salaryEmploy;

    }


    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalaryEmploy() {
        return this.salary;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() !=o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && fullName.equals(employee.fullName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString(){
        return "Ф.И.О " + fullName + ", " + "департамент: " + department + ", " + "зарплата - " + salary + ".";
    }
}
