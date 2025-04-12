/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NHACUNGCAP;

import DOAN.Controller;
import static DOAN.Controller.getJDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heheh
 */
public class NccController extends Controller{
    public void themNCC(NHACUNGCAP nhap) {
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO nha_cung_cap(idnhacungcap, tennhacungcap, sdt) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nhap.getIDNCC());
            ps.setString(2, nhap.getTenNCC());
            ps.setString(3, nhap.getSDTNCC());

            int rs = ps.executeUpdate();
            if (rs != 0) {
                System.out.println("Thêm Thành Công");
            } else {
                System.out.println("Thêm Thất Bại");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void XoaID(int id) throws SQLException {
        String sql = "DELETE FROM nha_cung_cap WHERE IDnhacungcap = ?";
        try (Connection con = getJDBCConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }

    public void CapNhatDong(String ten, String sdt, int id) {
        Connection conn = getJDBCConnection();
              try {
            String sql = "UPDATE nha_cung_cap SET tenNHACUNGCAP=?, SDT=? WHERE idnhacungcap=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, ten);
            statement.setString(2, sdt);
            statement.setInt(3, id);
            statement.executeUpdate();
        System.out.println("Cập Nhật Ncc Thành Công !");
        } catch (SQLException e) {
            System.out.println("Cập Nhật Ncc Thất Bại !");
        }
    }
}
