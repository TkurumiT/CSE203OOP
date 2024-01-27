public class Employee {
    private String employeeCode;
    private String fullName;
    private int yearsOfWork;
    private double salaryCoefficient;
    private double basicSalary;

    public Employee(String employeeCode, String fullName, int yearsOfWork, double salaryCoefficient, double basicSalary) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.yearsOfWork = yearsOfWork;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return salaryCoefficient * basicSalary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearsOfWork() {
        return yearsOfWork;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}

