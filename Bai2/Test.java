/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;
  /**
 *
 * @author Admin
 */
 
public class Test {

     public static void main(String [] args){
         DanhSachHinh ds = new DanhSachHinh();
        ds.Them(new HinhChuNhat(4,3));   
        ds.Them(new HinhTron(4));
        ds.Indanhsach();
     }
}


