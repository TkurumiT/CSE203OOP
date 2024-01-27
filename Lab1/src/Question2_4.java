public class Question2_4 {
    public static void main(String[] args) {
        // Arraylist
        int[] soNguyen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // tạo method tính tổng
        int tong = tinhTongSoChan(soNguyen);
        // Hiển thị kết quả
        System.out.println("Tổng các số chẵn: " + tong);
    }
    private static int tinhTongSoChan(int[] mang) {
        int tong = 0;
        for (int so : mang) {
            // Kiểm tra nếu số là số chẵn
            if (so % 2 == 0) {
                // Thêm số chẵn vào tổng
                tong += so;
            }
        }
        return tong;
    }
}
