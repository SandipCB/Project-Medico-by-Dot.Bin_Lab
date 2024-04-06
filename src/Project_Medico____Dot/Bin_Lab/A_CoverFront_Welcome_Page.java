/*

This is Main File of "Project Medico" .
If you Use Project Medico Then Run This Programm .
Before run please Read clearfully "Read Frist.txt" File . 

 */
package Project_Medico____Dot.Bin_Lab;

import javax.swing.JOptionPane;

public class A_CoverFront_Welcome_Page extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public A_CoverFront_Welcome_Page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BCK_IMG = new javax.swing.JPanel();
        Loading_Bar = new javax.swing.JProgressBar();
        Loading_Perchantage = new javax.swing.JLabel();
        Loading_Name = new javax.swing.JLabel();
        Background_IMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BCK_IMG.setPreferredSize(new java.awt.Dimension(1200, 800));
        BCK_IMG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loading_Bar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BCK_IMG.add(Loading_Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 780, 1220, 20));

        Loading_Perchantage.setBackground(new java.awt.Color(255, 204, 204));
        Loading_Perchantage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Loading_Perchantage.setForeground(new java.awt.Color(0, 0, 0));
        Loading_Perchantage.setText("0 %");
        BCK_IMG.add(Loading_Perchantage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 750, -1, 30));

        Loading_Name.setBackground(new java.awt.Color(255, 204, 204));
        Loading_Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Loading_Name.setForeground(new java.awt.Color(51, 255, 51));
        Loading_Name.setText("Loading...");
        BCK_IMG.add(Loading_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 750, 230, 30));

        Background_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Medico____Dot/Bin_Lab/A_Cover_Welcome Front_1.png"))); // NOI18N
        Background_IMG.setText("jLabel1");
        Background_IMG.setPreferredSize(new java.awt.Dimension(1200, 800));
        BCK_IMG.add(Background_IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1199, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BCK_IMG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BCK_IMG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        A_CoverFront_Welcome_Page w = new A_CoverFront_Welcome_Page();
        w.setVisible(true);
        Thread.sleep(5000);
        //new Login().setVisible(true);
        w.dispose();
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
            java.util.logging.Logger.getLogger(A_CoverFront_Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_CoverFront_Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_CoverFront_Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_CoverFront_Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        A_CoverFront_Welcome_Page obj = new A_CoverFront_Welcome_Page();
        obj.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                obj.Loading_Perchantage.setText(i + "%");
                if (i == 0) {
                    obj.Loading_Name.setText("Running...");
                }

                if (i == 10) {
                    obj.Loading_Name.setText("Initialize...");
                }
                if (i == 20) {
                    obj.Loading_Name.setText("Turing On Modules...");
                }
                if (i == 30) {
                    obj.Loading_Name.setText("Loading All MOdules..");
                }
                if (i == 40) {
                    obj.Loading_Name.setText("Ready For Launching");
                }
                if (i == 50) {
                    obj.Loading_Name.setText("Check All File...");
                }
                if (i == 60) {
                    obj.Loading_Name.setText("Checking Done...");
                }
                if (i == 70) {
                    obj.Loading_Name.setText("Launching Project Medico...");
                }
                if (i == 90) {
                    obj.Loading_Name.setText("Welcome To Project Medico...");
                }
                obj.Loading_Bar.setValue(i);

            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new Login().setVisible(true);
        //new Welcome().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BCK_IMG;
    private javax.swing.JLabel Background_IMG;
    private javax.swing.JProgressBar Loading_Bar;
    private javax.swing.JLabel Loading_Name;
    private javax.swing.JLabel Loading_Perchantage;
    // End of variables declaration//GEN-END:variables
}
