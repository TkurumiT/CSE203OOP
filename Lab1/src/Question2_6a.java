import java.util.Scanner;

public class Question2_6a{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi :");
		//nhập chuỗi
		String inputString = sc.nextLine(); 
		// tìm độ dài chuỗi
		int length = findStringlength(inputString);
		System.out.println("Độ dài chuỗi: " + length);
		sc.close();
	}
	//hàm tìm độ dài chuỗi
	private static int findStringlength(String str) {
		return str.length();
	}
}