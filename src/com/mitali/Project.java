/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitali;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mitali Sahoo
 */
public class Project extends javax.swing.JFrame {

    /**
     * Creates new form Project
     */
    public Project() {
        initComponents();
        getContentPane().setBackground(Color.gray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lab1 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setPreferredSize(new java.awt.Dimension(1350, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab1.setBackground(new java.awt.Color(204, 204, 255));
        lab1.setFont(new java.awt.Font("Castellar", 1, 48)); // NOI18N
        lab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab1.setText("WELCOME TO BANK");
        lab1.setOpaque(true);
        getContentPane().add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 660, 90));

        create.setBackground(new java.awt.Color(102, 102, 102));
        create.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        create.setText("Create an Account");
        create.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 280, 60));

        withdraw.setBackground(new java.awt.Color(102, 102, 102));
        withdraw.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        withdraw.setText("Withdraw");
        withdraw.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        withdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 280, 60));

        deposit.setBackground(new java.awt.Color(102, 102, 102));
        deposit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deposit.setText("Deposit");
        deposit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deposit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 280, 60));

        balance.setBackground(new java.awt.Color(102, 102, 102));
        balance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        balance.setText("Check Balance");
        balance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        balance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 280, 60));

        transfer.setBackground(new java.awt.Color(102, 102, 102));
        transfer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        transfer.setText("Transfer Money");
        transfer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        getContentPane().add(transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 280, 60));

        img.setBackground(java.awt.Color.gray);
        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/withdraw (2).png"))); // NOI18N
        img.setOpaque(true);
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 70, 60));

        img2.setBackground(java.awt.Color.gray);
        img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/deposit1.png"))); // NOI18N
        img2.setOpaque(true);
        getContentPane().add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 70, 60));

        img3.setBackground(java.awt.Color.gray);
        img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/check1.png"))); // NOI18N
        img3.setOpaque(true);
        getContentPane().add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 70, 60));

        img4.setBackground(java.awt.Color.gray);
        img4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transfer1.png"))); // NOI18N
        img4.setOpaque(true);
        getContentPane().add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 70, 60));

        img5.setBackground(java.awt.Color.gray);
        img5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/create.png"))); // NOI18N
        img5.setOpaque(true);
        getContentPane().add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 70, 60));

        img7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Webp.net-resizeimage (2).png"))); // NOI18N
        img7.setOpaque(true);
        getContentPane().add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 300, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_createMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

        this.setVisible(false);
        new Create_account().setVisible(true);
    }//GEN-LAST:event_createActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        this.setVisible(false);
        new Withdraw().setVisible(true);
    }//GEN-LAST:event_withdrawActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        this.setVisible(false);
        new Deposit().setVisible(true);
    }//GEN-LAST:event_depositActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        this.setVisible(false);
        new Check_balance().setVisible(true);
    }//GEN-LAST:event_balanceActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        this.setVisible(false);
        new Transfer().setVisible(true);
    }//GEN-LAST:event_transferActionPerformed

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
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Project().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balance;
    private javax.swing.JButton create;
    private javax.swing.JButton deposit;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel lab1;
    private javax.swing.JButton transfer;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
