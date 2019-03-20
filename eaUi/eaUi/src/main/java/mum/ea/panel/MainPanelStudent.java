/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.ea.panel;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import mum.ea.controller.CourseController;
import mum.ea.controller.MemberController;
import mum.ea.helper.LoginHelper;
import mum.ea.model.CourseModel;
import mum.ea.model.EaResultData;
import mum.ea.panel.AddMemberPanel;

/**
 *
 * @author umurinan
 */

public class MainPanelStudent extends javax.swing.JFrame {

    /**
     * Creates new form MainPanel
     */
    public MainPanelStudent() {
        initComponents();
        CourseController courseController = new CourseController();
        EaResultData<List<CourseModel>> courseList = courseController.getAllMyCourses();

        addRowToJTable(courseList.getData());
    }
    
     public void addRowToJTable(List<CourseModel> list)
    {
        DefaultTableModel model = (DefaultTableModel) listMyCourse.getModel();
        
        Object rowData[] = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).getName();
            rowData[1] = list.get(i).getDescription();
            rowData[2] = list.get(i).getInstructor().getFirstname();
            model.addRow(rowData);
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

        jButton1 = new javax.swing.JButton();
        wishList = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        studentCourse = new javax.swing.JPanel();
        myCourses = new javax.swing.JButton();
        enroll = new javax.swing.JButton();
        archiveCourse = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMyCourse = new javax.swing.JTable();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        wishList.setText("WishList Courses");
        wishList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wishListActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myCourses.setText("My Courses");
        myCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCoursesActionPerformed(evt);
            }
        });

        enroll.setText("Enroll ");
        enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollActionPerformed(evt);
            }
        });

        archiveCourse.setText("Archive Courses");
        archiveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archiveCourseActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("My Courses");

        listMyCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Teacher Name"
            }
        ));
        jScrollPane1.setViewportView(listMyCourse);

        javax.swing.GroupLayout studentCourseLayout = new javax.swing.GroupLayout(studentCourse);
        studentCourse.setLayout(studentCourseLayout);
        studentCourseLayout.setHorizontalGroup(
            studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentCourseLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(myCourses)
                .addGap(21, 21, 21)
                .addComponent(enroll)
                .addGap(164, 164, 164)
                .addComponent(archiveCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(39, 39, 39))
            .addGroup(studentCourseLayout.createSequentialGroup()
                .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentCourseLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1))
                    .addGroup(studentCourseLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentCourseLayout.setVerticalGroup(
            studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myCourses)
                    .addComponent(enroll)
                    .addComponent(archiveCourse)
                    .addComponent(logoutButton))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(studentCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(studentCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myCoursesActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        LoginPanel loginPanel = new LoginPanel();
        loginPanel.show();
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void archiveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archiveCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archiveCourseActionPerformed

    private void wishListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wishListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wishListActionPerformed

    private void enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollActionPerformed
        System.out.println("The Id:"+LoginHelper.getId());
        System.out.println();
        MemberController memberControl=new MemberController();
        //List<CourseModel> courses=memberControl.myCourse(LoginHelper.getId());
        
        //System.out.println("Size:"+courses.size());
    }//GEN-LAST:event_enrollActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPanelStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanelStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanelStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanelStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanelStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archiveCourse;
    private javax.swing.JButton enroll;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listMyCourse;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton myCourses;
    private javax.swing.JPanel studentCourse;
    private javax.swing.JButton wishList;
    // End of variables declaration//GEN-END:variables
}
