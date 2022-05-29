public class SalesRep extends Employee {
    // variable part behavior
    public String computeCompensation() {
        return "sales Rep Salary is Base + commission + allowance - tax deductions";
    }

    public SalesRep(String name, SalaryCalculator empType) {
        super(name, empType);
    }
}
