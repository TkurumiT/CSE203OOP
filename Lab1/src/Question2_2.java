import java.util.Scanner;

public class Question2_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print(" nhập Số thứ nhất: ");
        int so1 = scanner.nextInt();

        System.out.print("nhập Số thứ hai: ");
        int so2 = scanner.nextInt();

        System.out.print("nhập Số thứ ba: ");
        int so3 = scanner.nextInt();

        int nhoNhat = timSoNhoNhat(so1, so2, so3);

        System.out.println("Số nhỏ nhất " + so1 + ", " + so2 + " và " + so3 + " là: " + nhoNhat);
       
        scanner.close();
    }
   
    private static int timSoNhoNhat(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
