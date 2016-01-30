/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clerk;

import javax.swing.JOptionPane;

/**
 *
 * @author franq
 */
public class SearchStudent extends javax.swing.JFrame {

    /**
     * Creates new form SearchStudent
     */
    
    private static int currentuserid = 0;
    
    public SearchStudent(int userid) {
        initComponents();
        this.setTitle("Search Student");
        currentuserid = userid;
        tfstudentnumber.setVisible(true);
        lblstudentnumber.setVisible(true);
        tfsurname.setVisible(false);
        lblsurname.setVisible(false);
        tffirstname.setVisible(false);
        lblfirstname.setVisible(false);
        tflastname.setVisible(false);
        lbllastname.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jrbnumber = new javax.swing.JRadioButton();
        jrbname = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblstudentnumber = new javax.swing.JLabel();
        tfstudentnumber = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblfirstname = new javax.swing.JLabel();
        tffirstname = new javax.swing.JFormattedTextField();
        lblsurname = new javax.swing.JLabel();
        tflastname = new javax.swing.JFormattedTextField();
        lbllastname = new javax.swing.JLabel();
        tfsurname = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setForeground(new java.awt.Color(0, 0, 240));
        jLabel4.setText("Select Search Criteria");

        jrbnumber.setForeground(new java.awt.Color(0, 0, 240));
        jrbnumber.setSelected(true);
        jrbnumber.setText("Student Number");
        jrbnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbnumberActionPerformed(evt);
            }
        });

        jrbname.setForeground(new java.awt.Color(0, 0, 240));
        jrbname.setText("Student Name");
        jrbname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbname)
                    .addComponent(jrbnumber))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jrbnumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbname)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblstudentnumber.setForeground(new java.awt.Color(0, 0, 240));
        lblstudentnumber.setText("Enter Student Number");
        jPanel2.add(lblstudentnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 54, -1, -1));
        jPanel2.add(tfstudentnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 370, -1));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        lblfirstname.setForeground(new java.awt.Color(0, 0, 240));
        lblfirstname.setText("Enter First Name");
        jPanel2.add(lblfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 92, -1, -1));
        jPanel2.add(tffirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 104, -1));

        lblsurname.setForeground(new java.awt.Color(0, 0, 240));
        lblsurname.setText("Enter Surname");
        jPanel2.add(lblsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        jPanel2.add(tflastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 104, -1));

        lbllastname.setForeground(new java.awt.Color(0, 0, 240));
        lbllastname.setText("Enter Last Name");
        jPanel2.add(lbllastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, 20));
        jPanel2.add(tfsurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 104, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jrbnumber.isSelected() == true)
        {
            if("".equals(tfstudentnumber.getText()))
            {
                 JOptionPane.showMessageDialog(null,
                        "Please Enter Student Number to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
            TransferStudent edit = new TransferStudent(currentuserid, Integer.parseInt(this.tfstudentnumber.getText()), null, null, null);
            edit.main(new String[9]);
            this.hide();
            }
        }
        else if(jrbname.isSelected() == true)
        {
            String surname,fname,lname;
            surname = this.tfsurname.getText().toUpperCase();
            fname = this.tffirstname.getText().toUpperCase();
            lname = this.tflastname.getText().toUpperCase();
            if("".equals(surname))
            {
                 JOptionPane.showMessageDialog(null,
                        "Please Enter Surname to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if("".equals(fname))
            {
                 JOptionPane.showMessageDialog(null,
                        "Please Enter First Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if("".equals(lname))
            {
                 JOptionPane.showMessageDialog(null,
                        "Please Enter Last Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
            }
            else {
            TransferStudent edit = new TransferStudent(currentuserid, 0, surname, fname, lname);
            edit.main(new String[9]);
            this.hide();
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jrbnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbnameActionPerformed
        // TODO add your handling code here:
        if(jrbname.isSelected()==true)
        {
        jrbnumber.setSelected(false);
        tfstudentnumber.setVisible(false);
        lblstudentnumber.setVisible(false);
        tfsurname.setVisible(true);
        lblsurname.setVisible(true);
        tffirstname.setVisible(true);
        lblfirstname.setVisible(true);
        tflastname.setVisible(true);
        lbllastname.setVisible(true);
        }
        else
        {
        jrbnumber.setSelected(true);
        tfstudentnumber.setVisible(true);
        lblstudentnumber.setVisible(true);
        tfsurname.setVisible(false);
        lblsurname.setVisible(false);
        tffirstname.setVisible(false);
        lblfirstname.setVisible(false);
        tflastname.setVisible(false);
        lbllastname.setVisible(false);
        }
    }//GEN-LAST:event_jrbnameActionPerformed

    private void jrbnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbnumberActionPerformed
        // TODO add your handling code here:
        if(jrbnumber.isSelected() == true)
        {
        jrbname.setSelected(false);
        tfstudentnumber.setVisible(true);
        lblstudentnumber.setVisible(true);
        tfsurname.setVisible(false);
        lblsurname.setVisible(false);
        tffirstname.setVisible(false);
        lblfirstname.setVisible(false);
        tflastname.setVisible(false);
        lbllastname.setVisible(false);
        
        }
        else
        {
        jrbname.setSelected(true);
         tfstudentnumber.setVisible(false);
        lblstudentnumber.setVisible(false);
        tfsurname.setVisible(true);
        lblsurname.setVisible(true);
        tffirstname.setVisible(true);
        lblfirstname.setVisible(true);
        tflastname.setVisible(true);
        lbllastname.setVisible(true);
        }
    }//GEN-LAST:event_jrbnumberActionPerformed

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
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchStudent(currentuserid).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrbname;
    private javax.swing.JRadioButton jrbnumber;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblstudentnumber;
    private javax.swing.JLabel lblsurname;
    private javax.swing.JFormattedTextField tffirstname;
    private javax.swing.JFormattedTextField tflastname;
    private javax.swing.JFormattedTextField tfstudentnumber;
    private javax.swing.JFormattedTextField tfsurname;
    // End of variables declaration//GEN-END:variables
}
