package ExamType.GUI;

import ExamType.Controller.*;
import ExamType.BusinessObjects.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @authors Chris Alexander
 *
 */
public class GUI extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        examTypeScrollPane = new javax.swing.JScrollPane();
        examTypePane = new javax.swing.JPanel();
        addETHeader = new javax.swing.JLabel();
        examTypeNameLabel = new javax.swing.JLabel();
        examTypeDescriptionLabel = new javax.swing.JLabel();
        examTypeNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        examTypeDescriptionField = new javax.swing.JTextArea();
        addNewETButton = new javax.swing.JButton();
        addExamTypeStatus = new javax.swing.JLabel();
        examTypeUpdateScrollPane = new javax.swing.JScrollPane();
        examTypeUpdatePanel = new javax.swing.JPanel();
        examTypeUpdateLabel = new javax.swing.JLabel();
        examTypeListScrollPane = new javax.swing.JScrollPane();
        examTypeList = new javax.swing.JList<>();
        examTypeSelectButton = new javax.swing.JButton();
        examTypeActivationButton = new javax.swing.JButton();
        examTypeRefreshButton = new javax.swing.JButton();

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

        examTypeScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        addETHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addETHeader.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addETHeader.setText("Add Exam Type");
        addETHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        examTypeNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examTypeNameLabel.setText(" Exam Type Name: ");

        examTypeDescriptionLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examTypeDescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        examTypeDescriptionLabel.setText(" Exam Type Description: ");

        examTypeDescriptionField.setColumns(20);
        examTypeDescriptionField.setRows(5);
        jScrollPane1.setViewportView(examTypeDescriptionField);

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
        addExamTypeStatus.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout examTypePaneLayout = new javax.swing.GroupLayout(examTypePane);
        examTypePane.setLayout(examTypePaneLayout);
        examTypePaneLayout.setHorizontalGroup(
            examTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examTypePaneLayout.createSequentialGroup()
                .addGroup(examTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(examTypePaneLayout.createSequentialGroup()
                        .addComponent(examTypeNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(examTypeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(examTypeDescriptionLabel)
                    .addGroup(examTypePaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(examTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(examTypePaneLayout.createSequentialGroup()
                                .addComponent(addETHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))))
                    .addGroup(examTypePaneLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(addNewETButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(examTypePaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addExamTypeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        examTypePaneLayout.setVerticalGroup(
            examTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examTypePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addETHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(examTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examTypeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examTypeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examTypeDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addNewETButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addExamTypeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        examTypeScrollPane.setViewportView(examTypePane);

        examTypeUpdateScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        examTypeUpdateLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        examTypeUpdateLabel.setText("Update Exam Types");

        examTypeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        examTypeList.setToolTipText("");
        examTypeListScrollPane.setViewportView(examTypeList);

        examTypeSelectButton.setBackground(new java.awt.Color(250, 0, 0));
        examTypeSelectButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examTypeSelectButton.setForeground(new java.awt.Color(238, 238, 238));
        examTypeSelectButton.setText("Select Exam Type");
        examTypeSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examTypeSelectButtonActionPerformed(evt);
            }
        });

        examTypeActivationButton.setBackground(new java.awt.Color(250, 0, 0));
        examTypeActivationButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examTypeActivationButton.setForeground(new java.awt.Color(238, 238, 238));
        examTypeActivationButton.setText("Deactivate");
        examTypeActivationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examTypeActivationButtonActionPerformed(evt);
            }
        });

        examTypeRefreshButton.setBackground(new java.awt.Color(250, 0, 0));
        examTypeRefreshButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        examTypeRefreshButton.setForeground(new java.awt.Color(238, 238, 238));
        examTypeRefreshButton.setText("Refresh Exam Types");
        examTypeRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examTypeRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout examTypeUpdatePanelLayout = new javax.swing.GroupLayout(examTypeUpdatePanel);
        examTypeUpdatePanel.setLayout(examTypeUpdatePanelLayout);
        examTypeUpdatePanelLayout.setHorizontalGroup(
            examTypeUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examTypeUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(examTypeUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examTypeUpdateLabel)
                    .addComponent(examTypeListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examTypeRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(examTypeUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(examTypeActivationButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examTypeSelectButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        examTypeUpdatePanelLayout.setVerticalGroup(
            examTypeUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examTypeUpdatePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(examTypeUpdateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(examTypeRefreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examTypeListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(examTypeSelectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examTypeActivationButton)
                .addContainerGap())
        );

        examTypeUpdateScrollPane.setViewportView(examTypeUpdatePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(examTypeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(examTypeUpdateScrollPane)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examTypeUpdateScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(examTypeScrollPane))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewETButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewETButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewETButtonActionPerformed

    private void addNewETButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewETButtonMouseClicked
        String message = GUIController.addExamType(examTypeNameField.getText(), examTypeDescriptionField.getText());

        //Changes the ERROR message to Red and Bold
        if (message.substring(0, 5).equals("Error")) {
            addExamTypeStatus.setForeground(Color.red);
            addExamTypeStatus.setFont(new java.awt.Font("Lucida Grande", 1, 16));
            examTypeNameLabel.setForeground(Color.red);
            examTypeNameLabel.setText("*Exam Type Name:");

        } else {
            addExamTypeStatus.setForeground(Color.black);
            addExamTypeStatus.setFont(new java.awt.Font("Lucida Grande", 0, 16));
            examTypeNameLabel.setForeground(Color.black);
            examTypeNameLabel.setText(" Exam Type Name:");
            dlm.addElement(examTypeNameField.getText());

        }
        examTypeList.setModel(dlm);

        addExamTypeStatus.setText(splitMessage(message));
        refreshList();
    }//GEN-LAST:event_addNewETButtonMouseClicked

    private void examTypeSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examTypeSelectButtonActionPerformed
        ExamType selectedExamType = selectExamType();
        examTypeNameField.setText(selectedExamType.getName());
        examTypeDescriptionField.setText(selectedExamType.getDescription());
    }//GEN-LAST:event_examTypeSelectButtonActionPerformed
    
    private ExamType selectExamType() {
        int index = examTypeList.getSelectedIndex();
        return GUIController.getExamType(index);
    }

    private void examTypeActivationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examTypeActivationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examTypeActivationButtonActionPerformed

    private void examTypeRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examTypeRefreshButtonActionPerformed
        refreshList();

    }//GEN-LAST:event_examTypeRefreshButtonActionPerformed

    private void refreshList() {
        ArrayList<ExamType> list = GUIController.refreshList();

        DefaultListModel dlm = new DefaultListModel();
        for (ExamType exam : list) {
            dlm.addElement(exam);
        }
        examTypeList.setModel(dlm);

    }

    private String splitMessage(String originalMessage) {
        String formattedMessage = "<html>";
        return splitMessage(formattedMessage, originalMessage);
    }

    private String splitMessage(String formattedMessage, String originalMessage) {
        if (originalMessage.length() > 30) {
            String temp;
            for (int i = 30; i >= 0; i--) {
                if (originalMessage.charAt(i) == ' ') {
                    formattedMessage += originalMessage.substring(0, i) + "<br>";
                    temp = originalMessage.substring(i + 1, originalMessage.length());
                    originalMessage = temp;
                    break;
                }
            }

            return splitMessage(formattedMessage, originalMessage);
        } else {
            formattedMessage += originalMessage + "</html>";
            return formattedMessage;
        }

    }

    public String getExamTypeName() {
        return examTypeNameField.getName();
    }

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
    private javax.swing.JButton examTypeActivationButton;
    private javax.swing.JTextArea examTypeDescriptionField;
    private javax.swing.JLabel examTypeDescriptionLabel;
    private javax.swing.JList<String> examTypeList;
    private javax.swing.JScrollPane examTypeListScrollPane;
    private javax.swing.JTextField examTypeNameField;
    private javax.swing.JLabel examTypeNameLabel;
    private javax.swing.JPanel examTypePane;
    private javax.swing.JButton examTypeRefreshButton;
    private javax.swing.JScrollPane examTypeScrollPane;
    private javax.swing.JButton examTypeSelectButton;
    private javax.swing.JLabel examTypeUpdateLabel;
    private javax.swing.JPanel examTypeUpdatePanel;
    private javax.swing.JScrollPane examTypeUpdateScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
