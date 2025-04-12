/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN;

import Account.Account;
import KHO.KHOHANGG;
import NHACUNGCAP.NHACUNGCAP;
import NHANVIEN.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heheh
 */
public class Controller {

    Connection conn = null;
    public static String url = "jdbc:mysql://localhost:3306/doan";
    public static String user = "root";
    public static String password = "123456";
    private static Controller intance;

    public static Connection getJDBCConnection() {
//        jdbc:mysql://127.0.0.1:3306/?user=root

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static Controller getInstance() {
        if (intance == null) {
            intance = new Controller();
        }
        return intance;
    }

    public Connection getConn() {

        return conn;
    }

    

    public void open() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            System.out.println("Kết Nối Thành Công");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
       public int executeUpdate(String sql) {
        int result = 0;
        try {
            Statement stm = conn.createStatement();
            result = stm.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet excuteQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
   