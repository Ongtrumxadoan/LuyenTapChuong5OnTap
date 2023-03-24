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

public class DanhSachHinh {
 public ArrayList <Hinh> hinh= new ArrayList<>();
 
 
     
 
    
public DanhSachHinh(){
 } 
public void Them(Hinh dshinh){
    hinh.add(dshinh);
}
public void Indanhsach (){
    for (Hinh i:hinh){
        System.out.println(i.toString());
}
}
}
