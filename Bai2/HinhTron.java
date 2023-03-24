/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;
  import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HinhTron extends Hinh{
 
 
    public float r;
    

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public HinhTron(float r) {
        this.r = r;
    }

    public HinhTron() {
    }
    
    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }
    @Override
    public double dientich(){
        return 0;
    }
}
