/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class chuyenxengoaithanh extends ChuyenXe{
    public String noiden;
    public int songaydiduoc;
    public double doanhthu;

    public chuyenxengoaithanh() {
    }

    public chuyenxengoaithanh(String masochuyen,String hotentaixe,String soxe,String noiden, int songaydiduoc, double doanhthu) {
        super(masochuyen, hotentaixe, soxe);
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
        this.doanhthu = doanhthu;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongaydiduoc() {
        return songaydiduoc;
    }

    public void setSongaydiduoc(int songaydiduoc) {
        this.songaydiduoc = songaydiduoc;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
    public String toStringngt(){
        return "noi den la: "+this.noiden+"\n"+"so ngay di duoc la: "+this.songaydiduoc+"\n"+"doanh thu la:"+this.doanhthu;
    }
}
