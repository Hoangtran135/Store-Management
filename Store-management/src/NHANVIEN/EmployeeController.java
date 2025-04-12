/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NHANVIEN;

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
public class EmployeeController extends Controller {

    public void themNV(Employee nhap) {
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO nhan_vien(idnhanvien, tennhanvien, sdt, diachi, gioitinh) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nhap.getID());
            ps.setString(2, nhap.getName());
            ps.setString(3, nhap.getSdt());
            ps.setString(4, nhap.getAddress());
            ps.setString(5, nhap.getGender());

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
        String sql = "DELETE FROM nhan_vien WHERE IDnhanvien = ?";
        try (Connection con = getJDBCConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }
    public void CapNhatDong(String ten, String gioiTinh, String sdt, String diaChi, int id) {
        Connection conn = getJDBCConnection();
        try {
            String sql = "UPDATE nhan_vien SET tennhanvien=?, gioitinh=?, SDT=?, Diachi=? WHERE idnhanvien=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, ten);
            statement.setString(2, gioiTinh);
            statement.setString(3, sdt);
            statement.setString(4, diaChi);
            statement.setInt(5, id);
            statement.executeUpdate();
            System.out.println("Cập Nhật Nhân Viên Thành Công !");
        } catch (SQLException e) {
            System.out.println("Cập Nhật Nhân Viên Thất Bại !");
        }
    }
}
