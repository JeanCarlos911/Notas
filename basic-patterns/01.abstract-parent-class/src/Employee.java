public abstract class Employee {
    String name;
    String ID;

    // invariable part
    public Employee(String empName, String empID) {
        name = empName;
        ID = empID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String toString() {
        return " Emp Name:: " + getName() + " EmpID:: " + getID();
    }

    public void save() {
        FileUtil fUtil = new FileUtil();
        fUtil.writeToFile("emp.txt", this.toString(), true, true);
    }

    // variable part of the behavior
    public abstract String computeCompensation();
}
