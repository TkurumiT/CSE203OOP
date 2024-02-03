 import java.util.HashMap;
import java.util.Map;

public class TuDien {
    private Map<String, TuDienEntry> tuDienMap;

    public TuDien() {
        tuDienMap = new HashMap<>();
        // Thêm các từ vào từ điển
        themTuVaoTuDien("Hello", "Xin chào");
        themTuVaoTuDien("Goodbye", "Tạm biệt");
        themTuVaoTuDien("Computer", "Máy tính");
        themTuVaoTuDien("Name", "Tên");
        themTuVaoTuDien("Dog", "Chó");
        themTuVaoTuDien("Cat", "Mèo");
        themTuVaoTuDien("Mouse", "Chuột");
        themTuVaoTuDien("House", "Nhà");
        themTuVaoTuDien("Boy", "Chàng trai");
        themTuVaoTuDien("Girl", "Cô gái");
    }

    public void themTuVaoTuDien(String tu, String yNghia) {
        TuDienEntry tuDienEntry = new TuDienEntry(tu, yNghia);
        tuDienMap.put(tu, tuDienEntry);
    }

    public boolean kiemTraTuTonTai(String tu) {
        return tuDienMap.containsKey(tu);
    }

    public String timNghiaTu(String tu) {
        TuDienEntry TuDien = tuDienMap.get(tu);
		if (TuDien != null) {
            return TuDien.getyNghia();
        }
        return null;
    }
}
