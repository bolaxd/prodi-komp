package pratikum3.hanif.pbo.main;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends javax.swing.JFrame {

    Kalkulator calc;
    public Main() {
        initComponents();
        calc = new Kalkulator();
//        setResizable(false);
    }

    public JComboBox<String> getCmbOperasi() {
        return cmbOperasi;
    }

    public JTextField getTxtBilangan1() {
        return txtBilangan1;
    }

    public JTextField getTxtBilangan2() {
        return txtBilangan2;
    }

    public JTextField getTxtHasil() {
        return txtHasil;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBilangan1 = new javax.swing.JTextField();
        txtBilangan2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbOperasi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 153, 102));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("BILANGAN 1 :");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 30));

        txtBilangan1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        MainPanel.add(txtBilangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 350, 50));

        txtBilangan2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        MainPanel.add(txtBilangan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 350, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("OPERASI       :");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 30));

        btnClear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        MainPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 130, 70));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("HASIL         :");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, 30));

        txtHasil.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        MainPanel.add(txtHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 350, 50));

        btnHitung.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnHitung.setText("HITUNG");
        btnHitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHitungMouseClicked(evt);
            }
        });
        MainPanel.add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 140, 70));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("KALKULATOR SEDERHANA");
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("BILANGAN 2 :");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 30));

        cmbOperasi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbOperasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENJUMLAHAN", "PENGURANGAN", "PERKALIAN", "PEMBAGIAN" }));
        MainPanel.add(cmbOperasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 350, 50));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        calc.clearTampilan(this);
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnHitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHitungMouseClicked
        // TODO add your handling code here:
        calc.tampilKalkulasi(this);
    }//GEN-LAST:event_btnHitungMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cmbOperasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBilangan1;
    private javax.swing.JTextField txtBilangan2;
    private javax.swing.JTextField txtHasil;
    // End of variables declaration//GEN-END:variables
}
