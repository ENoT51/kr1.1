
public class Main {
    public static void printAll (Employee[] emp){
        for (int i = 0 ; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
    public static double getSalarySum(Employee[] emp) {
        double sum = 0;
        for (int i = 0; i < emp.length; i++) {
            sum = sum + emp[i].getSalaryEmploy();
        }
        return sum;
    }
    public static double getMinSalart(Employee[] emp){
        double min = emp[0].getSalaryEmploy();
        for (int i = 0; i < emp.length; i ++) {
            if (min > emp[i].getSalaryEmploy()){
                min = emp[i].getSalaryEmploy();
            }
        }
        return min;
    }
    public static double getMaxSalart(Employee[] emp){
        double max = emp[0].getSalaryEmploy();
        for (int i = 0; i < emp.length; i ++) {
            if (max < emp[i].getSalaryEmploy()){
                max = emp[i].getSalaryEmploy();
            }
        }
        return max;
    }
    public static double getAverageSalary(Employee[] emp){
        return getSalarySum(emp) / emp.length;
    }
    public static void printAllNames(Employee[] employees){
        for (Employee employee : employees){
            System.out.println(employee.getFullName());
        }
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 10500);
        employees[1] = new Employee("Петров Петр Петрович", 2, 243000);
        employees[2] = new Employee("Васильев Василий Васильевич", 3, 133000);
        employees[3] = new Employee("Сидоров Вениамин Валентинович", 4, 6050);
        employees[4] = new Employee("Владимиров Владимир Владимирович", 5, 26760);
        employees[5] = new Employee("Смирнов Аркадий Аркадьевич", 1, 25400);
        employees[6] = new Employee("Иванова Анна Александровна", 3, 34500);
        employees[7] = new Employee("Игорев Игорь Игоревич", 1, 10000);
        employees[8] = new Employee("Сазонов Олег Никифорович", 4, 70030);
        employees[9] = new Employee("Пушкина Инна Григорьевна", 5, 61188);
        printAll(employees);
        System.out.println("Сумма ЗП: " + getSalarySum(employees));
        System.out.println("Минимальная ЗП : " + getMinSalart(employees));
        System.out.println("Максимальная ЗП: " + getMaxSalart(employees));
        System.out.println("Среднее ЗП: " + getAverageSalary(employees));
        printAllNames(employees);
    }

}



