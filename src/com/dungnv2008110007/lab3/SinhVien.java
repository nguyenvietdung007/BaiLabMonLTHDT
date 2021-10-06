package com.dungnv2008110007.lab3;

public class SinhVien {
    //attribute - thuộc tính
    String ten;
    float diem;

    //method - function
    void setTen(String bienTen){
        ten = bienTen;
    }
    void setDiem(float bienDiem){
        diem = bienDiem;
    }
    String getTen(){
        return ten;
    }
    float getDiem(){
        return diem;
    }
    void hocLuc(){
        if(diem < 5){
            System.out.println("Yếu");
        }
        else{
            if(5 <= diem && diem < 6.5){
                System.out.println("Trung Bình");
            }
            else{
                if(6.5 <= diem && diem < 7.5){
                    System.out.println("Khá");
                }
                else{
                    if(7.5 <= diem && diem < 9){
                        System.out.println("Giỏi");
                    }
                    else
                        System.out.println("Xuất Sắc");
                }
            }
        }
    }
    


}
