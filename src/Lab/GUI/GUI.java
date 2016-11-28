package Lab.GUI;


import Lab.Controller.*;
import java.awt.Color;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @authors Chris Alexander
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
        jSplitPane1 = new javax.swing.JSplitPane();
        labNameField = new javax.swing.JTextField();
        addLabHeader = new javax.swing.JLabel();
        labNameLabel = new javax.swing.JLabel();
        labInformationLabel = new javax.swing.JLabel();
        addNewLabButton = new javax.swing.JButton();
        addLabStatus = new javax.swing.JLabel();
        labStreetField = new javax.swing.JTextField();
        labStreetLabel = new javax.swing.JLabel();
        labCityField = new javax.swing.JTextField();
        labZipLabel = new javax.swing.JLabel();
        labCityLabel = new javax.swing.JLabel();
        labStateField = new javax.swing.JTextField();
        labZipField = new javax.swing.JTextField();
        labStateLabel = new javax.swing.JLabel();
        labFaxLabel = new javax.swing.JLabel();
        labFaxField = new javax.swing.JTextField();
        labPhoneLabel = new javax.swing.JLabel();
        labPhoneField = new javax.swing.JTextField();
        labEmailField = new javax.swing.JTextField();
        labEmailLabel = new javax.swing.JLabel();
        labOnSiteLabel = new javax.swing.JLabel();
        labOnSiteCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        addLabHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addLabHeader.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addLabHeader.setText("Add Lab");
        addLabHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labNameLabel.setText("Lab Name: ");

        labInformationLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labInformationLabel.setText("Lab Information: ");

        addNewLabButton.setBackground(new java.awt.Color(250, 0, 0));
        addNewLabButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addNewLabButton.setForeground(new java.awt.Color(250, 250, 250));
        addNewLabButton.setText("Add New Lab");
        addNewLabButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewLabButtonMouseClicked(evt);
            }
        });
        addNewLabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewLabButtonActionPerformed(evt);
            }
        });

        addLabStatus.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addLabStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLabStatus.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labStreetLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labStreetLabel.setText("Street: ");

        labZipLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labZipLabel.setText("Zip Code: ");

        labCityLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labCityLabel.setText("City: ");

        labStateLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labStateLabel.setText("State: ");

        labFaxLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labFaxLabel.setText("Fax Number: ");

        labPhoneLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labPhoneLabel.setText("Phone Number: ");

        labEmailLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labEmailLabel.setText("Email Address: ");

        labOnSiteLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labOnSiteLabel.setText("On-Site Lab?");

        jScrollPane1.setViewportView(jList1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DTHC.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addLabHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labInformationLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labNameField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labStreetLabel)
                                            .addComponent(labCityLabel)
                                            .addComponent(labZipLabel)
                                            .addComponent(labStateLabel)
                                            .addComponent(labEmailLabel)
                                            .addComponent(labFaxLabel)
                                            .addComponent(labPhoneLabel)
                                            .addComponent(labOnSiteLabel))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labOnSiteCheckBox)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(labStreetField)
                                                .addComponent(labCityField)
                                                .addComponent(labStateField)
                                                .addComponent(labZipField)
                                                .addComponent(labFaxField)
                                                .addComponent(labPhoneField)
                                                .addComponent(labEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(addNewLabButton))
                                    .addComponent(addLabStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addLabHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labInformationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labStreetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labStateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labZipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labZipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labFaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labOnSiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labOnSiteCheckBox)))
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34)
                .addComponent(addNewLabButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addLabStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewLabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewLabButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewLabButtonActionPerformed

    private void addNewLabButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewLabButtonMouseClicked
        String name = labNameField.getText();
        String street = labStreetField.getText();
        String city = labCityField.getText();
        String state = labStateField.getText();
        String zip = labZipField.getText();
        String faxNo = labFaxField.getText();
        String phoneNo = labPhoneField.getText();
        String email = labEmailField.getText();
        Boolean onSite = labOnSiteCheckBox.isSelected();
        String message = GuiController.addLabType(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
        
        //Changes the Color of the labels depending on if the field is missing
        if (name.equals("")){
            labNameLabel.setForeground(Color.red);
        }
        else {
            labNameLabel.setForeground(Color.black);
        }
        if (street.equals("")){
            labStreetLabel.setForeground(Color.red);
        }
        else {
            labStreetLabel.setForeground(Color.black);
        }
        if (city.equals("")){
            labCityLabel.setForeground(Color.red);
        }
        else {
            labCityLabel.setForeground(Color.black);
        }
        if (state.equals("")){
            labStateLabel.setForeground(Color.red);
        }
        else {
            labStateLabel.setForeground(Color.black);
        }
        if (zip.equals("")){
            labZipLabel.setForeground(Color.red);
        }
        else {
            labZipLabel.setForeground(Color.black);
        }
        if (faxNo.equals("")){
            labFaxLabel.setForeground(Color.red);
        }
        else {
            labFaxLabel.setForeground(Color.black);
        }
        if (phoneNo.equals("")){
            labPhoneLabel.setForeground(Color.red);
        }
        else {
            labPhoneLabel.setForeground(Color.black);
        }
        if (email.equals("")){
            labEmailLabel.setForeground(Color.red);
        }
        else {
            labEmailLabel.setForeground(Color.black);
        }

        
        //Changes the Error message to Bold and RED
        if (message.substring(0,5).equals("Error")){
            addLabStatus.setForeground(Color.red);
            addLabStatus.setFont(new java.awt.Font("Lucida Grande", 1, 16));
        }
        else{
            addLabStatus.setForeground(Color.black);
            addLabStatus.setFont(new java.awt.Font("Lucida Grande", 0, 16));
        }
        
        addLabStatus.setText(splitMessage(message));
        
    }//GEN-LAST:event_addNewLabButtonMouseClicked

    private String splitMessage(String originalMessage){
        String formattedMessage = "<html>";
        return splitMessage(formattedMessage, originalMessage);
    }
    private String splitMessage(String formattedMessage, String originalMessage){
        if (originalMessage.length() > 30){
            String temp = "";
            for (int i = 30; i >= 0; i--){
                if (originalMessage.charAt(i) == ' '){
                    formattedMessage += originalMessage.substring (0,i) + "<br>";
                    temp = originalMessage.substring (i+1,originalMessage.length());
                    originalMessage = temp;
                    break;
                }
            }
            
        return splitMessage(formattedMessage, originalMessage);
        }
        else {
              formattedMessage += originalMessage + "</html>";
              return formattedMessage;
        }

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
    private javax.swing.JLabel addLabHeader;
    private javax.swing.JLabel addLabStatus;
    private javax.swing.JButton addNewLabButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField labCityField;
    private javax.swing.JLabel labCityLabel;
    private javax.swing.JTextField labEmailField;
    private javax.swing.JLabel labEmailLabel;
    private javax.swing.JTextField labFaxField;
    private javax.swing.JLabel labFaxLabel;
    private javax.swing.JLabel labInformationLabel;
    private javax.swing.JTextField labNameField;
    private javax.swing.JLabel labNameLabel;
    private javax.swing.JCheckBox labOnSiteCheckBox;
    private javax.swing.JLabel labOnSiteLabel;
    private javax.swing.JTextField labPhoneField;
    private javax.swing.JLabel labPhoneLabel;
    private javax.swing.JTextField labStateField;
    private javax.swing.JLabel labStateLabel;
    private javax.swing.JTextField labStreetField;
    private javax.swing.JLabel labStreetLabel;
    private javax.swing.JTextField labZipField;
    private javax.swing.JLabel labZipLabel;
    // End of variables declaration//GEN-END:variables
}
