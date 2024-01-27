import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: (N): ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Nhập thông tin nhân viên: " + (i + 1));
            System.out.print("Mã nhân viên: ");
            String employeeCode = scanner.next();
            System.out.print("Họ và Tên: ");
            scanner.nextLine(); // Consume the newline character
            String fullName = scanner.nextLine();
            System.out.print("Số năm làm việc: ");
            int yearsOfWork = scanner.nextInt();
            System.out.print("Lương thưởng: ");
            double salaryCoefficient = scanner.nextDouble();
            System.out.print("Lương cơ bản: ");
            double basicSalary = scanner.nextDouble();

            Employee employee = new Employee(employeeCode, fullName, yearsOfWork, salaryCoefficient, basicSalary);
            employees.add(employee);
        }

        System.out.println("Báo cáo lương nhân viên: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.println("Mã nhân viên: " + employee.getEmployeeCode());
            System.out.println("Họ và Tên: " + employee.getFullName());
            System.out.println("Tính lương: " + employee.calculateSalary());
            System.out.println("-------------------------");
        }

        Employee highestSalaryEmployee = Collections.max(employees, Comparator.comparing(Employee::calculateSalary));
        System.out.println("Nhân viên có lương cao nhất: ");
        System.out.println("Mã nhân viên: " + highestSalaryEmployee.getEmployeeCode());
        System.out.println("Họ và Tên: " + highestSalaryEmployee.getFullName());
        System.out.println("Tính lương: " + highestSalaryEmployee.calculateSalary());

        Collections.sort(employees, Comparator.comparing(Employee::calculateSalary).reversed());
        System.out.println("Sắp xếp nhân viên dựa theo mức lương (descending):");
        for (Employee employee : employees) {
            System.out.println("Mã nhân viên: " + employee.getEmployeeCode());
            System.out.println("Họ và Tên: " + employee.getFullName());
            System.out.println("Tính lương: " + employee.calculateSalary());
            System.out.println("-------------------------");
        }
    }
}
