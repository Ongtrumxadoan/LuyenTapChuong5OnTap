/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class ChuyenXe {
    public String masochuyen;
    public String Hotentaixe;
    public String Soxe;

    public ChuyenXe() {
    }

    public ChuyenXe(String masochuyen, String Hotentaixe, String Soxe) {
        this.masochuyen = masochuyen;
        this.Hotentaixe = Hotentaixe;
        this.Soxe = Soxe;
    }

    public String getMasochuyen() {
        return masochuyen;
    }

    public void setMasochuyen(String masochuyen) {
        this.masochuyen = masochuyen;
    }

    public String getHotentaixe() {
        return Hotentaixe;
    }

    public void setHotentaixe(String Hotentaixe) {
        this.Hotentaixe = Hotentaixe;
    }

    public String getSoxe() {
        return Soxe;
    }

    public void setSoxe(String Soxe) {
        this.Soxe = Soxe;
    }
    @Override
    public String toString(){
        return "ma so chuyen la: "+ this.masochuyen+"\n"+"Ho ten tai xe la: "
                +this.Hotentaixe+"\n"+ "so xe la: "+this.Soxe+"\n";
    }
}
