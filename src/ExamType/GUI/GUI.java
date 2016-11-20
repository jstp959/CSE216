package ExamType.GUI;

import ExamType.Controller.*;
//elise!!!!!!!!!!
//CHRISSSS!!!!
//Rachel :-) 
//testing git

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @authors Chris Alexander, Elise Cross, Rachel Okun, John St. Pierre, Ferguson
 * Watkins
 */

public class GUI extends javax.swing.JFrame {
    

    /**
     * Creates new form ExamType
     */
    public GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        examTypeNameField = new javax.swing.JTextField();
        addETHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examTypeDescriptionField = new javax.swing.JTextArea();
        examTypeNameLabel = new javax.swing.JLabel();
        examTypeDescriptionLabel = new javax.swing.JLabel();
        addNewETButton = new javax.swing.JButton();
        addExamTypeStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        examTypeList = new javax.swing.JList<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 200, 200));
        setForeground(new java.awt.Color(0, 0, 200));

        addETHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addETHeader.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addETHeader.setText("Add Exam Type");
        addETHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        examTypeDescriptionField.setColumns(20);
        examTypeDescriptionField.setRows(5);
        jScrollPane1.setViewportView(examTypeDescriptionField);

        examTypeNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examTypeNameLabel.setText("Exam Type Name");

        examTypeDescriptionLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examTypeDescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        examTypeDescriptionLabel.setText("Exam Type Description");

        addNewETButton.setBackground(new java.awt.Color(250, 0, 0));
        addNewETButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addNewETButton.setForeground(new java.awt.Color(250, 250, 250));
        addNewETButton.setText("Add New Exam Type");
        addNewETButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewETButtonMouseClicked(evt);
            }
        });
        addNewETButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewETButtonActionPerformed(evt);
            }
        });

        addExamTypeStatus.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addExamTypeStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addExamTypeStatus.setText("                                   ");

        jPanel2.setPreferredSize(new java.awt.Dimension(7, 212));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 200, 200));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DTHC.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setMaximumSize(new java.awt.Dimension(82, 72));
        jLabel1.setMinimumSize(new java.awt.Dimension(82, 72));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jScrollPane2.setViewportView(examTypeList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(examTypeDescriptionLabel)
                                    .addComponent(addETHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(examTypeNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(examTypeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addNewETButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47))))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addExamTypeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addETHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(examTypeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(examTypeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(examTypeDescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(addNewETButton)
                .addGap(18, 18, 18)
                .addComponent(addExamTypeStatus)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewETButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewETButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewETButtonActionPerformed

    private void addNewETButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewETButtonMouseClicked
        String message = GUIController.addExamType(examTypeNameField.getText(), examTypeDescriptionField.getText());
        addExamTypeStatus.setText(message);
    }//GEN-LAST:event_addNewETButtonMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addETHeader;
    private javax.swing.JLabel addExamTypeStatus;
    private javax.swing.JButton addNewETButton;
    private javax.swing.JTextArea examTypeDescriptionField;
    private javax.swing.JLabel examTypeDescriptionLabel;
    private javax.swing.JList<String> examTypeList;
    private javax.swing.JTextField examTypeNameField;
    private javax.swing.JLabel examTypeNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
