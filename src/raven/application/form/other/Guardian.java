package raven.application.form.other;

import com.sdm.model.MySQL;
import com.sdm.model.SriLankanPhoneValidator;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class Guardian extends javax.swing.JPanel {

    private static final Logger logger = Logger.getLogger(Guardian.class.getName());

    public Guardian() {
        initComponents();
        setLoggerFile();
        loadGuardians();

        jButton3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Guardian"));

        jLabel1.setText("Name");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Address");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel3.setText("NIC");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel4.setText("Mobile 1");

        jLabel5.setText("Mobile 2");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save Guardian");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update Guardian");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "NIC", "Mobile 1", "Mobile 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("* Select Guardian to Update");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Guardian"));

        jLabel7.setText("Search By Name or NIC");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Disable the button to prevent multiple submits
        jButton2.setEnabled(false);

        // Validate input fields
        if (!validateInputs()) {
            jButton2.setEnabled(true);
            return;
        }

        // Get values from text fields
        final String name = jTextField1.getText().trim();
        final String address = jTextField2.getText().trim();
        final String nic = jTextField3.getText().trim();
        final String mobile1 = jTextField4.getText().trim();
        final String mobile2 = jTextField5.getText().trim();

        // Use SwingWorker to perform database operations in background
        SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                Connection conn = null;
                try {
                    conn = MySQL.getConnection();
                    conn.setAutoCommit(false); // Disable auto-commit for transaction control

                    if (conn == null || conn.isClosed()) {
                        throw new SQLException("Database connection is closed or unavailable.");
                    }

                    // Check if guardian already exists
                    try (PreparedStatement checkStmt = conn.prepareStatement(
                            "SELECT * FROM `guardian` WHERE `name` = ? AND `nic` = ?")) {

                        checkStmt.setString(1, name);
                        checkStmt.setString(2, nic);

                        try (ResultSet rs = checkStmt.executeQuery()) {
                            if (rs.next()) {
                                return false; // Guardian already exists
                            }
                        }
                    }

                    // Insert new guardian with a parameterized query
                    try (PreparedStatement insertStmt = conn.prepareStatement(
                            "INSERT INTO `guardian` (`name`, `address`, `nic`, `mobile1`, `mobile2`) "
                            + "VALUES (?, ?, ?, ?, ?)")) {

                        insertStmt.setString(1, name);
                        insertStmt.setString(2, address);
                        insertStmt.setString(3, nic);
                        insertStmt.setString(4, mobile1);

                        if (mobile2.isEmpty()) {
                            insertStmt.setNull(5, java.sql.Types.VARCHAR);
                        } else {
                            insertStmt.setString(5, mobile2);
                        }

                        int rowsAffected = insertStmt.executeUpdate();
                        if (rowsAffected > 0) {
                            conn.commit(); // Commit transaction after successful insert
                            return true;
                        } else {
                            conn.rollback(); // Rollback if no rows were inserted
                            return false;
                        }
                    }
                } catch (Exception e) {
                    if (conn != null) {
                        conn.rollback(); // Rollback transaction on error
                    }
                    logger.log(Level.SEVERE, "Guardian save exception: ", e);
                    throw e;
                }
            }

            @Override
            protected void done() {
                try {
                    boolean success = get();
                    if (success) {
                        resetFields();
                        loadGuardians();
                        jTextField1.grabFocus();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS,
                                Notifications.Location.TOP_CENTER, "Guardian Saved Successfully!");
                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING,
                                Notifications.Location.TOP_CENTER, "Guardian Already Exists");
                    }
                } catch (Exception e) {
                    Notifications.getInstance().show(Notifications.Type.ERROR,
                            Notifications.Location.TOP_CENTER, "Error saving guardian: " + e.getMessage());
                    logger.log(Level.SEVERE, "Error in guardian save worker: ", e);
                } finally {
                    jButton2.setEnabled(true); // Re-enable the button
                }
            }
        };

        worker.execute(); // Start the background task
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 1) {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex != -1) {
                // Row is selected, enable Update button and disable Add button
                jButton2.setEnabled(false);
                jButton3.setEnabled(true);

                // Get the selected row's data and set it into the textfields
                jTextField1.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 1)));
                jTextField2.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 2)));
                jTextField3.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 3)));
                jTextField4.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 4)));

                // Handle mobile2 field which might be null
                Object mobile2Value = jTable1.getValueAt(selectedRowIndex, 5);
                jTextField5.setText(convertToString(mobile2Value));
            } else {
                // No row selected, enable Add button and disable Update button
                jButton2.setEnabled(true);
                jButton3.setEnabled(false);
                // Clear the textfields
                resetFields();
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        String text = jTextField6.getText();

        if (text.isEmpty()) {
            loadGuardians();
        } else {
            loadGuardians(text);
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != '.' && c != '@' && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != '.' && c != '/' && c != ' ' && c != ',') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != 'V' && c != 'v' && c != 'X' && c != 'x') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Disable the button to prevent multiple submits
        jButton3.setEnabled(false);
        
                // Validate input fields
        if (!validateInputs()) {
            jButton3.setEnabled(true);
            return;
        }

        // Get the selected row index
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex == -1) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please select a guardian to update");
            jButton3.setEnabled(true);
            return;
        }

        // Get the ID from the selected row (assuming ID is in the first column, index 0)
        final int guardianId = Integer.parseInt(jTable1.getValueAt(selectedRowIndex, 0).toString());

        // Get values from text fields
        final String name = jTextField1.getText().trim();
        final String address = jTextField2.getText().trim();
        final String nic = jTextField3.getText().trim();
        final String mobile1 = jTextField4.getText().trim();
        final String mobile2 = jTextField5.getText().trim();

        // Use SwingWorker to perform database operations in the background
        SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                Connection conn = null;
                try {
                    conn = MySQL.getConnection();
                    conn.setAutoCommit(false); // Ensure manual commit if needed

                    if (conn == null || conn.isClosed()) {
                        throw new SQLException("Database connection is closed or unavailable.");
                    }

                    // Check if another guardian exists with the same name and NIC (but different ID)
                    try (PreparedStatement checkStmt = conn.prepareStatement(
                            "SELECT * FROM `guardian` WHERE `name` = ? AND `nic` = ? AND `id` != ?")) {

                        checkStmt.setString(1, name);
                        checkStmt.setString(2, nic);
                        checkStmt.setInt(3, guardianId);

                        try (ResultSet rs = checkStmt.executeQuery()) {
                            if (rs.next()) {
                                jButton3.setEnabled(true);
                                return false; // Another guardian with same details exists
                            }
                        }
                    }

                    // Update the guardian with a parameterized query
                    try (PreparedStatement updateStmt = conn.prepareStatement(
                            "UPDATE `guardian` SET `name` = ?, `address` = ?, `nic` = ?, "
                            + "`mobile1` = ?, `mobile2` = ? WHERE `id` = ?")) {

                        updateStmt.setString(1, name);
                        updateStmt.setString(2, address);
                        updateStmt.setString(3, nic);
                        updateStmt.setString(4, mobile1);

                        if (mobile2.isEmpty()) {
                            updateStmt.setNull(5, java.sql.Types.VARCHAR);
                        } else {
                            updateStmt.setString(5, mobile2);
                        }

                        updateStmt.setInt(6, guardianId);

                        int rowsAffected = updateStmt.executeUpdate();

                        if (rowsAffected > 0) {
                            conn.commit(); // Commit transaction after successful update
                            return true;
                        } else {
                            conn.rollback(); // Rollback if nothing was updated
                            return false;
                        }
                    }
                } catch (Exception e) {
                    if (conn != null) {
                        conn.rollback(); // Rollback in case of an error
                    }
                    logger.log(Level.SEVERE, "Guardian update exception: ", e);
                    throw e;
                }
            }

            @Override
            protected void done() {
                try {
                    boolean success = get();
                    if (success) {
                        // Reload data after a successful update
                        loadGuardians(); // Assuming you have this method to refresh the table
                        resetFields(); // Assuming you have this method to clear fields
                        Notifications.getInstance().show(Notifications.Type.SUCCESS,
                                Notifications.Location.TOP_CENTER, "Guardian Updated Successfully!");
                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING,
                                Notifications.Location.TOP_CENTER, "Another Guardian with the same details exists");
                    }
                } catch (Exception e) {
                    Notifications.getInstance().show(Notifications.Type.ERROR,
                            Notifications.Location.TOP_CENTER, "Error updating guardian: " + e.getMessage());
                    logger.log(Level.SEVERE, "Error in guardian update worker: ", e);
                }
            }
        };

        worker.execute(); // Start the background task

    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void loadGuardians() {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `guardian` ORDER BY `guardian`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("mobile1"));
                v.add(rs.getString("mobile2"));
                dtm.addRow(v);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Guardian loading Exception: ", e);
            e.printStackTrace();
        }
    }

    private void loadGuardians(String text) {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `guardian` WHERE `name` LIKE '%" + text + "%' OR `nic` LIKE '%" + text + "%' ORDER BY `guardian`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("mobile1"));
                v.add(rs.getString("mobile2"));
                dtm.addRow(v);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Guardian loading Exception (search by name or nic) : ", e);
            e.printStackTrace();
        }
    }

    private boolean validateInputs() {
        if (jTextField1.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Guardian Name");
            jTextField1.requestFocus();
            return false;
        }

        if (jTextField2.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Address");
            jTextField2.requestFocus();
            return false;
        }

        if (jTextField3.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter NIC");
            jTextField3.requestFocus();
            return false;
        } else {
            String nic = jTextField3.getText().trim();
            String regexPattern = "^(([5,6,7,8,9]{1})([0-9]{1})([0,1,2,3,5,6,7,8]{1})([0-9]{6})([v|V|x|X]))|(([1,2]{1})([0,9]{1})([0-9]{2})([0,1,2,3,5,6,7,8]{1})([0-9]{7}))$";

            if (!nic.matches(regexPattern)) {
                Notifications.getInstance().show(Notifications.Type.WARNING,
                        Notifications.Location.TOP_CENTER, "Invalid NIC format");
                jTextField3.requestFocus();
                return false;
            }
        }

        if (jTextField4.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Mobile Number");
            jTextField4.requestFocus();
            return false;
        } else {
            // Inside your validateInputs method:
            if (!SriLankanPhoneValidator.isValidPhoneNumber(jTextField4.getText().trim())) {
                Notifications.getInstance().show(Notifications.Type.WARNING,
                        Notifications.Location.TOP_CENTER, "Please Enter Valid Mobile Number");
                jTextField4.requestFocus();
                return false;
            }
        }

        // For the optional mobile2 field:
        if (!jTextField4.getText().trim().isEmpty() && !SriLankanPhoneValidator.isValidPhoneNumber(jTextField4.getText().trim())) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Valid Second Mobile Number or Leave Empty");
            jTextField5.requestFocus();
            return false;
        }

        return true;
    }

    private String convertToString(Object value) {
        if (value == null) {
            return "";
        }
        return value.toString();
    }

    private void resetFields() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTable1.clearSelection();

        jButton3.setEnabled(false);
        jButton2.setEnabled(true);
        loadGuardians();
    }

    private void setLoggerFile() {
        try {
            // Use the user's home directory as the base path for logfiles
            String userHome = System.getProperty("user.home");
            File logFolder = new File(userHome, "WeerasinghaPiriwena/logfiles");

            // Check if the "logfiles" folder exists, and create it if not
            if (!logFolder.exists()) {
                logFolder.mkdirs();  // mkdirs() will create parent directories if they don't exist
            }

            // Set up a FileHandler to write log messages to a file named "logfiles/invoice_log.txt"
            FileHandler fileHandler = new FileHandler(logFolder.getPath() + File.separator + "Guardian_log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter() {
                private final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";

                @Override
                public synchronized String format(java.util.logging.LogRecord lr) {
                    Object[] params = lr.getParameters();
                    return String.format(format, new java.util.Date(lr.getMillis()), lr.getLevel(),
                            MessageFormat.format(lr.getMessage(), params));
                }
            });

            logger.addHandler(fileHandler);
        } catch (IOException | SecurityException e) {
            // If there is an issue setting up the FileHandler, log the exception to the console
            e.printStackTrace();
        }
    }

}
