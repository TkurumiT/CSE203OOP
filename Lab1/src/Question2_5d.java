import java.util.ArrayList;
import java.util.HashSet;

public class Question2_5d {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 3, 2, 4};

        int[] result = removeDuplicates(arr);

        System.out.print("Mảng sau khi loại bỏ giá trị trùng lặp: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Hàm loại bỏ các giá trị trùng lặp từ mảng và trả về mảng mới
    private static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (uniqueElements.add(num)) {
                // Nếu giá trị chưa tồn tại trong set, thêm vào mảng kết quả
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
