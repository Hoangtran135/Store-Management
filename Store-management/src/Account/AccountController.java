package Account;

import DOAN.Controller;
import static DOAN.Controller.getJDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heheh
 */
public class AccountController extends Controller{
    

 public boolean login(String username, String password) {
        Connection conn = getJDBCConnection();
        String sql = "SELECT * FROM accounts WHERE username = ? and password = ?";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
  public void dangki1(Account account) {
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO accounts(idnhanvien,username, password) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, account.getId());
            ps.setString(2, account.getUsername());
            ps.setString(3, account.getPassword());

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
}