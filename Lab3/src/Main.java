import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CDManager cdManager = new CDManager();

        int luaChon;
        do {
            System.out.println("Menu Quản Lý CD:");
            System.out.println("1. Thêm CD");
            System.out.println("2. Tìm kiếm CD theo tiêu đề");
            System.out.println("3. Tìm kiếm CD theo bộ sưu tập");
            System.out.println("4. Tìm kiếm CD theo loại");
            System.out.println("5. Xóa CD theo ID");
            System.out.println("6. Chỉnh sửa thông tin CD theo ID");
            System.out.println("7. Hiển thị tất cả các đĩa CD");
            System.out.println("8. Sắp xếp danh sách CD tăng dần theo năm phát hành");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                	System.out.print("Nhập tiêu đề: ");
                    scanner.nextLine();
                    System.out.print("Nhập bộ sưu tập (game/phim/nhạc): ");
                    String boSuuTap = scanner.next();
                    System.out.print("Nhập loại CD (âm thanh/video): ");
                    String loaiCD = scanner.next();
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double gia = scanner.nextDouble();
                    System.out.print("Nhập năm phát hành: ");
                    int namPhatHanh = scanner.nextInt();

                    CD cdMoi = new CD(boSuuTap, loaiCD, tieuDe, gia, namPhatHanh);
                    cdManager.themCD(cdMoi);
                    break;
                case 2:                  
                    System.out.print("Nhập tiêu đề CD cần tìm: ");
                    scanner.nextLine(); 
                    String tieuDeTimKiem = scanner.nextLine();
                    cdManager.timTheoTieuDe(tieuDeTimKiem);
                    break;
                case 3:
                    System.out.print("Nhập bộ sưu tập cần tìm (game/phim/nhạc): ");
                    String boSuuTapTimKiem = scanner.next();
                    cdManager.timTheoBoSuuTap(boSuuTapTimKiem);
                    break;
                case 4:
                    System.out.print("Nhập loại CD cần tìm (âm thanh/video): ");
                    String loaiCDTimKiem = scanner.next();
                    cdManager.timTheoLoaiCD(loaiCDTimKiem);
                    break;
                case 5:
                    System.out.print("Nhập ID CD cần xóa: ");
                    int idXoa = scanner.nextInt();
                    cdManager.xoaCDTheoId(idXoa);
                    break;
                case 6:
                    System.out.print("Nhập ID CD cần chỉnh sửa: ");
                    int idChinhSua = scanner.nextInt();
                    cdManager.suaCDTheoId(idChinhSua);
                    break;
                case 7:
                    cdManager.hienThiDanhSachCD();
                    break;
                case 8:
                    cdManager.sapXepTheoNamPhatHanh();
                    System.out.println("Danh sách CD đã được sắp xếp theo năm phát hành.");
                    break;
                case 9:
                    System.out.println("Ứng dụng kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (luaChon != 9);
    }
}
