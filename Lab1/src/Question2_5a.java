import java.util.ArrayList;

public class Question2_5a {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);

        int elementToRemove = 3;

        boolean removed = removeElement(arrList, elementToRemove);

        if (removed) {
            System.out.println("Phần tử " + elementToRemove + " đã được loại bỏ: " + arrList);
        } else {
            System.out.println("Phần tử " + elementToRemove + " không tồn tại trong mảng.");
        }
    }

    // Hàm kiểm tra phần tử và trả về true false
    private static boolean removeElement(ArrayList<Integer> arrList, int elementToRemove) {
        // Kiểm tra xem phần tử tồn tại trong mảng hay không
        if (arrList.contains(elementToRemove)) {
            arrList.remove(Integer.valueOf(elementToRemove)); // Loại bỏ phần tử đầu tiên cụ thể
            return true;
        } else {
            return false;
        }
    }
}
