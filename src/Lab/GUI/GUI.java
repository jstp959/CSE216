package Lab.GUI;


import Lab.BusinessObjects.Lab;
import Lab.Controller.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollBar;


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

    
    boolean isUpdate = false;
    private Lab nullLab = new Lab("", "", "", "", "", "", "", "", false);
    /**
     * Creates new form ExamType
     */
    public GUI() {
        initComponents();
        refreshLabList();
        cancelUpdate.setVisible(false);

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
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labAddScrollPane = new javax.swing.JScrollPane();
        labAddPanel = new javax.swing.JPanel();
        labNameField = new javax.swing.JTextField();
        addLabHeader = new javax.swing.JLabel();
        labNameLabel = new javax.swing.JLabel();
        addNewLabButton = new javax.swing.JButton();
        labInformationLabel = new javax.swing.JLabel();
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
        cancelUpdate = new javax.swing.JButton();
        labUpdateScrollPane = new javax.swing.JScrollPane();
        labUpdatePanel = new javax.swing.JPanel();
        labUpdateLabel = new javax.swing.JLabel();
        labListScrollPane = new javax.swing.JScrollPane();
        labList = new javax.swing.JList<>();
        labSelectButton = new javax.swing.JButton();
        labActivationButton = new javax.swing.JButton();
        labRefreshButton = new javax.swing.JButton();

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DTHC.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        labAddScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labNameFieldActionPerformed(evt);
            }
        });

        addLabHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addLabHeader.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addLabHeader.setText("Add Lab");
        addLabHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labNameLabel.setText("Lab Name: ");

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

        labInformationLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labInformationLabel.setText("Lab Information: ");

        addLabStatus.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addLabStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addLabStatus.setText("   ");
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

        cancelUpdate.setBackground(new java.awt.Color(250, 0, 0));
        cancelUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cancelUpdate.setForeground(new java.awt.Color(250, 250, 250));
        cancelUpdate.setText("Cancel");
        cancelUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelUpdateMouseClicked(evt);
            }
        });
        cancelUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout labAddPanelLayout = new javax.swing.GroupLayout(labAddPanel);
        labAddPanel.setLayout(labAddPanelLayout);
        labAddPanelLayout.setHorizontalGroup(
            labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelUpdate)
                    .addComponent(addLabHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labInformationLabel)
                    .addGroup(labAddPanelLayout.createSequentialGroup()
                        .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labStreetLabel)
                            .addComponent(labCityLabel)
                            .addComponent(labZipLabel)
                            .addComponent(labStateLabel)
                            .addComponent(labEmailLabel)
                            .addComponent(labFaxLabel)
                            .addComponent(labPhoneLabel)
                            .addComponent(labOnSiteLabel))
                        .addGap(33, 33, 33)
                        .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labOnSiteCheckBox)
                            .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labStreetField)
                                .addComponent(labCityField)
                                .addComponent(labStateField)
                                .addComponent(labZipField)
                                .addComponent(labFaxField)
                                .addComponent(labPhoneField)
                                .addComponent(labEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(addNewLabButton)
                    .addComponent(addLabStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(labAddPanelLayout.createSequentialGroup()
                        .addComponent(labNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        labAddPanelLayout.setVerticalGroup(
            labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addLabHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(labAddPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labStreetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labCityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labStateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labZipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labZipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labFaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labFaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labOnSiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labOnSiteCheckBox))
                .addGap(34, 34, 34)
                .addComponent(addNewLabButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addLabStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labAddScrollPane.setViewportView(labAddPanel);

        labUpdateScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labUpdateLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labUpdateLabel.setText("Update Labs");

        labListScrollPane.setViewportView(labList);

        labSelectButton.setBackground(new java.awt.Color(250, 0, 0));
        labSelectButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labSelectButton.setForeground(new java.awt.Color(238, 238, 238));
        labSelectButton.setText("Select Lab");
        labSelectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labSelectButtonMouseClicked(evt);
            }
        });
        labSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labSelectButtonActionPerformed(evt);
            }
        });

        labActivationButton.setBackground(new java.awt.Color(250, 0, 0));
        labActivationButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labActivationButton.setForeground(new java.awt.Color(238, 238, 238));
        labActivationButton.setText("Deactivate");
        labActivationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActivationButtonActionPerformed(evt);
            }
        });

        labRefreshButton.setBackground(new java.awt.Color(250, 0, 0));
        labRefreshButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labRefreshButton.setForeground(new java.awt.Color(238, 238, 238));
        labRefreshButton.setText("Refresh Labs");
        labRefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labRefreshButtonMouseClicked(evt);
            }
        });
        labRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout labUpdatePanelLayout = new javax.swing.GroupLayout(labUpdatePanel);
        labUpdatePanel.setLayout(labUpdatePanelLayout);
        labUpdatePanelLayout.setHorizontalGroup(
            labUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labRefreshButton)
                    .addComponent(labUpdateLabel)
                    .addComponent(labSelectButton)
                    .addComponent(labActivationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        labUpdatePanelLayout.setVerticalGroup(
            labUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labUpdatePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labUpdateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labRefreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labSelectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labActivationButton)
                .addContainerGap())
        );

        labUpdateScrollPane.setViewportView(labUpdatePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labAddScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labUpdateScrollPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labUpdateScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(labAddScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewLabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewLabButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewLabButtonActionPerformed

    private void addNewLabButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewLabButtonMouseClicked
        String message;
        cancelUpdate.setVisible(false);

        String name = labNameField.getText();
        String street = labStreetField.getText();
        String city = labCityField.getText();
        String state = labStateField.getText();
        String zip = labZipField.getText();
        String faxNo = labFaxField.getText();
        String phoneNo = labPhoneField.getText();
        String email = labEmailField.getText();
        Boolean onSite = labOnSiteCheckBox.isSelected();
        if (isUpdate) {
            message = GUIController.updateLab(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
            labNameField.setEditable(true);
            labStreetField.setEditable(true);
            addLabHeader.setText("Add Lab");
            addNewLabButton.setText("Add New Lab");
        }
        else{
            
            message = GUIController.addLab(name, street, city, state, zip, email, faxNo, phoneNo, onSite);

        }
        
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
        
        refreshLabList();
        clearFields();
        updateStatus(message);
        
    }//GEN-LAST:event_addNewLabButtonMouseClicked

    private void labSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labSelectButtonActionPerformed

    }//GEN-LAST:event_labSelectButtonActionPerformed

    private void labActivationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labActivationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labActivationButtonActionPerformed

    private void labRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labRefreshButtonActionPerformed

    }//GEN-LAST:event_labRefreshButtonActionPerformed

    private void labSelectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labSelectButtonMouseClicked
        isUpdate = true;
        Lab selectedLab = selectLab();
        
        labNameField.setText(selectedLab.getName());
        labStreetField.setText(selectedLab.getAddress().getStreet());
        labStateField.setText(selectedLab.getAddress().getState());
        labCityField.setText(selectedLab.getAddress().getCity());
        labEmailField.setText(selectedLab.getEmail());
        labFaxField.setText(selectedLab.getFaxNo());
        labPhoneField.setText(selectedLab.getPhoneNo());
        labZipField.setText(selectedLab.getAddress().getZip());
        labOnSiteCheckBox.setSelected(selectedLab.getOnSite());
        
        labNameField.setEditable(false);
        labStreetField.setEditable(false);
        addLabHeader.setText("Update Lab");
        addNewLabButton.setText("Update Lab");
    }//GEN-LAST:event_labSelectButtonMouseClicked

    private void labRefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labRefreshButtonMouseClicked
        refreshLabList();
    }//GEN-LAST:event_labRefreshButtonMouseClicked

    private void labNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labNameFieldActionPerformed

    private void cancelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelUpdateMouseClicked
        addLabHeader.setText("Add Lab");
        addNewLabButton.setText("Add New Lab");
        isUpdate = false;
        labNameField.setEditable(true);
        updateStatus("Select Lab cancelled.");
        cancelUpdate.setVisible(false);
        addNewLabButton.setEnabled(true);
        clearFields();
        refreshLabList();
        

    }//GEN-LAST:event_cancelUpdateMouseClicked

    private void cancelUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelUpdateActionPerformed

    private void checkScroll(){
        JScrollBar sb = labAddScrollPane.getVerticalScrollBar();
        if(addLabStatus.getText() != "   "){
            sb.setValue( sb.getMaximum() );
        }
    }
    
    private void clearFields(){
        labNameField.setText(null);
        labStreetField.setText(null);
        labStateField.setText(null);
        labCityField.setText(null);
        labEmailField.setText(null);
        labFaxField.setText(null);
        labPhoneField.setText(null);
        labZipField.setText(null);
        labOnSiteCheckBox.setSelected(false);
    }
    private void updateStatus(String message){
        checkScroll();
        if (message.substring(0,5).equals("Error")){
            addLabStatus.setForeground(Color.red);
            addLabStatus.setFont(new java.awt.Font("Lucida Grande", 1, 16));
        }
        else{
            addLabStatus.setForeground(Color.black);
            addLabStatus.setFont(new java.awt.Font("Lucida Grande", 0, 16));
        }
        addLabStatus.setText(splitMessage(message));
    }
    private Lab selectLab(){
        cancelUpdate.setVisible(true);
        int index = labList.getSelectedIndex();
        if (index == -1){
            updateStatus("Error: Select a Lab from the list");
            addNewLabButton.setEnabled(false);
            return nullLab;
        }
        return GUIController.getLab(index);
        
    }
    private void refreshLabList(){
        ArrayList<Lab> labs = GUIController.refreshList();
        DefaultListModel dlm = new DefaultListModel();
        for (int i = 0; i < labs.size() ; i++ ) {
            dlm.addElement(labs.get(i).getName());
        }
        labList.setModel(dlm);
    }
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
    private javax.swing.JPanel Header;
    private javax.swing.JLabel addLabHeader;
    private javax.swing.JLabel addLabStatus;
    private javax.swing.JButton addNewLabButton;
    private javax.swing.JButton cancelUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton labActivationButton;
    private javax.swing.JPanel labAddPanel;
    private javax.swing.JScrollPane labAddScrollPane;
    private javax.swing.JTextField labCityField;
    private javax.swing.JLabel labCityLabel;
    private javax.swing.JTextField labEmailField;
    private javax.swing.JLabel labEmailLabel;
    private javax.swing.JTextField labFaxField;
    private javax.swing.JLabel labFaxLabel;
    private javax.swing.JLabel labInformationLabel;
    private javax.swing.JList<String> labList;
    private javax.swing.JScrollPane labListScrollPane;
    private javax.swing.JTextField labNameField;
    private javax.swing.JLabel labNameLabel;
    private javax.swing.JCheckBox labOnSiteCheckBox;
    private javax.swing.JLabel labOnSiteLabel;
    private javax.swing.JTextField labPhoneField;
    private javax.swing.JLabel labPhoneLabel;
    private javax.swing.JButton labRefreshButton;
    private javax.swing.JButton labSelectButton;
    private javax.swing.JTextField labStateField;
    private javax.swing.JLabel labStateLabel;
    private javax.swing.JTextField labStreetField;
    private javax.swing.JLabel labStreetLabel;
    private javax.swing.JLabel labUpdateLabel;
    private javax.swing.JPanel labUpdatePanel;
    private javax.swing.JScrollPane labUpdateScrollPane;
    private javax.swing.JTextField labZipField;
    private javax.swing.JLabel labZipLabel;
    // End of variables declaration//GEN-END:variables
}
