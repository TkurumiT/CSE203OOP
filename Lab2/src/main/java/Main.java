import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountList accountList = new BankAccountList();
        
        System.out.print("Nhập số lượng tài khoản (N): ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Nhập thông tin tài khoản: " + (i + 1));
            System.out.print("Số tài khoản: ");
            int accNum = scanner.nextInt();
            System.out.print("Tên: ");
            scanner.nextLine(); 
            String name = scanner.nextLine();
            System.out.print("Nhập số dư ban đầu: ");
            double initialBalance = scanner.nextDouble();

            BankAccount account = new BankAccount(accNum, name, initialBalance);
            accountList.addAccount(account);
        }

        System.out.println("Account List:");
        accountList.printAccountList();
        System.out.print("Nhập số tài khoản mà bạn muón gửi: ");
        int depositAccNum = scanner.nextInt();
        BankAccount depositAccount = accountList.findAccount(depositAccNum);
        if (depositAccount != null) {
            System.out.print("Nhập số lượng tiền muốn gửi: ");
            double depositAmount = scanner.nextDouble();
            depositAccount.deposit(depositAmount);
        } else {
            System.out.println("Tài khoản không tìm thấy.");
        }

        System.out.print("Nhập số tài khoản muốn rút: ");
        int withdrawAccNum = scanner.nextInt();
        BankAccount withdrawAccount = accountList.findAccount(withdrawAccNum);
        if (withdrawAccount != null) {
            System.out.print("Nhập số tiền rút: ");
            double withdrawAmount = scanner.nextDouble();
            withdrawAccount.withdraw(withdrawAmount);
        } else {
            System.out.println("Tài khoản không tìm thấy. ");
        }

        // - Transfer
        System.out.print("Nhập số tài khoản nguồn để chuyển: ");
        int sourceAccNum = scanner.nextInt();
        BankAccount sourceAccount = accountList.findAccount(sourceAccNum);
        if (sourceAccount != null) {
            System.out.print("Nhập số tài khoản mục tiêu để chuyển: ");
            int targetAccNum = scanner.nextInt();
            BankAccount targetAccount = accountList.findAccount(targetAccNum);
            if (targetAccount != null) {
                System.out.print("Nhập số tiền chuyển: ");
                double transferAmount = scanner.nextDouble();
                sourceAccount.transferMoney(targetAccount, transferAmount);
            } else {
                System.out.println("Không tìm thấy tài khoản mục tiêu.");
            }
        } else {
            System.out.println("Không tìm thấy tài khoản nguồn.");
        }
    }
}

