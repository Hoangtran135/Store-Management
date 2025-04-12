/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOADON;

import DOAN.Controller;
import static DOAN.Controller.getJDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heheh
 */
public class BanHangController extends Controller {

    public int truyxuat() {
        Connection conn = getJDBCConnection();
        String sql = "SELECT MAX(IDHOADON) AS max_id FROM doan.hoa_don;";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int maxId = resultSet.getInt("max_id");
                return maxId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
     public int truyxuat2(String name) {
        Connection conn = getJDBCConnection();
        String sql = "SELECT IDNHAPKHO as id  FROM doan.kho_hang1 where TENSANPHAM = '"+ name+"'";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet resultSet = st.executeQuery();
                         if (resultSet.next()) {
                int Id = resultSet.getInt("id");
                
                
                return Id;
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        }
        return 0;
    }
      public int truyxuat3(String name) {
        Connection conn = getJDBCConnection();
        String sql = "SELECT SOLUONG as sl  FROM doan.kho_hang1 where TENSANPHAM = '"+ name+"'";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet resultSet = st.executeQuery();
                         if (resultSet.next()) {
                int sl = resultSet.getInt("sl");
                             System.out.println(sl);
                
                return sl;
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        }
        return 0;
      }
        public int truyxuat4(String name) {
        Connection conn = getJDBCConnection();
        String sql = "SELECT IDSANPHAM as id  FROM doan.san_pham where TENSANPHAM = '"+ name+"'";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet resultSet = st.executeQuery();
                         if (resultSet.next()) {
                int id = resultSet.getInt("id");
                
                
                return id;
            }
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        }
        return 0;
    }
    public void themchitiet(String name, int soluong) {
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO hang_ban(IDHOADON,IDSANPHAM, TENSANPHAM, SOLUONG) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, truyxuat());
            ps.setInt(2,truyxuat4(name));
            ps.setString(3, name);
            ps.setInt(4, soluong);
            int rs = ps.executeUpdate();
            if (rs != 0) {
                System.out.println("Thêm Thành Công");
            } else {
                System.out.println("Thêm Thất Bại");
            }
        } catch (SQLException ex) {
            System.out.println("Thêm Chi Tiết Hóa Đơn Thất Bại: " + ex.getMessage());
        }
    }

    public void xulykhohang(String name, int soluong) {
        try {
            Connection con = this.getJDBCConnection();
            String sql = "UPDATE kho_hang1\n"
                    + "SET SOLUONG = SOLUONG - ?\n"
                    + "WHERE IDNHAPKHO = ?;";
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setInt(1, soluong);
           System.out.println(soluong);
            st.setInt(2, truyxuat2(name));
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Xử Lý Kho Thất Bại"+ e.getMessage());
        }

    }

    public ArrayList<BANHANGG> listSp() {
        ArrayList<BANHANGG> listS = new ArrayList<>();
        try {
            Connection conn = this.getJDBCConnection();
            String sql = "select tensanpham ,gianhap from san_pham ;";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                BANHANGG sp = new BANHANGG();
                sp.setTensanpham(rs.getString(1));
                sp.setGia(rs.getInt(2));
                listS.add(sp);
            }
        } catch (Exception e) {
            System.out.println("Lỗi Thêm Danh Sách");
        }
        return listS;
    }

    public int gianhap(String sp) {
        int price = 0;
        try {
            Connection conn = this.getJDBCConnection();
            String sql = "select  gianhap from san_pham where TENSANPHAM=? ;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, sp);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                price = rs.getInt(1);
                return price;
            }
        } catch (Exception e) {
        }
        return price;
    }

    public void SuaBill(int total, LocalDate date) {
        try {
            Connection con = this.getJDBCConnection();
            String sql = "INSERT INTO hoa_don(IDHOADON, Tongtien, ngaylap) VALUES (?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, truyxuat() + 1);
            st.setInt(2, total);
            st.setDate(3, java.sql.Date.valueOf(date));
            st.executeUpdate();

        } catch (Exception e) {

            System.out.println("Thêm Hóa Đơn Thất Bại: " + e.getMessage());
        }
    }
}
