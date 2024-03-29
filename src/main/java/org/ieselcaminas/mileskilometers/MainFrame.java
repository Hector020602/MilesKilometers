/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.ieselcaminas.mileskilometers;

import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    
    public static final double KMS_PER_MILE = 1.60934;
    

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMiles = new javax.swing.JLabel();
        labelKms = new javax.swing.JLabel();
        textFieldMilles = new javax.swing.JTextField();
        textFieldKms = new javax.swing.JTextField();
        buttonConvertKms = new javax.swing.JButton();
        buttonConvertMiles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelMiles.setText("Milles");

        labelKms.setText("Kilometers");

        buttonConvertKms.setText("Convert");
        buttonConvertKms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertKmsActionPerformed(evt);
            }
        });

        buttonConvertMiles.setText("Convert");
        buttonConvertMiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertMilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(labelMiles))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(labelKms)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldMilles, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(textFieldKms))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonConvertKms)
                    .addComponent(buttonConvertMiles))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMiles)
                    .addComponent(textFieldMilles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConvertKms))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKms)
                    .addComponent(textFieldKms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConvertMiles))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConvertKmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertKmsActionPerformed
        //Convert miles to kilometers.
        String text = textFieldMilles.getText();
        try {
            double miles = Double.parseDouble(text);
            double kms = miles * KMS_PER_MILE;
            textFieldKms.setText("" + kms);
        } catch (NumberFormatException ex) {
            showMessageOnlyNumbers();
        }
        
        
    }//GEN-LAST:event_buttonConvertKmsActionPerformed

    private void buttonConvertMilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertMilesActionPerformed
        // Convert kilometers to miles.
        String text = textFieldKms.getText();
        try {
            double kms = Double.parseDouble(text);
            double miles = kms/KMS_PER_MILE;
            textFieldMilles.setText("" + miles);
        } catch (NumberFormatException ex) {
            showMessageOnlyNumbers();
        }
    }//GEN-LAST:event_buttonConvertMilesActionPerformed
    
    private void showMessageOnlyNumbers() {
        JOptionPane.showMessageDialog(null, "Only numbers");

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConvertKms;
    private javax.swing.JButton buttonConvertMiles;
    private javax.swing.JLabel labelKms;
    private javax.swing.JLabel labelMiles;
    private javax.swing.JTextField textFieldKms;
    private javax.swing.JTextField textFieldMilles;
    // End of variables declaration//GEN-END:variables
}
