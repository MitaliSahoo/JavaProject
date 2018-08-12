/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitali;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mitali Sahoo
 */
public class Create_account extends javax.swing.JFrame {

    /**
     * Creates new form Create_account
     */
    public Create_account() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        fname = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        lname1 = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address1 = new javax.swing.JTextArea();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        accountno = new javax.swing.JLabel();
        accountno1 = new javax.swing.JTextField();
        type1 = new javax.swing.JRadioButton();
        type2 = new javax.swing.JRadioButton();
        result = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 750));
        setPreferredSize(new java.awt.Dimension(1350, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        fname.setText("First Name");
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, 44));

        phone.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        phone.setText("Phone no.");
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 160, 44));

        gender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        gender.setText("Gender");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, 44));

        lname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lname.setText("Last Name");
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 160, 44));

        address.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        address.setText("Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 160, 44));

        type.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        type.setText("Type of Account");
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 190, 44));

        fname1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fname1KeyTyped(evt);
            }
        });
        getContentPane().add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 493, 44));

        lname1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lname1KeyTyped(evt);
            }
        });
        getContentPane().add(lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 493, 44));

        phone1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone1KeyTyped(evt);
            }
        });
        getContentPane().add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 493, 44));

        address1.setColumns(20);
        address1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        address1.setRows(5);
        jScrollPane1.setViewportView(address1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 493, 152));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        male.setText("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, -1));

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        others.setText("Others");
        getContentPane().add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, -1, -1));

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 135, 46));

        clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 135, 46));

        accountno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        accountno.setText("Account No.");
        getContentPane().add(accountno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, 42));

        accountno1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        accountno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountno1KeyTyped(evt);
            }
        });
        getContentPane().add(accountno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 493, 42));

        buttonGroup2.add(type1);
        type1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        type1.setText("Saving account");
        getContentPane().add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        buttonGroup2.add(type2);
        type2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        type2.setText("Current account");
        getContentPane().add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 540, 80));

        img.setBackground(java.awt.Color.gray);
        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back1.png"))); // NOI18N
        img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img.setOpaque(true);
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMouseClicked(evt);
            }
        });
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 90, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void accountno1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountno1KeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_accountno1KeyTyped

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Create_account.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            String fn="", ln="",addr="",gen="", type="";
            int acct;
            String ph;
            fn=fname1.getText();
            ln=lname1.getText();
            addr=address.getText();
            ph=phone1.getText();
            acct=Integer.parseInt(accountno1.getText());
            if(male.isSelected())
                gen="m";
            if(female.isSelected()) 
                gen="f";
            if(others.isSelected())
                gen="o";
            if(type1.isSelected())
                type="s";
            if(type2.isSelected())
                type="c";
            
            int acc=Integer.parseInt(accountno1.getText());
            
            
            PreparedStatement ps;
            
            String s="select * from account where account_no=?";
            ps=con.prepareStatement(s);
            ps.setInt(1, acc);
            
            ResultSet rs1=ps.executeQuery();
            
            int x;
            
            rs1.next();
            x=rs1.getRow();
            
            if(x==0)
            {
                String str="insert into account(account_no,fname,lname,gender,account_type,address,phone_no) values(?,?,?,?,?,?,?)";
                ps=con.prepareStatement(str);

                ps.setInt(1, acct);
                ps.setString(2, fn);
                ps.setString(3, ln);
                ps.setString(4,gen);
                ps.setString(5,type);
                ps.setString(6, addr);
                ps.setString(7, ph);

                int i=ps.executeUpdate();

                if(i>0)
                {
                    result.setText("Congratulations on new ACCOUNT!");
                }
                else
                {
                    result.setText("Couldn't create an account due to some issue.");
                }
            }   
            else
            {
                result.setText("This account number exists!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Create_account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void phone1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone1KeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_phone1KeyTyped

    private void fname1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fname1KeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isAlphabetic(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_fname1KeyTyped

    private void lname1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lname1KeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isAlphabetic(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_lname1KeyTyped

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        accountno1.setText("");
        fname1.setText("");
        lname1.setText("");
        address1.setText("");
        phone1.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_clearActionPerformed

    private void imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseClicked
        this.setVisible(false);
        new Project().setVisible(true);
    }//GEN-LAST:event_imgMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_account().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountno;
    private javax.swing.JTextField accountno1;
    private javax.swing.JLabel address;
    private javax.swing.JTextArea address1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField lname1;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton others;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phone1;
    private javax.swing.JLabel result;
    private javax.swing.JButton submit;
    private javax.swing.JLabel type;
    private javax.swing.JRadioButton type1;
    private javax.swing.JRadioButton type2;
    // End of variables declaration//GEN-END:variables
}
