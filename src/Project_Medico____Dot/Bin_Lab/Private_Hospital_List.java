/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Medico____Dot.Bin_Lab;

/**
 *
 * @author USER
 */
public class Private_Hospital_List extends javax.swing.JFrame {

    /**
     * Creates new form Private_Hospital_List
     */
    public Private_Hospital_List() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Back_Button5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("HP Simplified W01 Bold", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n        \t\t **Private Hospital List : **\n\n\t1.Sylhet Shadar Hospital\n\t2.North East College Hospital\n\t3.Jalalabad Ragib Rabeya Medical College Hospital\n\t4.Sylhet Womens Medical College Hospital\n\t5.Mount Adora Hospital (Akhalia)\n\t6.Nurjahan Hospital\n\t7.Al-Haramain Hospital\n\t8.Ibn-Sina Hospital (Subhanighat)\n\t9. Shohid Samsuddin Ahmed Hospital");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 600, 300));

        Back_Button5.setBackground(new java.awt.Color(204, 204, 255));
        Back_Button5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Back_Button5.setForeground(new java.awt.Color(0, 0, 0));
        Back_Button5.setText("Back");
        Back_Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_Button5.setPreferredSize(new java.awt.Dimension(90, 30));
        Back_Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Back_Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Medico____Dot/Bin_Lab/Private Hospital.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back_Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Button5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Back_Button5ActionPerformed

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
            java.util.logging.Logger.getLogger(Private_Hospital_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Private_Hospital_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Private_Hospital_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Private_Hospital_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Private_Hospital_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
