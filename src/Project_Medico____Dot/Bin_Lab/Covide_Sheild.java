/*
This is the "Covide Sheild" (Part); main file . If you wannt to use this , then run this code .
 */
package Project_Medico____Dot.Bin_Lab;

public class Covide_Sheild extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Covide_Sheild() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        Covid_Specialist_Doctor = new javax.swing.JButton();
        Covid_Hospital_Isolation_Bed_Info = new javax.swing.JButton();
        Ambulance_List = new javax.swing.JButton();
        Emergency_Section = new javax.swing.JButton();
        Exit_From_Program = new javax.swing.JButton();
        Blood_Bank_And_Plagma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setBounds(new java.awt.Rectangle(20, 20, 20, 20));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(400, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Covid_Specialist_Doctor.setBackground(new java.awt.Color(0, 204, 204));
        Covid_Specialist_Doctor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Covid_Specialist_Doctor.setForeground(new java.awt.Color(0, 0, 0));
        Covid_Specialist_Doctor.setText("Covid Specialist Doctor");
        Covid_Specialist_Doctor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        Covid_Specialist_Doctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Covid_Specialist_Doctor.setMaximumSize(new java.awt.Dimension(200, 30));
        Covid_Specialist_Doctor.setMinimumSize(new java.awt.Dimension(200, 30));
        Covid_Specialist_Doctor.setPreferredSize(new java.awt.Dimension(300, 35));
        Covid_Specialist_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Covid_Specialist_DoctorActionPerformed(evt);
            }
        });
        getContentPane().add(Covid_Specialist_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        Covid_Hospital_Isolation_Bed_Info.setBackground(new java.awt.Color(0, 204, 204));
        Covid_Hospital_Isolation_Bed_Info.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Covid_Hospital_Isolation_Bed_Info.setForeground(new java.awt.Color(0, 0, 0));
        Covid_Hospital_Isolation_Bed_Info.setText("Covid Hospital & Isolation Bed's Info");
        Covid_Hospital_Isolation_Bed_Info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        Covid_Hospital_Isolation_Bed_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Covid_Hospital_Isolation_Bed_Info.setMaximumSize(new java.awt.Dimension(200, 30));
        Covid_Hospital_Isolation_Bed_Info.setMinimumSize(new java.awt.Dimension(200, 30));
        Covid_Hospital_Isolation_Bed_Info.setPreferredSize(new java.awt.Dimension(300, 35));
        Covid_Hospital_Isolation_Bed_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Covid_Hospital_Isolation_Bed_InfoActionPerformed(evt);
            }
        });
        getContentPane().add(Covid_Hospital_Isolation_Bed_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        Ambulance_List.setBackground(new java.awt.Color(0, 204, 204));
        Ambulance_List.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Ambulance_List.setForeground(new java.awt.Color(0, 0, 0));
        Ambulance_List.setText("Ambulance List (Covide Paitent Only)");
        Ambulance_List.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        Ambulance_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ambulance_List.setMaximumSize(new java.awt.Dimension(200, 30));
        Ambulance_List.setMinimumSize(new java.awt.Dimension(200, 30));
        Ambulance_List.setPreferredSize(new java.awt.Dimension(300, 35));
        Ambulance_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ambulance_ListActionPerformed(evt);
            }
        });
        getContentPane().add(Ambulance_List, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));

        Emergency_Section.setBackground(new java.awt.Color(0, 204, 204));
        Emergency_Section.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Emergency_Section.setForeground(new java.awt.Color(0, 0, 0));
        Emergency_Section.setText("Emergency Oxygen Cylinder");
        Emergency_Section.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        Emergency_Section.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Emergency_Section.setMaximumSize(new java.awt.Dimension(200, 30));
        Emergency_Section.setMinimumSize(new java.awt.Dimension(200, 30));
        Emergency_Section.setPreferredSize(new java.awt.Dimension(300, 35));
        Emergency_Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emergency_SectionActionPerformed(evt);
            }
        });
        getContentPane().add(Emergency_Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        Exit_From_Program.setBackground(new java.awt.Color(255, 102, 102));
        Exit_From_Program.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Exit_From_Program.setForeground(new java.awt.Color(0, 0, 0));
        Exit_From_Program.setText("Back To Main Programm");
        Exit_From_Program.setToolTipText("");
        Exit_From_Program.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        Exit_From_Program.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Exit_From_Program.setMaximumSize(new java.awt.Dimension(200, 30));
        Exit_From_Program.setMinimumSize(new java.awt.Dimension(200, 30));
        Exit_From_Program.setPreferredSize(new java.awt.Dimension(200, 35));
        Exit_From_Program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_From_ProgramActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_From_Program, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 480, -1, -1));

        Blood_Bank_And_Plagma.setBackground(new java.awt.Color(0, 204, 204));
        Blood_Bank_And_Plagma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Blood_Bank_And_Plagma.setForeground(new java.awt.Color(0, 0, 0));
        Blood_Bank_And_Plagma.setText("Blood Bank & Plasma");
        Blood_Bank_And_Plagma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        Blood_Bank_And_Plagma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Blood_Bank_And_Plagma.setMaximumSize(new java.awt.Dimension(200, 30));
        Blood_Bank_And_Plagma.setMinimumSize(new java.awt.Dimension(200, 30));
        Blood_Bank_And_Plagma.setPreferredSize(new java.awt.Dimension(300, 35));
        Blood_Bank_And_Plagma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blood_Bank_And_PlagmaActionPerformed(evt);
            }
        });
        getContentPane().add(Blood_Bank_And_Plagma, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Medico____Dot/Bin_Lab/Coivide Shield.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Medico____Dot/Bin_Lab/xb.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 642));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Covid_Specialist_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Covid_Specialist_DoctorActionPerformed
        new Covid_Specialist_Doctor().setVisible(true);

    }//GEN-LAST:event_Covid_Specialist_DoctorActionPerformed

    private void Covid_Hospital_Isolation_Bed_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Covid_Hospital_Isolation_Bed_InfoActionPerformed
        new Covid_Hospital_Bed_Info().setVisible(true);
    }//GEN-LAST:event_Covid_Hospital_Isolation_Bed_InfoActionPerformed

    private void Ambulance_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ambulance_ListActionPerformed
        new Ambulance_List().setVisible(true);
    }//GEN-LAST:event_Ambulance_ListActionPerformed

    private void Emergency_SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emergency_SectionActionPerformed
        new Emergency_Oxygen_Cylinder().setVisible(true);
    }//GEN-LAST:event_Emergency_SectionActionPerformed

    private void Exit_From_ProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_From_ProgramActionPerformed
      new A_Front_Home_Page().setVisible(true);
    }//GEN-LAST:event_Exit_From_ProgramActionPerformed

    private void Blood_Bank_And_PlagmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blood_Bank_And_PlagmaActionPerformed
        new Blood_Bank_And_Plagma().setVisible(true);
    }//GEN-LAST:event_Blood_Bank_And_PlagmaActionPerformed

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
            java.util.logging.Logger.getLogger(Covide_Sheild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Covide_Sheild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Covide_Sheild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Covide_Sheild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Covide_Sheild().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ambulance_List;
    private javax.swing.JButton Blood_Bank_And_Plagma;
    private javax.swing.JButton Covid_Hospital_Isolation_Bed_Info;
    private javax.swing.JButton Covid_Specialist_Doctor;
    private javax.swing.JButton Emergency_Section;
    private javax.swing.JButton Exit_From_Program;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
