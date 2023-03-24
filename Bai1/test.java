/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Bai1;

/**
 *
 * @author Admin
 */
public class test {

    public static void main(String[] args) {
        Chuyenxenoithanh cxnt1 =new Chuyenxenoithanh("01", "vu trong phuong", "011", 5, 1000, 1500);
        Chuyenxenoithanh cxnt2 =new Chuyenxenoithanh("02", "tran cong dat", "02", 6, 2000, 3000);
        System.out.println(cxnt1.toString()+cxnt1.toStringnt());
        System.out.print(cxnt2.toString()+cxnt2.toStringnt());
        System.out.println("""
                           
                           Tong doanh thu la:"""+(cxnt1.getDoanhthu()+cxnt2.getDoanhthu()));
    }
}
