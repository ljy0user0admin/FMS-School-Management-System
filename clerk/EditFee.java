/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clerk;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import selects.QueryFeeDetails;
import superadmin.ViewStaff;

/**
 *
 * @author franq
 */
public class EditFee extends javax.swing.JFrame {

    /**
     * Creates new form PayFee
     */
    private static int currentuserid;
    private static String todaysdate;
    private static boolean  saved;
    private static int bordinginfo;
    private static long receiptnumber;
    
    public EditFee(int userid,int bordingdetails, Long receiptno) {
        bordinginfo = bordingdetails;
        receiptnumber = receiptno;
        initComponents();
        currentuserid = userid;
        todaysdate = selects.QueryMainDetails.getCurrentDate();
        saved = false;
        
        
        
        if(bordinginfo ==1)
        {
            try {
                //border
                ArrayList det = QueryFeeDetails.getBorderFeeDet(receiptno.toString());
                
                cmbbordingdetails.setSelectedIndex(1);
                jsregno.setValue(Integer.parseInt(det.get(0).toString()));
                jsammount.setValue(Integer.parseInt(det.get(1).toString()));
                jtapaymentfor.setText(det.get(2).toString());
                
            } catch (SQLException ex) {
                Logger.getLogger(EditFee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try {
                //dayscholar
                 ArrayList det = QueryFeeDetails.getNonBorderFeeDet(receiptno.toString());
                    
                    cmbbordingdetails.setSelectedIndex(1);
                    jsregno.setValue(Integer.parseInt(det.get(0).toString()));
                    jsammount.setValue(Integer.parseInt(det.get(1).toString()));
                    jtapaymentfor.setText(det.get(2).toString());
            } catch (SQLException ex) {
                Logger.getLogger(EditFee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtapaymentfor = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jsregno = new javax.swing.JSpinner();
        jsammount = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbbordingdetails = new javax.swing.JComboBox();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fee Payment");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Edit Fee");

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("Registration Number");

        jtapaymentfor.setColumns(20);
        jtapaymentfor.setRows(5);
        jtapaymentfor.setText("School Fee");
        jScrollPane1.setViewportView(jtapaymentfor);

        jLabel11.setForeground(new java.awt.Color(0, 0, 240));
        jLabel11.setText("Payment For");

        jLabel12.setForeground(new java.awt.Color(0, 0, 240));
        jLabel12.setText("Ammount");

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("Select Boarding  Details");

        cmbbordingdetails.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Border", "Day Scholar" }));
        cmbbordingdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbordingdetailsActionPerformed(evt);
            }
        });

        btnclose.setText("Close");
        btnclose.setEnabled(false);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(290, 290, 290)
                        .addComponent(btnclose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jsregno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(75, 75, 75)
                                .addComponent(jsammount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbbordingdetails, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(387, 387, 387))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbordingdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jsammount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton5)
                            .addComponent(btnclose)))
                    .addComponent(jLabel11))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        long regno;
        double ammount;
        String paymentfor;
        int bording;
        if(cmbbordingdetails.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null,
                        "Please Select Students boarding Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        if(Integer.parseInt(jsregno.getValue().toString())== 0)
        {
             JOptionPane.showMessageDialog(null,
                        "Please Enter Students Registration Number to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(Integer.parseInt(jsammount.getValue().toString())== 0)
        {
             JOptionPane.showMessageDialog(null,
                        "Please Enter Fee Ammount to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            bording = cmbbordingdetails.getSelectedIndex();
            regno = Long.parseLong(jsregno.getValue().toString());
            ammount = Double.parseDouble(jsammount.getValue().toString());
            
            if("".equals(jtapaymentfor.getText()))
            paymentfor=null;
            else
                paymentfor = jtapaymentfor.getText().toUpperCase();
            
            int bordingid = selects.QueryPayFee.getBordingDetails(regno);
            //System.out.println(bordingid);
            
             
            if(bording==1)
            {
                if(bordingid==0){
                    JOptionPane.showMessageDialog(null, "Wrong Bording Details \n" +
                                 "Press Correct to Continue", "Error ", JOptionPane.ERROR_MESSAGE);

                }
                else if(bordingid == -1){
                    JOptionPane.showMessageDialog(null, "Student does not Exist \n" +
                                 "Press Check the Student ID", "Error ", JOptionPane.ERROR_MESSAGE);

                }
                else if(bordingid>0)
                {
                try {
                    String totalstr,balstr;
                    Double total,bal;
                    totalstr = selects.QueryPayFee.getBorderTotal(regno);
                    balstr = selects.QueryPayFee.getBorderBal(regno);
                    total = Double.parseDouble(totalstr);
                    bal = Double.parseDouble(balstr);
                    total = total + ammount;
                    bal = bal - ammount;
                    sqlinserts.NewFeePaymentBorder.payBorderFee(regno, ammount, paymentfor, currentuserid);
                    sqlupdates.PayFee.updateBorderStatement(total, bal, regno);
                    saved=true;
                    
                   
                } catch (SQLException ex) {
                    Logger.getLogger(EditFee.class.getName()).log(Level.SEVERE, null, ex);
                     if(ex.getErrorCode() == 1062)
                         {
                                JOptionPane.showMessageDialog(null, "Double Payment detected \n\n" +
                                "Payment of same ammount of money by a student in the same day is not allowed.\n Please contact authorities for advice.", "Failed ", JOptionPane.ERROR_MESSAGE);
                          }
                      else 
                          {
                                 JOptionPane.showMessageDialog(null, "Unknown Error. \n" +
                                 "Press Contact the Administrator for further advice", "Error "+ex.getErrorCode(), JOptionPane.ERROR_MESSAGE);
                          }
                }
                }
                
            }
            else if(bording ==2)
            {
                if(bordingid>0){
                    JOptionPane.showMessageDialog(null, "Wrong Bording Details \n" +
                                 "Press Correct to Continue", "Error ", JOptionPane.INFORMATION_MESSAGE);

                }
                else if(bordingid==-1)
                {
                     JOptionPane.showMessageDialog(null, "Student does not Exist \n" +
                              "Press Check the Student ID", "Error ", JOptionPane.INFORMATION_MESSAGE);

                }
                else if(bordingid==0)
                {
                try {
                    String totalstr,balstr;
                    Double total,bal;
                    totalstr = selects.QueryPayFee.getNonBorderTotal(regno);
                    balstr = selects.QueryPayFee.getNonBorderBal(regno);
                    total = Double.parseDouble(totalstr);
                    bal = Double.parseDouble(balstr);
                    total = total + ammount;
                    bal = bal - ammount;
                    sqlinserts.NewFeePaymentNonBorder.payNonBorderFee(regno, ammount, paymentfor, currentuserid);
                    sqlupdates.PayFee.updateNonBorderStatement(total, bal, regno);
                    saved=true;
                   
                   
                }  catch (SQLException ex) {
                    Logger.getLogger(EditFee.class.getName()).log(Level.SEVERE, null, ex);
                     if(ex.getErrorCode() == 1062)
                         {
                                JOptionPane.showMessageDialog(null, "Double Payment detected \n\n" +
                                "Payment of same ammount of money by a student in the same day is not allowed.\n Please contact authorities for advice.", "Failed ", JOptionPane.INFORMATION_MESSAGE);
                          }
                      else 
                          {
                                 JOptionPane.showMessageDialog(null, "Unknown Error. \n" +
                                 "Press Contact the Administrator for further advice", "Error "+ex.getErrorCode(), JOptionPane.INFORMATION_MESSAGE);
                          }
                }
            }
          }           
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cmbbordingdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbordingdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbordingdetailsActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(EditFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFee(currentuserid,bordinginfo,receiptnumber).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JComboBox cmbbordingdetails;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsammount;
    private javax.swing.JSpinner jsregno;
    private javax.swing.JTextArea jtapaymentfor;
    // End of variables declaration//GEN-END:variables
}
