/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;






/**
 *
 * @author Garage88fort
 */
public class students extends javax.swing.JFrame {

     
    public students() {
        initComponents();
        ImageIcon my = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("au.png")));
        
        Image img1=my.getImage();
        Image image = img1.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(image);
        
        label.setIcon(i);
        
        ImageIcon mye = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("nge.png")));
        
        Image img11=mye.getImage();
        Image imagee = img11.getScaledInstance(labela.getWidth(),labela.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ie = new ImageIcon(imagee);
        
        labela.setIcon(ie);
        
        
        
        
        
        
        
        
    }
     


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        strand = new javax.swing.JTextField();
        gen = new javax.swing.JTextField();
        sn = new javax.swing.JTextField();
        sec = new javax.swing.JTextField();
        namee = new javax.swing.JTextField();
        shift = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(255, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true));
        jPanel2.setLayout(null);

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(pic);
        pic.setBounds(110, 40, 169, 147);

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel1.setText("Student Name: ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 200, 110, 16);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel4.setText("Section: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 310, 70, 14);

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel2.setText("Student Number :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 250, 130, 21);

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel3.setText("Grade: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 340, 70, 20);

        grade.setEditable(false);
        grade.setBackground(new java.awt.Color(0, 102, 204));
        grade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        grade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(grade);
        grade.setBounds(100, 340, 74, 23);

        strand.setEditable(false);
        strand.setBackground(new java.awt.Color(0, 102, 204));
        strand.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        strand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(strand);
        strand.setBounds(260, 340, 79, 23);

        gen.setEditable(false);
        gen.setBackground(new java.awt.Color(0, 102, 204));
        gen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        gen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(gen);
        gen.setBounds(100, 370, 74, 23);

        sn.setEditable(false);
        sn.setBackground(new java.awt.Color(0, 102, 204));
        sn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(sn);
        sn.setBounds(100, 310, 74, 23);

        sec.setEditable(false);
        sec.setBackground(new java.awt.Color(0, 102, 204));
        sec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(sec);
        sec.setBounds(120, 280, 193, 23);

        namee.setEditable(false);
        namee.setBackground(new java.awt.Color(0, 102, 204));
        namee.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        namee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namee.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        namee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameeActionPerformed(evt);
            }
        });
        jPanel2.add(namee);
        namee.setBounds(100, 220, 230, 23);

        shift.setEditable(false);
        shift.setBackground(new java.awt.Color(0, 102, 204));
        shift.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        shift.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(shift);
        shift.setBounds(260, 370, 79, 23);

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel5.setText("Strand:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(190, 340, 60, 20);

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel6.setText("Gender:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 370, 60, 20);

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel7.setText("Shift:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(190, 370, 50, 20);

        jLabel11.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel11.setText("Address: ");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 460, 70, 16);

        add.setEditable(false);
        add.setBackground(new java.awt.Color(0, 102, 255));
        add.setColumns(20);
        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setRows(5);
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(add);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(90, 460, 250, 89);

        jLabel12.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel12.setText("Contact Number :");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 400, 130, 20);

        number.setBackground(new java.awt.Color(0, 102, 204));
        number.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(number);
        number.setBounds(120, 430, 190, 23);

        jLabel13.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel13.setText("Age:");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(190, 310, 50, 20);

        age.setBackground(new java.awt.Color(0, 102, 204));
        age.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(age);
        age.setBounds(260, 310, 79, 23);

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jButton1.setText("Back>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(280, 560, 79, 23);

        jLabel10.setBackground(new java.awt.Color(0, 204, 204));
        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" STUDENT PROFILE");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 10, 302, 25);
        jPanel2.add(labela);
        labela.setBounds(-20, 90, 420, 400);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
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
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea add;
    public static javax.swing.JTextField age;
    public static javax.swing.JTextField gen;
    public static javax.swing.JTextField grade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labela;
    public static javax.swing.JTextField namee;
    public static javax.swing.JTextField number;
    public static javax.swing.JLabel pic;
    public static javax.swing.JTextField sec;
    public static javax.swing.JTextField shift;
    public static javax.swing.JTextField sn;
    public static javax.swing.JTextField strand;
    // End of variables declaration//GEN-END:variables
}
