package JavaBasicCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp1 {  // Kept the Emp1 class name
    private int EmpId;
    private String name;
    private double salary;

    public Emp1(int empId, String name, double salary) {
        EmpId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", EmpId=" + EmpId +
                '}';
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class ThirdHigestSalaryOfEmp {
    private static double findthirdsalary(Emp1[] employees) {
        Arrays.sort(employees, Comparator.comparingDouble(Emp1::getSalary).reversed());
        if(employees.length>=3){
            return employees[2].getSalary();
        }else {
            System.out.println("Not enough employees to find the third-highest salary.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Emp1 e1 = new Emp1(1, "John Doe", 50000.0);
        Emp1 e2 = new Emp1(2, "Jane Doe", 60000.0);
        Emp1 e3 = new Emp1(3, "Alice Smith", 75000.0);
        Emp1 e4 = new Emp1(4, "Bob Johnson", 80000.0);
        Emp1 e5 = new Emp1(5, "Eva Williams", 70000.0);
        Emp1 e6 = new Emp1(6, "Jatinm", 85000.0);

        Emp1[] employees = {e1, e2, e3, e4, e5, e6};
        double thirdHighestSalary = findthirdsalary(employees);
        System.out.println("Third Highest Salary: " + thirdHighestSalary);

        double third1 = Arrays.stream(employees)
                .mapToDouble(Emp1::getSalary)
                .distinct()
                .sorted()
                .skip(Math.max(0, employees.length - 3))
                .findFirst()
                .orElse(-1);
        System.out.println(third1);

        Double third2 = Arrays.asList(employees).stream()
                .map(a -> a.getSalary())
                .sorted(Comparator.reverseOrder())
                .skip(Math.max(0, 2))
                .findFirst()
                .orElse(-1d);
        System.out.println(third2);

        List<Double> l2 = Arrays.asList(employees).stream()
                .map(a -> a.getSalary())
                .sorted()
                .skip(Math.max(0, employees.length - 3))
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
