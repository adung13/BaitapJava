
public class NhanVien {
    
    private String manv;
    private String tennv;
    private String diachi;

    public NhanVien(String manv, String tennv, String diachi) {
        this.manv = manv;
        this.tennv = tennv;
        this.diachi = diachi;
    }
    public void setma(String manv) {
        this.manv = manv;
    }
    public String getma() {
        return manv;
    }
    public void setten(String tennv) {
        this.tennv = tennv;
    }
    public String getten() {
        return tennv;
    }
    
    public void setdc(String diachi) {
        this.diachi = diachi;
    }

    public String getdc() {
        return diachi;
    }

        
}