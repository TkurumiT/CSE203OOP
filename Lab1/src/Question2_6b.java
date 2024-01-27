import java.util.Scanner;

public class Question2_6b{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//Nhập chuỗi
		System.out.print("nhập chuỗi: ");
		String inputString = sc.nextLine();
		//hàm dếm số từ trong chuỗi
		int wordcount = countWords(inputString);
		//hiển thị kết quả 
		System.out.println("Số từ trong chuỗi: " + wordcount);
		
		sc.close();
	}
	//hàm đếm số từ trong chuỗi
	private static int countWords(String string) {
		// dùng splt tách chuỗi
		String[]Words = string.split("\\s+");
		
		return Words.length;
	}
}