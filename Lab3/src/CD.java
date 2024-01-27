public class CD {
    private static int nextId = 1;

    private int cdId;
    private String boSuuTap;
    private String loaiCD;
    private String tieuDe;
    private double gia;
    private int namPhatHanh;

    public CD(String boSuuTap, String loaiCD, String tieuDe, double gia, int namPhatHanh) {
        this.cdId = nextId++;
        this.boSuuTap = boSuuTap;
        this.loaiCD = loaiCD;
        this.tieuDe = tieuDe;
        this.gia = gia;
        this.namPhatHanh = namPhatHanh;
    }

    public int getCdId() {
        return cdId;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public String getBoSuuTap() {
        return boSuuTap;
    }

    public String getLoaiCD() {
        return loaiCD;
    }
    public double getGia() {
        return gia;
    }

    public int getNamPhatHanh() {
        return namPhatHanh;
    }

    @Override
    public String toString() {
        return "CD{" +
                "cdId=" + cdId +
                ", boSuuTap='" + boSuuTap + '\'' +
                ", loaiCD='" + loaiCD + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", gia=" + gia +
                ", namPhatHanh=" + namPhatHanh +
                '}';
    }
}

