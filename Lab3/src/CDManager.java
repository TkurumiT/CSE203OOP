import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CDManager {
    private ArrayList<CD> danhSachCD;

    public CDManager() {
        this.danhSachCD = new ArrayList<>();
    }

    public void themCD(CD cd) {
        danhSachCD.add(cd);
    }

    public CD timCDTheoId(int cdId) {
        for (CD cd : danhSachCD) {
            if (cd.getCdId() == cdId) {
                return cd;
            }
        }
        return null;
    }

    public void timTheoTieuDe(String tieuDe) {
        for (CD cd : danhSachCD) {
            if (cd.getTieuDe().equalsIgnoreCase(tieuDe)) {
                System.out.println(cd);
            }
        }
    }

    public void timTheoBoSuuTap(String boSuuTap) {
        for (CD cd : danhSachCD) {
            if (cd.getBoSuuTap().equalsIgnoreCase(boSuuTap)) {
                System.out.println(cd);
            }
        }
    }

    public void timTheoLoaiCD(String loaiCD) {
        for (CD cd : danhSachCD) {
            if (cd.getLoaiCD().equalsIgnoreCase(loaiCD)) {
                System.out.println(cd);
            }
        }
    }

    public void xoaCDTheoId(int cdId) {
        CD cdCanXoa = timCDTheoId(cdId);
        if (cdCanXoa != null) {
            danhSachCD.remove(cdCanXoa);
            System.out.println("Đĩa CD đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy đĩa CD.");
        }
    }

    public void suaCDTheoId(int cdId) {
        CD cdCanSua = timCDTheoId(cdId);
        if (cdCanSua != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tiêu đề mới: ");
            String tieuDeMoi = scanner.nextLine();
            System.out.print("Nhập giá mới: ");
            double giaMoi = scanner.nextDouble();
            System.out.print("Nhập năm phát hành mới: ");
            int namPhatHanhMoi = scanner.nextInt();

            cdCanSua.setTieuDe(tieuDeMoi);
            cdCanSua.setGia(giaMoi);
            cdCanSua.setNamPhatHanh(namPhatHanhMoi);

            System.out.println("Thông tin đĩa CD đã được cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy đĩa CD.");
        }
    }

    public void hienThiDanhSachCD() {
        for (CD cd : danhSachCD) {
            System.out.println(cd);
        }
    }

    public void sapXepTheoNamPhatHanh() {
        Collections.sort(danhSachCD, Comparator.comparingInt(CD::getNamPhatHanh));
    }
}
