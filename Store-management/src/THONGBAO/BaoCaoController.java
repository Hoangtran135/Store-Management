package THONGBAO;

import DOAN.Controller;
import java.util.Date;

public class BaoCaoController extends Controller{
        static Date c = null;
    static Date d = null;
     public Date laydulieudate(Date a, Date b, int k, boolean h) {
        Date e = null;
        if (h == true) {
            c = a;
            d = b;
        }
        if (h == false) {
            if (k == 0) {
                return c;
            }
            if (k == 1) {
                return d;
            }
        }
        return e;
    }
    
}
