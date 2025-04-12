package KHO;

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
public class KhoController extends Controller {

    public void themKHO(KHOHANGG nhap) {
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO kho_hang1(idnhapkho, tensanpham, soluong, dongia) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nhap.getIdnhaphang());
            ps.setString(2, nhap.getTensanpham());
            ps.setString(3, nhap.getSoLuong());
            ps.setString(4, nhap.getDonGia());

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
        String sql = "DELETE FROM kho_hang1 WHERE IDnhapkho = ?";
        try (Connection con = getJDBCConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }

    public void CapNhatDong(String Ten, String SoLuong, String Dongia, int id) {
        Connection conn = getJDBCConnection();
        try {
            String sql = "UPDATE kho_hang1 SET tensanpham=?, Soluong=?, DonGia=? WHERE idnhapkho=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Ten);
            statement.setString(2, SoLuong);
            statement.setString(3, Dongia);
            statement.setInt(4, id);
            statement.executeUpdate();
            System.out.println("Cập Nhật Kho Thành Công !");
        } catch (SQLException e) {
            System.out.println("Cập Nhật Kho Thất Bại !");
        }
    }
}
