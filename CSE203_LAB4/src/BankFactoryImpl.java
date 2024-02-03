// BankFactoryImpl class implementing BankFactory interface
public class BankFactoryImpl implements BankFactory {
    @Override
    public Bank createBank(String bankName) {
        if ("TPBANK".equalsIgnoreCase(bankName)) {
            return new TPBank();
        } else if ("VIETCOMBANK".equalsIgnoreCase(bankName)) {
            return new VietcomBank();
        } else {
            throw new IllegalArgumentException("Unsupported bank: " + bankName);
        }
    }
}
