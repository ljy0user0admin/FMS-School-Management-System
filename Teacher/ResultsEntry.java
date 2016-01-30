/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teacher;

import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import selects.QueryClassDetails;
import selects.QueryExamDetails;

/**
 *
 * @author franq
 */
public class ResultsEntry extends javax.swing.JFrame {
    
    private static int currentUserId;
    private ArrayList<String> classestaught;
    private ArrayList<String> subjectstaught;
    private ArrayList<String> exams;
    
    private static int classTaughtID;
    private static int subjecttaughtID;
    private static int examId;
    private static int subject_teacher_classID;
    private Action enterAction;
    private Action finishEnterAction;
    private static boolean showhint;
    
    
    public ResultsEntry(int userid) {
        constructor(userid);
    }

    private void constructor(int userid)
    {
               //createa action listener for the ente button
        enterAction = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.getFocusOwner().transferFocus();
        }
        };
        
         finishEnterAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
                btnentermarks4ActionPerformed(e);
                        
            }
        };
        
         
         
        currentUserId = userid;
        
        initComponents();
        
        this.btnprint.setEnabled(false);
        
        //get the subjects taught from the database
        classestaught = QueryExamDetails.getClassesTaught(currentUserId);
        cmbResulstsClass5.setModel(new DefaultComboBoxModel(classestaught.toArray(new String[classestaught.size()])));
        
        
        cmbResulstsSubject5.setEnabled(false);
        cmbexams5.setEnabled(false);
        showhint = true;
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablemarksentry5 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbResulstsClass5 = new javax.swing.JComboBox();
        cmbResulstsSubject5 = new javax.swing.JComboBox();
        cmbexams5 = new javax.swing.JComboBox();
        btnentermarks5 = new javax.swing.JButton();
        jbtsave2 = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jbtsave1 = new javax.swing.JButton();
        jbtsave3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marks Entry");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 240));
        jLabel24.setText("Select Exam Details");

        tablemarksentry5.setModel(new javax.swing.table.DefaultTableModel(
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
        tablemarksentry5.setCellSelectionEnabled(true);
        tablemarksentry5.setEnabled(false);
        tablemarksentry5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemarksentry4MouseClicked(evt);
            }
        });
        tablemarksentry5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablemarksentry4KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(tablemarksentry5);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel25.setForeground(new java.awt.Color(0, 0, 240));
        jLabel25.setText("Exam");

        jLabel26.setForeground(new java.awt.Color(0, 0, 240));
        jLabel26.setText("Subject");

        jLabel27.setForeground(new java.awt.Color(0, 0, 240));
        jLabel27.setText("Class");

        cmbResulstsClass5.setEnabled(true);
        cmbResulstsClass5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbResulstsClass4ActionPerformed(evt);
            }
        });

        cmbResulstsSubject5.setEnabled(false);
        cmbResulstsSubject5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbResulstsSubject4ActionPerformed(evt);
            }
        });

        cmbexams5.setEnabled(false);
        cmbexams5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbexams4ActionPerformed(evt);
            }
        });

        btnentermarks5.setText("Enter Marks");
        btnentermarks5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentermarks4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(cmbResulstsClass5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(47, 47, 47)
                .addComponent(cmbResulstsSubject5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(cmbexams5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnentermarks5)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(cmbResulstsClass5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbResulstsSubject5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbexams5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnentermarks5))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jbtsave2.setText("Reset");
        jbtsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsave2ActionPerformed(evt);
            }
        });

        btnprint.setText("Print Record");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        jbtsave1.setText("View Record");
        jbtsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsave1ActionPerformed(evt);
            }
        });

        jbtsave3.setText("Ok");
        jbtsave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsave3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(395, 395, 395))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jbtsave2)
                .addGap(287, 287, 287)
                .addComponent(btnprint)
                .addGap(47, 47, 47)
                .addComponent(jbtsave3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtsave1)
                .addGap(62, 62, 62))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 511, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtsave2)
                    .addComponent(btnprint)
                    .addComponent(jbtsave1)
                    .addComponent(jbtsave3)))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                    .addContainerGap(135, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnentermarks4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentermarks4ActionPerformed
        // TODO add your handling code here:
        updateMarksEntryTable();
        tablemarksentry5.setEnabled(true);
        this.btnprint.setEnabled(false);
        if(showhint==true)
        {
            JOptionPane.showMessageDialog(null,
                "To Enter Student Marks, Key in The Specific Marks Then Click Enter Twice To Save.\n\n"+
                "Its Also Recomended to Click The View Records Button to Confirm Whether the Marks \nWere Saved Before Proceeding.","Information",JOptionPane.INFORMATION_MESSAGE);
            showhint = false;
        }
    }//GEN-LAST:event_btnentermarks4ActionPerformed

    private void cmbexams4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbexams4ActionPerformed
        // TODO add your handling code here:
        try {
            examId = QueryExamDetails.getExamID(cmbexams5.getSelectedItem().toString());
            cmbexams5.addActionListener(finishEnterAction);
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Was not able to load Exam Details\n"+
                "Please Contact System Admin for Assistance","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbexams4ActionPerformed

    private void cmbResulstsSubject4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbResulstsSubject4ActionPerformed
        // TODO add your handling code here:
        String subjectname = cmbResulstsSubject5.getSelectedItem().toString().toUpperCase();
        try {

            int subjecttaughtIDid = selects.QueryExamDetails.subjecttaughtnames.indexOf(subjectname);
            subjecttaughtID = Integer.parseInt(selects.QueryExamDetails.subjecttaughtids.get(subjecttaughtIDid).toString());
            exams = QueryExamDetails.getExamDetails();
            cmbexams5.setEnabled(true);
            cmbexams5.setModel(new DefaultComboBoxModel(exams.toArray(new String[exams.size()])));

        } catch (Exception ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Was not able to load Exam Details\n"+
                "Please Select Subject Details first","Error Message",JOptionPane.ERROR_MESSAGE);
            cmbexams5.setEnabled(false);
        }
    }//GEN-LAST:event_cmbResulstsSubject4ActionPerformed

    private void cmbResulstsClass4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbResulstsClass4ActionPerformed
        // TODO add your handling code here:
        String classname = cmbResulstsClass5.getSelectedItem().toString();
        try {
            selects.QueryClassDetails.getClassNames();
            int classTaughtIDid = QueryClassDetails.listofnames.indexOf(classname);
            classTaughtID = Integer.parseInt(QueryClassDetails.listofids.get(classTaughtIDid).toString());

            subjectstaught = QueryExamDetails.getSubjectTaught(currentUserId,classTaughtID);
            cmbResulstsSubject5.setModel(new DefaultComboBoxModel(subjectstaught.toArray(new String[subjectstaught.size()])));
            cmbResulstsSubject5.setEnabled(true);
            cmbResulstsClass5.addActionListener(enterAction);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Was not able to load Subject name details\n"+
                "Please Select Class  First","Error Message",JOptionPane.ERROR_MESSAGE);
            cmbResulstsSubject5.setEnabled(false);
            cmbexams5.setEnabled(false);
        }
    }//GEN-LAST:event_cmbResulstsClass4ActionPerformed

    private void tablemarksentry4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablemarksentry4KeyPressed
        int row = tablemarksentry5.getSelectedRow();
        double oldval;
        int id = Integer.parseInt(tablemarksentry5.getValueAt(row, 0).toString());
        try {
            //get the old value from the database
            oldval = selects.QueryExamResults.getOldMark(examId, id, classTaughtID, subjecttaughtID, subject_teacher_classID);

            //get current value printed by user
            double val = Double.parseDouble(tablemarksentry5.getValueAt(row, 5).toString());
            double mark = val;

            //calls function to update the mark in the database
            sqlupdates.ExamResultsInfo.updateMark(examId, id, classTaughtID, subjecttaughtID, subject_teacher_classID, mark, id);

            double oldmark = selects.QueryExamResults.getOldTotal(examId, id, classTaughtID);
            double newmark = oldmark-oldval+mark;
            //update total mark
            sqlupdates.ExamTotalMarksInfo.updateTotalMark(examId, id, classTaughtID, newmark);

        }  catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode() == 1062)
            {
                JOptionPane.showMessageDialog(null, "It Seems Marks For This Exam Have Been Updated Already\n"
                    + "Click Edit To Update", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Marks have not been Updated\n"+
                "Please Contact System Admin for Assistance","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tablemarksentry4KeyPressed

    private void tablemarksentry4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemarksentry4MouseClicked
     
    }//GEN-LAST:event_tablemarksentry4MouseClicked

    private void jbtsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsave1ActionPerformed
       updateViewMarksEntryTable();
        tablemarksentry5.setEnabled(true);
        this.btnprint.setVisible(true);
    }//GEN-LAST:event_jbtsave1ActionPerformed

     
    
    private void jbtsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsave2ActionPerformed
      this.reset();
    }//GEN-LAST:event_jbtsave2ActionPerformed

    private void jbtsave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsave3ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbtsave3ActionPerformed

    
    private  void reset()
    {
        this.cmbResulstsSubject5.setEnabled(false);
        this.tablemarksentry5.setEnabled(false);
        this.cmbexams5.setEnabled(false);
        this.cmbResulstsClass5.setSelectedIndex(0);
        
        tablemarksentry5.setModel(new javax.swing.table.DefaultTableModel(
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
    
    
    //update table 
    private static void updateMarksEntryTable()
    {
            DBConnection dbconn =new DBConnection();
            Connection conn = dbconn.vconnection;
            PreparedStatement pstmt;
            subject_teacher_classID = selects.QuerySubjectClassTeacher.getClass_TeacherID(subjecttaughtID,  currentUserId, classTaughtID);
            ResultSet rs;
            String Sql= "SELECT  `student`.`ID` ,  `student`.`surname` ,  `student`.`First Name` ,  `student`.`Last Name` ,  `student`.`Gender` \n" +
                        "FROM  `student` \n" +
                        "INNER JOIN  `exam_result` \n" +
                        "ON    `student`.`classID` =? "
                    +   "AND `exam_result`.`classID`=? \n" +
                        "AND  `exam_result`.`examID` =? \n" +
                        "AND  `exam_result`.`Activate` = \n" +
                        "TRUE "+
                        "ORDER BY  `ID`;";
        try {
            pstmt = conn.prepareStatement(Sql);
            pstmt.setInt(1, classTaughtID);
            pstmt.setInt(2, classTaughtID);
            pstmt.setInt(3, examId);
           
            
             
            
            rs = pstmt.executeQuery();
            TableModel mod = DbUtils.resultSetToTableModel(rs);
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) mod;
            model.addColumn("Marks");
            tablemarksentry5.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    //update table 
    private static void updateViewMarksEntryTable()
    {
            DBConnection dbconn =new DBConnection();
            Connection conn = dbconn.vconnection;
            PreparedStatement pstmt;
            subject_teacher_classID = selects.QuerySubjectClassTeacher.getClass_TeacherID(subjecttaughtID,  currentUserId, classTaughtID);
            ResultSet rs;
            String Sql= "";
            
            Sql = "SELECT  `student`.`ID` ,  `student`.`surname` ,  `student`.`First Name` ,  `student`.`Last Name` ,  `student`.`Gender`,`exam_result`.`Marks`\n" +
                  "FROM  `student` INNER JOIN  `exam_result`\n" +
                  "ON  `student`.`ID` =  `exam_result`.`studentID` \n" +
                  "WHERE  `student`.`classID` =?\n" +
                  "AND  `exam_result`.`examID` =?\n" +
                  "AND  `exam_result`.`subject_teacher_classID` =?\n" +
                  "AND  `exam_result`.`subjectID` =?\n" +
                  "AND  `exam_result`.`Activate` = \n" +
                  "FALSE \n" +
                  "ORDER BY  `ID` ";
        try {
            pstmt = conn.prepareStatement(Sql);
            pstmt.setInt(1, classTaughtID);
            pstmt.setInt(2, examId);
            pstmt.setInt(3, subject_teacher_classID);
            pstmt.setInt(4,subjecttaughtID);
            
             
            
            rs = pstmt.executeQuery();
            TableModel model = DbUtils.resultSetToTableModel(rs);
            tablemarksentry5.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ResultsEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultsEntry(currentUserId).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentermarks5;
    private javax.swing.JButton btnprint;
    private javax.swing.JComboBox cmbResulstsClass5;
    private javax.swing.JComboBox cmbResulstsSubject5;
    private javax.swing.JComboBox cmbexams5;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton jbtsave1;
    private javax.swing.JButton jbtsave2;
    private javax.swing.JButton jbtsave3;
    private static javax.swing.JTable tablemarksentry5;
    // End of variables declaration//GEN-END:variables
}