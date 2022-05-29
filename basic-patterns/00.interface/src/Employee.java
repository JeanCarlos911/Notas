public class Employee {
    SalaryCalculator empType;
    String name;

    public Employee(String name, SalaryCalculator empType) {
        this.name = name;
        this.empType = empType;
    }

    public void display() {
        System.out.println("Name=" + name);
        System.out.println("salary= " + empType.getSalary());
    }
}