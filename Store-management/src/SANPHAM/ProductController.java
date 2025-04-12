/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SANPHAM;

import DOAN.Controller;

/**
 *
 * @author heheh
 */
public class ProductController extends Controller {

    static int dulieu1;
    static String dulieu2;
    public String laydulieu1(String b, boolean k) {
        String a = null;
        if (k == true) {
            dulieu2 = b;
        }
        if (k == false) {
            return dulieu2;
        }
        return a;
    }
    public int laydulieu2(int b, boolean k) {
        int a = 0;
        if (k == true) {
            dulieu1 = b;
        }
        if (k == false) {
            return dulieu1;
        }
        return a;
    }
}
