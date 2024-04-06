package Project_Medico____Dot.Bin_Lab;

public class Covid_Specialist_Doctor extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Covid_Specialist_Doctor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tnqsms1 = new javax.swing.JLabel();
        tnqsms2 = new javax.swing.JLabel();
        tnqsms3 = new javax.swing.JLabel();
        Back_Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(400, 200));
        setUndecorated(true);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Covid Specialist Doctor");
        jLabel1.setPreferredSize(new java.awt.Dimension(280, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Update as soon as");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 20));

        tnqsms1.setBackground(new java.awt.Color(255, 255, 255));
        tnqsms1.setFont(new java.awt.Font("Bodoni MT", 3, 14)); // NOI18N
        tnqsms1.setForeground(new java.awt.Color(255, 51, 255));
        tnqsms1.setText("Thank You So Much To Use This Service.");

        tnqsms2.setBackground(new java.awt.Color(255, 255, 255));
        tnqsms2.setFont(new java.awt.Font("Bodoni MT", 3, 14)); // NOI18N
        tnqsms2.setForeground(new java.awt.Color(255, 51, 255));
        tnqsms2.setText("Have A Good Day");

        tnqsms3.setBackground(new java.awt.Color(255, 255, 255));
        tnqsms3.setFont(new java.awt.Font("Bodoni MT", 3, 14)); // NOI18N
        tnqsms3.setForeground(new java.awt.Color(255, 51, 255));
        tnqsms3.setText("Take Care of Your Family");

        Back_Button.setBackground(new java.awt.Color(102, 255, 255));
        Back_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Back_Button.setForeground(new java.awt.Color(0, 0, 0));
        Back_Button.setText("Back");
        Back_Button.setPreferredSize(new java.awt.Dimension(75, 30));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Medico____Dot/Bin_Lab/Covide Specialist Doctor.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tnqsms1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(tnqsms2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(tnqsms3)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(tnqsms1)
                .addGap(18, 18, 18)
                .addComponent(tnqsms2)
                .addGap(18, 18, 18)
                .addComponent(tnqsms3)
                .addGap(69, 69, 69)
                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Covid_Specialist_Doctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel tnqsms1;
    private javax.swing.JLabel tnqsms2;
    private javax.swing.JLabel tnqsms3;
    // End of variables declaration//GEN-END:variables
}
