/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package THONGBAO;

import DOAN.Controller;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.time.Instant;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import DOAN.HOME;

/**
 *
 * @author heheh
 */
public class THONGKEBAOCAO extends javax.swing.JFrame {

    BaoCaoController Account1;

    /**
     * Creates new form THONGKEBAOCAO
     */
    public THONGKEBAOCAO() {
        initComponents();
        Account1 = new BaoCaoController();

        //  txtDen.show(false);
    }
    int k = 100;

    public int setluachon(int a) {
        if (a == 0) {
            btnTonKho.setBackground(new java.awt.Color(0, 204, 204));
            btnDoanhThu.setBackground(new java.awt.Color(0, 102, 102));
            btnHetHan.setBackground(new java.awt.Color(0, 102, 102));
            k = a;
            this.txtDaChon.setText("TỒN KHO");

            Onoff(false);
            return a;
        }
        if (a == 1) {
            btnDoanhThu.setBackground(new java.awt.Color(0, 204, 204));
            btnTonKho.setBackground(new java.awt.Color(0, 102, 102));
            btnHetHan.setBackground(new java.awt.Color(0, 102, 102));
            k = a;
            this.txtDaChon.setText("DOANH THU");
            Onoff(true);
            return a;
        }
        if (a == 2) {
            btnHetHan.setBackground(new java.awt.Color(0, 204, 204));
            btnDoanhThu.setBackground(new java.awt.Color(0, 102, 102));
            btnTonKho.setBackground(new java.awt.Color(0, 102, 102));
            k = a;
            this.txtDaChon.setText("HẾT HẠN");
            Onoff(false);
            return a;
        } else {
            return k;
        }
    }

    public void Onoff(boolean a) {
        this.txtDen1.setVisible(a);
        this.txtTU.setVisible(a);
        this.txtTU1.setVisible(a);
        this.txtDEN.setVisible(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTonKho = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnHetHan = new javax.swing.JButton();
        txtTU = new com.toedter.calendar.JDateChooser();
        txtTU1 = new javax.swing.JLabel();
        txtDen1 = new javax.swing.JLabel();
        txtDEN = new com.toedter.calendar.JDateChooser();
        btnTimKiem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDaChon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thống Kê Báo Cáo");

        jPanel1.setBackground(new java.awt.Color(150, 134, 134));

        jPanel2.setBackground(new java.awt.Color(22, 121, 121));

        btnTonKho.setBackground(new java.awt.Color(0, 102, 102));
        btnTonKho.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnTonKho.setForeground(new java.awt.Color(255, 255, 255));
        btnTonKho.setText("Tồn Kho");
        btnTonKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTonKhoActionPerformed(evt);
            }
        });

        btnDoanhThu.setBackground(new java.awt.Color(0, 102, 102));
        btnDoanhThu.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        btnDoanhThu.setText("Doanh Thu");
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(0, 102, 102));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnHetHan.setBackground(new java.awt.Color(0, 102, 102));
        btnHetHan.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnHetHan.setForeground(new java.awt.Color(255, 255, 255));
        btnHetHan.setText("Hết Hạn");
        btnHetHan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHetHanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
            .addComponent(btnTonKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHetHan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnDoanhThu)
                .addGap(18, 18, 18)
                .addComponent(btnTonKho)
                .addGap(18, 18, 18)
                .addComponent(btnHetHan)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtTU.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtTUAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtTU1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtTU1.setForeground(new java.awt.Color(255, 255, 255));
        txtTU1.setText("Từ:");

        txtDen1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtDen1.setForeground(new java.awt.Color(255, 255, 255));
        txtDen1.setText("Đến:");

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(0, 102, 102));
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mục Đã Chọn:");

        txtDaChon.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTU1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTU, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txtDen1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDEN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTU1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDEN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setText("Thống Kê Báo Cáo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        setluachon(1);
        this.setBackground(Color.RED);
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnTonKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTonKhoActionPerformed
        setluachon(0);
    }//GEN-LAST:event_btnTonKhoActionPerformed

    private void txtTUAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtTUAncestorAdded

    }//GEN-LAST:event_txtTUAncestorAdded

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        int a = setluachon(3);

        btnDoanhThu.setBackground(new java.awt.Color(0, 102, 102));
        btnTonKho.setBackground(new java.awt.Color(0, 102, 102));
        if (a == 1) {
            if (txtTU.getDate().equals("") || txtDEN.getDate().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Ngày");

            } else {
                Date thedate = txtTU.getDate();
                Date thedate2 = txtDEN.getDate();
                Account1.laydulieudate(thedate, thedate2, 2, true);
                JFrame DT = new DoanhThu();
                DT.setSize(950, 460);
                DT.setVisible(true);
            }
        }
        if (a == 0) {
            JFrame TK = new TonKho();
            TK.setSize(950, 460);
            TK.setVisible(true);
        }
        if (a == 2) {
            JFrame HH = new HetHan();
            HH.setSize(950, 460);
            HH.setVisible(true);
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame Home = new HOME();
        Home.setSize(880, 500);
        Home.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnHetHanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHetHanActionPerformed
        // TODO add your handling code here:
        setluachon(2);
    }//GEN-LAST:event_btnHetHanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(THONGKEBAOCAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THONGKEBAOCAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THONGKEBAOCAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THONGKEBAOCAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new THONGKEBAOCAO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnHetHan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTonKho;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser txtDEN;
    private javax.swing.JTextField txtDaChon;
    private javax.swing.JLabel txtDen1;
    private com.toedter.calendar.JDateChooser txtTU;
    private javax.swing.JLabel txtTU1;
    // End of variables declaration//GEN-END:variables

    private void setBackgroundAt(int i, Color RED) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
