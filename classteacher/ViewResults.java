/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classteacher;

import Teacher.*;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import selects.QueryClassDetails;
import selects.QueryExamDetails;
import superadmin.ViewStaff;

/**
 *
 * @author franq
 */
public class ViewResults extends javax.swing.JFrame {

    /**
     * Creates new form ViewResults
     */
    
    private static int currentUserId;
    private ArrayList<String> exams;
    
    private static int classID;
    private static int examId;
    private Action finishEnterAction;
    
    
    
    public ViewResults(int user) {
        constructor(user);
    }

    private void constructor(int currentuser)
    {
         exams = QueryExamDetails.getExamDetails();
         finishEnterAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
                btnentermarksActionPerformed(e);
                        
            }
        };
        
    
         classID = 8;
        currentUserId = 38;
        
        initComponents();
        cmbexams.setEnabled(true);
        cmbexams.setModel(new DefaultComboBoxModel(exams.toArray(new String[exams.size()])));
        this.btnprint.setEnabled(false);
             
       
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
        jPanel2 = new javax.swing.JPanel();
        btnentermarks = new javax.swing.JButton();
        cmbexams = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jbtcancel2 = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemarksentry = new javax.swing.JTable();
        jbtcancel3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exam Results");
        setIconImage(selects.QueryMainDetails.setIcon());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Select Exam Details");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnentermarks.setText("View Marks");
        btnentermarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentermarksActionPerformed(evt);
            }
        });

        cmbexams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbexamsActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 240));
        jLabel7.setText("Exam Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(cmbexams, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnentermarks, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnentermarks)
                    .addComponent(cmbexams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jbtcancel2.setText("Reset");
        jbtcancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancel2ActionPerformed(evt);
            }
        });

        btnprint.setText("Print Record");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        tablemarksentry.setAutoCreateRowSorter(true);
        tablemarksentry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Surname", "First Name", "Last Name","Gender","Marks"
            }
        ));
        jScrollPane1.setViewportView(tablemarksentry);

        jbtcancel3.setText("Ok");
        jbtcancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancel3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jbtcancel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(jbtcancel3)
                .addGap(330, 330, 330)
                .addComponent(btnprint)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(395, 395, 395))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtcancel2)
                    .addComponent(btnprint)
                    .addComponent(jbtcancel3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnentermarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentermarksActionPerformed
        // TODO add your handling code here:
        btnprint.setEnabled(true);
        updateMarksEntryTable();
        tablemarksentry.setEnabled(false);
        
    }//GEN-LAST:event_btnentermarksActionPerformed

    private void cmbexamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbexamsActionPerformed
        // TODO add your handling code here:
        try {
            examId = QueryExamDetails.getExamID(cmbexams.getSelectedItem().toString());
            cmbexams.addActionListener(finishEnterAction);
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Was not able to load Exam Details\n"+
                "Please Contact System Admin for Assistance","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbexamsActionPerformed

    private void jbtcancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancel2ActionPerformed
        // TODO add your handling code here:
        this.reset();
    }//GEN-LAST:event_jbtcancel2ActionPerformed

    private  void reset()
    {
        
        this.tablemarksentry.setEnabled(false);
        this.cmbexams.setSelectedIndex(0);
        
        
        tablemarksentry.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
    },
    new String [] {
        "ID", "Surname", "First Name", "Last Name","Gender","Marks"
    }
));
}
    
    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
     // TODO add your handling code here:
        DBConnection dbconn =new DBConnection();
        Connection conn = dbconn.vconnection;
        
        try {
            //String report = "C:\\Users\\franq\\Documents\\NetBeansProjects\\Frigate management System 1.0.1\\report\\student.jrxml";
            
            JasperDesign jd = JRXmlLoader.load("report\\examresults.jrxml");
            
            String sql =    "SET @sql = NULL;\n" +
                            "SELECT\n" +
                            "  GROUP_CONCAT(DISTINCT\n" +
                            "    CONCAT(\n" +
                            "      'SUM(case \n" +
                            "	  when subjectID = ''',subjectID,''' then Marks else 0 end\n" +
                            "	) AS `subject_',subjectID, '`'\n" +
                            "    )\n" +
                            "  ) INTO @sql\n" +
                            "FROM exam_result;\n" +
                            "\n" +
                            "\n" +
                            "SET @sql = CONCAT('SELECT studentID, ', @sql, '\n" +
                            "                  FROM exam_result\n" +
                            "		  WHERE examID=13\n" +
                            "		  AND classID=8\n" +
                            "		  AND Activate=FALSE\n" +
                            "                  GROUP BY studentID');\n" +
                            "\n" +
                            "PREPARE stmt FROM @sql;\n" +
                            "EXECUTE stmt;\n" +
                            "DEALLOCATE PREPARE stmt;";
            
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            Logger.getLogger(ViewStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void jbtcancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancel3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtcancel3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewResults(currentUserId).setVisible(true);
            }
        });
    }
    
     //update table 
    private static void updateMarksEntryTable()
    {
            DBConnection dbconn =new DBConnection();
            Connection conn = dbconn.vconnection;
            Statement pstmt;
            ResultSet rs;
            String Sql0 = "SET @sql = null;";
            String Sql="SELECT\n" +
            "GROUP_CONCAT(DISTINCT\n" +
            "CONCAT(\n" +
            "'SUM(case \n" +
            "when subjectID = ''',subjectID,''' then Marks else 0 end\n" +
            ") AS `Subject_',subjectID, '`'\n" +
            ")\n" +
            ") INTO @sql\n" +
            "FROM exam_result;";

            String Sql1 = "SET @sql = CONCAT('SELECT `exam_result`.`studentID`,`student`.`surname`,`student`.`First Name`,`student`.`Last Name`,`student`.`Gender`, ', @sql, ', `exam_student_total`.`Total`\n" +
            "FROM `exam_result`\n" +
            "INNER JOIN `student`\n" +
            "ON exam_result.studentID = `student`.`id`\n" +
            "INNER JOIN `exam_student_total`\n" +
            "ON `exam_student_total`.`examID`=`exam_result`.`examID`\n" +
            "AND `exam_student_total`.`studentID`=`exam_result`.`studentID`\n" +
            "WHERE `exam_result`.`examID`="+examId+"\n" +
            "AND `exam_result`.`classID`="+classID+"\n" +
            "AND `exam_result`.`Activate`=FALSE\n" +
            "GROUP BY `exam_result`.`studentID`');";
            
            String Sql2 = "PREPARE stmt FROM @sql;";
            
            String Sql3 = "EXECUTE stmt;";
            String Sql4 = "DEALLOCATE PREPARE stmt;";
                            
                            
           try{
            pstmt = conn.createStatement();
            pstmt.executeQuery(Sql0);
            pstmt.executeQuery(Sql);
             pstmt.executeQuery(Sql1);
            pstmt.executeQuery(Sql2);
            rs = pstmt.executeQuery(Sql3);
            
            TableModel model = DbUtils.resultSetToTableModel(rs);
            tablemarksentry.setModel(model);
            
            pstmt.executeQuery(Sql4);
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentermarks;
    private javax.swing.JButton btnprint;
    private javax.swing.JComboBox cmbexams;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtcancel2;
    private javax.swing.JButton jbtcancel3;
    private static javax.swing.JTable tablemarksentry;
    // End of variables declaration//GEN-END:variables
}
