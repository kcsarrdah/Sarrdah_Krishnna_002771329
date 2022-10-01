/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hroapp;

import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kcsar
 */
public class mainPage extends javax.swing.JFrame {

    /**
     * Creates new form mainPage
     */
    
    public mainPage() {
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
        btnCreateNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfSearchBar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        btnCreateNew.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateNew.setForeground(new java.awt.Color(0, 0, 0));
        btnCreateNew.setText("+ Create New");
        btnCreateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search");

        tfSearchBar.setBackground(new java.awt.Color(255, 255, 255));
        tfSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchBarActionPerformed(evt);
            }
        });

        tblDisplay.setBackground(new java.awt.Color(255, 255, 255));
        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name ", "Employee ID", "Position"
            }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back to Home Screen");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setForeground(new java.awt.Color(0, 0, 0));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 43, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateNew))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(16, 16, 16))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateNew, btnDelete, btnEdit});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnView))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewActionPerformed
    // TODO add your handling code here
    this.hide();
    newEmployeeForm nf = new newEmployeeForm();
    nf.show();
    }//GEN-LAST:event_btnCreateNewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.hide();
        landingPage lp = new landingPage();
        lp.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) tblDisplay.getModel();
        if(tblDisplay.getSelectedRowCount() == 1){
            int id = Integer.parseInt(tableModel.getValueAt(tblDisplay.getSelectedRow(),1).toString());
            HROApp.remove(id);
            tableModel.removeRow(tblDisplay.getSelectedRow());
                    
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) tblDisplay.getModel();
        int id = Integer.parseInt(tableModel.getValueAt(tblDisplay.getSelectedRow(), 1).toString());
        if(tblDisplay.getSelectedRowCount() == 1){
            newEmployeeForm nef = new newEmployeeForm();
            nef.show();
            for(int i = 0; i < HROApp.employeesList.size(); i++){
                if(HROApp.employeesList.get(i).getEmployeeId() == id){
                    nef.tfName.setText(HROApp.employeesList.get(i).getName());
                    nef.tfEmpID.setText(Integer.toString(HROApp.employeesList.get(i).getEmployeeId()));
                    nef.tfAge.setText(Integer.toString(HROApp.employeesList.get(i).getAge()));
                    nef.tfGender.setText(HROApp.employeesList.get(i).getGender());
                    nef.tfLevel.setText(Integer.toString(HROApp.employeesList.get(i).getLevel()));
                    nef.tfPosition.setText(HROApp.employeesList.get(i).getPositionTitle());
                    nef.tfPhone.setText(HROApp.employeesList.get(i).getPhoneNumber());
                    nef.tfEmail.setText(HROApp.employeesList.get(i).getEmail());
                    nef.taTeamInfo.setText(HROApp.employeesList.get(i).getTeamInfo());
                    Format formatter = new SimpleDateFormat("MM/dd/yyyy");
                    String s = formatter.format(HROApp.employeesList.get(i).getStartDate());
                    //nef.jDateChooser.setDate(s);
                }
            }
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
    // TODO add your handling code here:
    viewProfile vp = new viewProfile();
    this.hide();
    vp.show();
    DefaultTableModel tablemodel = (DefaultTableModel) tblDisplay.getModel();
    
    if(tblDisplay.getSelectedRowCount() == 1){
        int id = Integer.parseInt(tablemodel.getValueAt(tblDisplay.getSelectedRow(), 1).toString());
        for (int i = 0; i < HROApp.employeesList.size(); i++){
            if(HROApp.employeesList.get(i).getEmployeeId() == id){
                vp.jlName.setText(HROApp.employeesList.get(i).getName());
                vp.jlID.setText(Integer.toString(HROApp.employeesList.get(i).getEmployeeId()));
                vp.jlAge.setText(Integer.toString(HROApp.employeesList.get(i).getAge()));
                vp.jlGender.setText(HROApp.employeesList.get(i).getGender());
                vp.jlLvl.setText(Integer.toString(HROApp.employeesList.get(i).getLevel()));
                vp.jlPosition.setText(HROApp.employeesList.get(i).getPositionTitle());
                vp.jlPhone.setText(HROApp.employeesList.get(i).getPhoneNumber());
                vp.jlEmail.setText(HROApp.employeesList.get(i).getEmail());
                vp.jlTI.setText(HROApp.employeesList.get(i).getTeamInfo());
                Format formatter = new SimpleDateFormat("MM/dd/yyyy");
                String s = formatter.format(HROApp.employeesList.get(i).getStartDate());
                vp.jlDate.setText(s);
            }
        }
    }
    }//GEN-LAST:event_btnViewActionPerformed

    private void tfSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchBarActionPerformed

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblDisplay;
    private javax.swing.JTextField tfSearchBar;
    // End of variables declaration//GEN-END:variables
}
