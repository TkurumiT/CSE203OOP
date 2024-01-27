import java.util.Scanner;

public class Question2_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();
        int tong = tinhTongChuSoDauVaCuoi(so);
        System.out.println("Sum chữ số đầu và cuối của số " + so + " là: " + tong);
        scanner.close();
    }
    private static int tinhTongChuSoDauVaCuoi(int so) {
        int chuSoDau = Character.getNumericValue(Integer.toString(so).charAt(0));
        int chuSoCuoi = so % 10;
        int tong = chuSoDau + chuSoCuoi;
        return tong;
    }
}
