package BaiThucHanh.NhanVien;

import NhanVien.util.Configs;
public class PartTimeEmployee extends Employee{
    private int gioLamViec;

    public PartTimeEmployee(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu.";
    }

    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}