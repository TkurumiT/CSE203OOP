public class BankAccount {
    private int accNum;
    private String name;
    private double balance;

    public BankAccount(int accNum, String name, double balance) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Gửi tiền thành công. Số dư mới: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rút tiền thành công. Số dư mới: " + balance);
        } else {
            System.out.println("Không đủ tiền.");
        }
    }

    public void transferMoney(BankAccount targetAccount, double amount) {
        if (balance >= amount) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Chuyển tiền thành công. Số dư mới: " + balance);
        } else {
            System.out.println("Không đủ tiền.");
        }
    }
}


