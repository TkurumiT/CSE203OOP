import java.util.Scanner;

// Main class for testing
public class Main2 {
    public static void main(String[] args) {
        // Input bank name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bank name (TPBANK or VIETCOMBANK): ");
        String bankName = scanner.next();

        // Use Factory to create Bank object
        BankFactory bankFactory = new BankFactoryImpl();
        Bank bank = bankFactory.createBank(bankName);

        // Print bank name
        System.out.println("Bank Name: " + bank.getBankName());
    }
}
