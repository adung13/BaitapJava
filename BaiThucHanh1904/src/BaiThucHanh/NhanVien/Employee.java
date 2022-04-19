package BaiThucHanh.NhanVien;

import BaiThucHanh.Person;

public class Employee extends Person {
        protected String ten;
        protected long luong;
    
        public Employee(){
    
        }
    
        public Employee(String ten){
            this.ten = ten;
        }
    
        protected String loaiNhanVien(){
            return "";
        }
    
        public void xuatThongTin(){
            System.out.println("==== Nhan vien: " + ten + " ====");
            System.out.println("- Loai nhan vien: " + loaiNhanVien());
            System.out.println("- Luong: " + luong + " VND  ");
        }
    }