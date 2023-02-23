package Database;

import static Database.koneksi.config;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;

public class penilaian extends javax.swing.JFrame {

    public penilaian() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        isNIM = new javax.swing.JTextField();
        isNama = new javax.swing.JTextField();
        matakuliah = new javax.swing.JComboBox<>();
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        Edit = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("NIM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Kelas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Mata Kuliah");

        isNIM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        isNama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        isNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isNamaActionPerformed(evt);
            }
        });

        matakuliah.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        matakuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KALKULUS", "ALPRO", "PRAKTIKUM ALPRO", "MATEMATIKA DISKRIT" }));
        matakuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matakuliahActionPerformed(evt);
            }
        });

        buttonGroup1.add(a);
        a.setText("A");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        buttonGroup1.add(b);
        b.setText("B");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        buttonGroup1.add(c);
        c.setText("C");

        Edit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        simpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        cari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(a)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addComponent(b)
                                        .addGap(49, 49, 49)
                                        .addComponent(c)
                                        .addGap(43, 43, 43))
                                    .addComponent(isNama)
                                    .addComponent(isNIM)
                                    .addComponent(matakuliah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(isNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(isNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(a)
                    .addComponent(b)
                    .addComponent(c))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(hapus)
                    .addComponent(keluar)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void matakuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matakuliahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matakuliahActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
       String Kelas=null;
        if(a.isSelected()){
            Kelas = "A";
        }    
            if(b.isSelected()){
                Kelas = "B";
            }    
                if(c.isSelected()){
                    Kelas = "C";
                }

        try{
            String sql = "INSERT Moh_Heri_Susanto_200605110087 set NIM = '"+isNIM.getText()+"', Nama = '"+isNama.getText()+"',Kelas = '"+Kelas+"',Mata_Kuliah = '"+matakuliah.getSelectedItem()+"'On Duplicate Key Update NIM = '"+isNIM.getText()+"', Nama = '"+isNama.getText()+"',Kelas = '"+Kelas+"',Mata_Kuliah = '"+matakuliah.getSelectedItem()+"'";
            java.sql.Connection con = (Connection)koneksi.config();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "EDIT DATA BERHASIL");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        } 
    }//GEN-LAST:event_EditActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
    try {     
            String Nama, NIM, Kelas, Mata_Kuliah;
            NIM = isNIM.getText();
            String sql = "SELECT * FROM Moh_Heri_Susanto_200605110087 WHERE NIM = '"+NIM+"'";
            java.sql.Connection con = (Connection)koneksi.config();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                Nama = (res.getString(2));
                isNama.setText(Nama);
                Kelas = (res.getString(3));
                if (Kelas.equals("A")){
                    buttonGroup1.setSelected(a.getModel(),rootPaneCheckingEnabled);
                }
                if (Kelas.equals("B")){
                    buttonGroup1.setSelected(b.getModel(),rootPaneCheckingEnabled);
                }
                if (Kelas.equals("C")){
                    buttonGroup1.setSelected(c.getModel(),rootPaneCheckingEnabled);
                }
                Mata_Kuliah = (res.getString(4));
                matakuliah.setSelectedItem(Mata_Kuliah);
            }
        } catch (SQLException ex) {
            Logger.getLogger(penilaian.class.getName()).log(Level.SEVERE, null, ex);
        }                  
    }//GEN-LAST:event_cariActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String Kelas=null;
        if(a.isSelected()){
            Kelas = "A";
        }    
            if(b.isSelected()){
                Kelas = "B";
            }    
                if(c.isSelected()){
                    Kelas = "C";
                }
            
        try{
            String sql = "INSERT INTO Moh_Heri_Susanto_200605110087 VALUES ('"+isNIM.getText()+"','"+isNama.getText()+"','"+Kelas+"','"+matakuliah.getSelectedItem()+"')";
            java.sql.Connection con = (Connection)koneksi.config();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "SIMPAN DATA BERHASIL");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "SIMPAN DATA GAGAL");
            return;
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
     try{
            String sql = "DELETE FROM Moh_Heri_Susanto_200605110087 where NIM='"+isNIM.getText()+"'";
            java.sql.Connection con = (Connection)koneksi.config();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "HAPUS DATA BERHASIL");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }  
        this.dispose();
        new penilaian().setVisible(true);
    }//GEN-LAST:event_hapusActionPerformed

    private void isNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isNamaActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JRadioButton c;
    private javax.swing.JButton cari;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField isNIM;
    private javax.swing.JTextField isNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> matakuliah;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables
}
