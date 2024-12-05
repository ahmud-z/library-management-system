/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ahmudz.librarymanagementsystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * ahmudz
 */
public class UpdateBookWindow extends javax.swing.JFrame {

    /**
     * Creates new form UpdateBookWindow
     */
    public UpdateBookWindow() {
        initComponents();
        setJLabelColors(Color.WHITE);
        getContentPane().setBackground(new Color(22, 84, 109));

        DefaultComboBoxModel model = (DefaultComboBoxModel) this.comboSelectBooks.getModel();

        List<Book> books = BookManager.getBooks();

        model.addElement("-- Select Book --");

        for (int i = 0; i < books.size(); i++) {

            model.addElement(books.get(i).id + " - " + books.get(i).name);
        }

    }

    private void setJLabelColors(Color color) {
        for (java.awt.Component c : this.getContentPane().getComponents()) {
            if (c instanceof JLabel) {
                ((JLabel) c).setForeground(color);
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

        comboSelectBooks = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputStock = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        backButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Books");

        comboSelectBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectBooksActionPerformed(evt);
            }
        });
        comboSelectBooks.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboSelectBooksPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Select Book");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Author");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Stock");

        btnSave.setText("Save Changes");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboSelectBooks, 0, 204, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(inputName)
                            .addComponent(jLabel3)
                            .addComponent(inputAuthor)
                            .addComponent(jLabel4)
                            .addComponent(inputStock))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave))
                    .addComponent(backButton2))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSelectBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(backButton2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSelectBooksPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboSelectBooksPropertyChange

    }//GEN-LAST:event_comboSelectBooksPropertyChange

    private void comboSelectBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectBooksActionPerformed

        if (comboSelectBooks.getSelectedItem().toString().equals("-- Select Book --")) {
            return;
        }

        DatabaseConnection con = new DatabaseConnection();

        String id = comboSelectBooks.getSelectedItem().toString().split(" - ")[0];

        ResultSet result = con.executeQuery("select * from books where id = ?", id);

        try {
            result.next();
            inputName.setText(result.getString("name"));
            inputAuthor.setText(result.getString("author"));
            inputStock.setText(result.getString("stock"));

        } catch (SQLException ex) {
            Logger.getLogger(UpdateBookWindow.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_comboSelectBooksActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed

        MainWindow mainWind = new MainWindow();

        this.setVisible(false);
        mainWind.setVisible(true);

    }//GEN-LAST:event_backButton2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = inputName.getText();
        String author = inputAuthor.getText();
        String stock = inputStock.getText();
        String id = comboSelectBooks.getSelectedItem().toString().split(" - ")[0];

        if (name.isEmpty() || author.isEmpty() || stock.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            return;
        }

        try {
            BookManager.updateBook(id, name, author, stock);
            JOptionPane.showMessageDialog(this, "Updated Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Can't Updated");
            System.out.println("Error: " + e);
        }


    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBookWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBookWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton2;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboSelectBooks;
    private javax.swing.JTextField inputAuthor;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
