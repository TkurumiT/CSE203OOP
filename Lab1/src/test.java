public class test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 3, 2, 4};

        findAndPrintDuplicates(arr);
    }

    // Hàm tìm và in ra các giá trị trùng lặp trong mảng
    private static void findAndPrintDuplicates(int[] arr) {
        System.out.print("Các giá trị trùng lặp trong mảng: ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;  
                }
            }
        }
    }
}
