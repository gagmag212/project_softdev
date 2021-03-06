
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class JobDetailForm extends javax.swing.JFrame {
    ArrayList<Job> jobArr = new ArrayList<>();
    JobDetailService jobDeatailService = new JobDetailService();
    /**
     * Creates new form JobDetailForm
     */
    public JobDetailForm() {
        initComponents();
    }
    
    public void setJob(String jobName, ArrayList<Job> jobSelect) {
        jobArr = jobSelect;
        int index = jobArr.size()-1;
        label_jobName.setText(jobArr.get(index).jobName);
        label_jobName.setHorizontalAlignment(SwingConstants.CENTER);
        label_jobName.setVerticalAlignment(SwingConstants.CENTER);
        jobDetail.setBorder(null);
        jobDetail.setText(" จำนวนที่รับ : " + jobArr.get(index).jobAmount + " อัตรา" + "\n" + "\n" +
                          " เงินเดือน : " + jobArr.get(index).jobSalary + " บาท" + "\n" + "\n" +
                          " สถานที่ปฏิบัติงาน : " + jobArr.get(index).jobAddress + "\n" + "\n" +
                          " จังหวัด." + jobArr.get(index).jobProvince + "\n" + "\n" +
                          " รายละเอียดงาน : \n" + jobArr.get(index).jobDetail + "\n" + "\n" +
                          " คุณสมบัติผู้สมัคร : \n" + jobArr.get(index).employeeProperty + "\n" + "\n" +
                          " สวัสดิการ : \n" + jobArr.get(index).jobWelfare) ;
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
        label_jobName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobDetail = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_jobName.setBackground(new java.awt.Color(0, 0, 102));
        label_jobName.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        label_jobName.setForeground(new java.awt.Color(255, 255, 255));
        label_jobName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_jobName.setOpaque(true);
        jPanel1.add(label_jobName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(0, 0, 102));
        btn_back.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("กลับ");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 290, 30));

        btn_register.setBackground(new java.awt.Color(0, 0, 102));
        btn_register.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("สมัคร");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 600, 50));

        jobDetail.setColumns(20);
        jobDetail.setRows(5);
        jScrollPane1.setViewportView(jobDetail);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 590));

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

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.hide();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        String name = jobDeatailService.getName();
        int index = jobArr.size()-1;
        
        if (!jobDeatailService.checkApplicantByKeyword(name, jobArr.get(index).jobName)) {
            JOptionPane.showMessageDialog(null, "คุณเคยสมัครงานนี้ไปแล้ว", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            jobDeatailService.insertApplicant(name, jobArr.get(index).jobName);
            JOptionPane.showMessageDialog(null, "สมัครสำเร็จ");
        }
    }//GEN-LAST:event_btn_registerActionPerformed

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
            java.util.logging.Logger.getLogger(JobDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JobDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JobDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JobDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JobDetailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_register;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jobDetail;
    private javax.swing.JLabel label_jobName;
    // End of variables declaration//GEN-END:variables
}
