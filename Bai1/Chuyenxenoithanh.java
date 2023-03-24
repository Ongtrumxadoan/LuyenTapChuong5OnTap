/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class Chuyenxenoithanh extends ChuyenXe{
    public int sotuyen;
    public int sokmdiduoc;
    public double doanhthu;
    
 public Chuyenxenoithanh() {
    }

public Chuyenxenoithanh(String masochuyen, String hotentaixe, String soxe,int sotuyen, int sokmdiduoc, double doanhthu) {
      super(masochuyen, hotentaixe, soxe);
        this.sotuyen = sotuyen;
        this.sokmdiduoc = sokmdiduoc;
        this.doanhthu = doanhthu;
    }

        
    public int getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(int sotuyen) {
        this.sotuyen = sotuyen;
    }

    public int getSokmdiduoc() {
        return sokmdiduoc;
    }

    public void setSokmdiduoc(int sokmdiduoc) {
        this.sokmdiduoc = sokmdiduoc;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }

    
    public String toStringnt(){
        return "so tuyen la: "+this.sotuyen+"\n"+"so km di duoc la: "+this.sokmdiduoc+"\n"+"doanh thu la: "+this.doanhthu;
    }
}
