import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập từ cần tra cứu: ");
            String tuCanTim = scanner.nextLine();

            if (tuCanTim.equalsIgnoreCase("exit")) {
                System.out.println("Kết thúc chương trình.");
                break;
            }

            if (tuDien.kiemTraTuTonTai(tuCanTim)) {
                String nghia = tuDien.timNghiaTu(tuCanTim);
                System.out.println("Nghĩa của từ '" + tuCanTim + "': " + nghia);
            } else {
                System.out.println("Từ '" + tuCanTim + "' không tồn tại trong từ điển.");
            }
        }
    }
}
