package BaiThucHanh.NhanVien;
import NhanVien.util.Configs;

public class FullTimeEmployee extends Employee{
    protected int ngayLamThem;
    protected int chucVu; 

    public FullTimeEmployee(String ten){
        this.ten = ten;
    }

    public FullTimeEmployee(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int chucVu){
        this.chucVu = chucVu;
    }

    @Override
    public String loaiNhanVien(){
        if(chucVu == Configs.NHAN_VIEN_SEP){
            return "Nhan vien sep.";
        } else {
            return "Nhan vien linh.";
        }
    }

    public void tinhLuong(){
        if(chucVu == Configs.NHAN_VIEN_SEP){
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}