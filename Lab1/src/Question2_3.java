import java.util.Scanner;

public class Question2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số dương: ");
        int n = scanner.nextInt();

        System.out.println("Dãy Hailstone cho số " + n + " là:");
        hailstoneSequence(n);

        scanner.close();
    }

    private static void hailstoneSequence(int n) {
        while (n != 1) {
            System.out.println( n + " sau mỗi dòng tính toán ");
            if (n % 2 == 0) {
            	//chia /2
                System.out.println("is even");
                n = n / 2;
            } else {
            	// nhân 3 + 1
                System.out.println("is odd");
                n = 3 * n + 1;
            }
        }
        // Hiển thị số cuối luôn là 1
        System.out.println("N = " + n + " sau mỗi dòng tính toán");
    }
}