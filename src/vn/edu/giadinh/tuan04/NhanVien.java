package vn.edu.giadinh.tuan04;

public class NhanVien {
    //attribute - thuộc tính
    String tenNV;
    String maNV;
    String luong;

    //method - function
    void setTenNV(String a){
        tenNV = a;
    }
    void setMaNV(String b){
        maNV = b;
    }
    void setLuong(String c){
        luong = c;
    }
    String getTenNV(){       
        return tenNV;
    }
    String getMaNV(){
        return maNV;
    }
    String getLuong(){       
        return luong;
    }
    public void remove(NhanVien tam) {
    }
}
