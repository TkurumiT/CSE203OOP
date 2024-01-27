import java.util.ArrayList;

public class BankAccountList {
    private ArrayList<BankAccount> accounts;

    public BankAccountList() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void printAccountList() {
        for (BankAccount account : accounts) {
            System.out.println("Số tài khoản: " + account.getAccNum());
            System.out.println("Tên: " + account.getName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("-------------------------");
        }
    }

    public BankAccount findAccount(int accNum) {
        for (BankAccount account : accounts) {
            if (account.getAccNum() == accNum) {
                return account;
            }
        }
        return null;
    }
}
