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
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class Teachers extends javax.swing.JPanel {

    private static final Logger logger = Logger.getLogger(Teachers.class.getName());

    public Teachers() {
        initComponents();
        setLoggerFile();
        loadTeachers();
        loadRanks();
        loadSubjects();

        jButton3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Teacher"));

        jLabel1.setText("Name");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Address");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel3.setText("NIC");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel4.setText("Mobile");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save Teacher");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update Teacher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Rank");

        jLabel9.setText("Subject");

        jLabel10.setText("Email");

        jLabel11.setText("District");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Colombo", "Gampaha", "Kalutara", "Kandy", "Matale", "Nuwara Eliya", "Galle", "Matara", "Hambantota", "Jaffna", "Kilinochchi", "Mannar", "Vavuniya", "Mullaitivu", "Trincomalee", "Batticaloa", "Ampara", "Kurunegala", "Puttalam", "Anuradhapura", "Polonnaruwa", "Badulla", "Monaragala", "Ratnapura", "Kegalle" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                .addComponent(jTextField5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField4)
                                        .addComponent(jComboBox3, 0, 432, Short.MAX_VALUE)))))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Rank ID", "Rank", "NIC", "Sub. ID", "Subject", "Address", "Mobile", "Email", "District"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(70);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("* Select Teacher to Update");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Teacher"));

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
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        final String rankId = jComboBox1.getSelectedItem().toString().split("-")[0];
        final String nic = jTextField2.getText().trim();
        final String subjectId = jComboBox2.getSelectedItem().toString().split("-")[0];
        final String address = jTextField3.getText().trim();
        final String mobile = jTextField4.getText().trim();
        final String email = jTextField5.getText().trim();
        final String district = jComboBox3.getSelectedItem().toString();

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
                            "SELECT * FROM `teacher` WHERE `name` = ? AND `nic` = ?")) {

                        checkStmt.setString(1, name);
                        checkStmt.setString(2, nic);

                        try (ResultSet rs = checkStmt.executeQuery()) {
                            if (rs.next()) {
                                return false; // Teacher already exists
                            }
                        }
                    }

                    // Insert new guardian with a parameterized query
                    try (PreparedStatement insertStmt = conn.prepareStatement(
                            "INSERT INTO `teacher` (`name`, `nic`, `address`, `phone`, `email`, `district`, `rank_id`, `subject_id`) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

                        insertStmt.setString(1, name);
                        insertStmt.setString(2, nic);
                        insertStmt.setString(3, address);
                        insertStmt.setString(4, mobile);
                        insertStmt.setString(5, email);
                        insertStmt.setString(6, district);
                        insertStmt.setString(7, rankId);
                        insertStmt.setString(8, subjectId);

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
                    logger.log(Level.SEVERE, "Teacher save exception: ", e);
                    throw e;
                }
            }

            @Override
            protected void done() {
                try {
                    boolean success = get();
                    if (success) {
                        resetFields();
                        loadTeachers();
                        jTextField1.requestFocus();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS,
                                Notifications.Location.TOP_CENTER, "Teacher Saved Successfully!");
                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING,
                                Notifications.Location.TOP_CENTER, "Teacher Already Exists");
                        jTextField1.requestFocus();
                    }
                } catch (Exception e) {
                    Notifications.getInstance().show(Notifications.Type.ERROR,
                            Notifications.Location.TOP_CENTER, "Error saving Teacher: " + e.getMessage());
                    logger.log(Level.SEVERE, "Error in Teacher save worker: ", e);
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
                jComboBox1.setSelectedItem(convertToString(jTable1.getValueAt(selectedRowIndex, 2)) + " - " + convertToString(jTable1.getValueAt(selectedRowIndex, 3)));
                jTextField2.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 4)));
                jComboBox2.setSelectedItem(convertToString(jTable1.getValueAt(selectedRowIndex, 5)) + " - " + convertToString(jTable1.getValueAt(selectedRowIndex, 6)));
                jTextField3.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 7)));
                jTextField4.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 8)));
                jTextField5.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 9)));
                jComboBox3.setSelectedItem(convertToString(jTable1.getValueAt(selectedRowIndex, 10)));

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
            loadTeachers();
        } else {
            loadTeachers(text);
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

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != '.' && c != '/' && c != ' ' && c != ',') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != 'V' && c != 'v' && c != 'X' && c != 'x') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

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
                    Notifications.Location.TOP_CENTER, "Please select a teacher to update");
            jButton3.setEnabled(true);
            return;
        }

        // Get the ID from the selected row (assuming ID is in the first column, index 0)
        final int teacherId = Integer.parseInt(jTable1.getValueAt(selectedRowIndex, 0).toString());

        // Get values from text fields
        final String name = jTextField1.getText().trim();
        final String rankId = jComboBox1.getSelectedItem().toString().split("-")[0];
        final String nic = jTextField2.getText().trim();
        final String subjectId = jComboBox2.getSelectedItem().toString().split("-")[0];
        final String address = jTextField3.getText().trim();
        final String mobile = jTextField4.getText().trim();
        final String email = jTextField5.getText().trim();
        final String district = jComboBox3.getSelectedItem().toString();

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
                            "SELECT * FROM `teacher` WHERE `name` = ? AND `nic` = ? AND `id` != ?")) {

                        checkStmt.setString(1, name);
                        checkStmt.setString(2, nic);
                        checkStmt.setInt(3, teacherId);

                        try (ResultSet rs = checkStmt.executeQuery()) {
                            if (rs.next()) {
                                jButton3.setEnabled(true);
                                return false; // Another teacher with same details exists
                            }
                        }
                    }

                    // Update the guardian with a parameterized query
                    try (PreparedStatement updateStmt = conn.prepareStatement(
                            "UPDATE `teacher` SET `name` = ?, `address` = ?, `nic` = ?, "
                            + "`phone` = ?, `email` = ?, `district` = ?, `rank_id` = ?, `subject_id` = ? WHERE `id` = ?")) {

                        updateStmt.setString(1, name);
                        updateStmt.setString(2, address);
                        updateStmt.setString(3, nic);
                        updateStmt.setString(4, mobile);
                        updateStmt.setString(5, email);
                        updateStmt.setString(6, district);
                        updateStmt.setString(7, rankId);
                        updateStmt.setString(8, subjectId);
                        updateStmt.setInt(9, teacherId);

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
                    logger.log(Level.SEVERE, "Teacher update exception: ", e);
                    throw e;
                }
            }

            @Override
            protected void done() {
                try {
                    boolean success = get();
                    if (success) {
                        // Reload data after a successful update
                        loadTeachers(); // Assuming you have this method to refresh the table
                        resetFields(); // Assuming you have this method to clear fields
                        Notifications.getInstance().show(Notifications.Type.SUCCESS,
                                Notifications.Location.TOP_CENTER, "Teacher Updated Successfully!");
                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING,
                                Notifications.Location.TOP_CENTER, "Another Teacher with the same details exists");
                    }
                } catch (Exception e) {
                    Notifications.getInstance().show(Notifications.Type.ERROR,
                            Notifications.Location.TOP_CENTER, "Error updating Teacher: " + e.getMessage());
                    logger.log(Level.SEVERE, "Error in Teacher update worker: ", e);
                }
            }
        };

        worker.execute(); // Start the background task

    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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

    private void loadTeachers() {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `teacher` INNER JOIN `rank` ON `rank`.`id` = `teacher`.`rank_id` INNER JOIN `subject` ON `subject`.`id` = `teacher`.`subject_id` ORDER BY `teacher`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("teacher.id"));
                v.add(rs.getString("teacher.name"));
                v.add(rs.getString("rank.id"));
                v.add(rs.getString("rank.name"));
                v.add(rs.getString("teacher.nic"));
                v.add(rs.getString("subject.id"));
                v.add(rs.getString("subject.name"));
                v.add(rs.getString("teacher.address"));
                v.add(rs.getString("phone"));
                v.add(rs.getString("email"));
                v.add(rs.getString("district"));
                dtm.addRow(v);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Teacher loading Exception: ", e);
            e.printStackTrace();
        }
    }

    private void loadTeachers(String text) {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `teacher` INNER JOIN `rank` ON `rank`.`id` = `teacher`.`rank_id` INNER JOIN `subject` ON `subject`.`id` = `teacher`.`subject_id` WHERE `teacher`.`name` LIKE '%" + text + "%' OR `teacher`.`nic` LIKE '%" + text + "%' ORDER BY `guardian`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("teacher.id"));
                v.add(rs.getString("teacher.name"));
                v.add(rs.getString("rank.id"));
                v.add(rs.getString("rank.name"));
                v.add(rs.getString("teacher.nic"));
                v.add(rs.getString("subject.id"));
                v.add(rs.getString("subject.name"));
                v.add(rs.getString("teacher.address"));
                v.add(rs.getString("phone"));
                v.add(rs.getString("email"));
                v.add(rs.getString("district"));
                dtm.addRow(v);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Guardian loading Exception (search by name or nic) : ", e);
            e.printStackTrace();
        }
    }

    private void loadRanks() {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `rank`");

            Vector v = new Vector();
            v.add("-SELECT-");
            while (rs.next()) {
                v.add(rs.getString("id") + " - " + rs.getString("name"));
            }

            jComboBox1.setModel(new DefaultComboBoxModel(v));

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Rank loading exception : ", e);
            e.printStackTrace();
        }
    }

    private void loadSubjects() {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `subject`");

            Vector v = new Vector();
            v.add("-SELECT-");
            while (rs.next()) {
                v.add(rs.getString("id") + " - " + rs.getString("name"));
            }

            jComboBox2.setModel(new DefaultComboBoxModel(v));

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Subject loading exception : ", e);
            e.printStackTrace();
        }
    }

    private boolean validateInputs() {
        if (jTextField1.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Teacher Name");
            jTextField1.requestFocus();
            return false;
        }

        if (jComboBox1.getSelectedItem().equals("-SELECT-")) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Select a Rank");
            jComboBox1.requestFocus();
            return false;
        }

        if (jTextField2.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter NIC");
            jTextField2.requestFocus();
            return false;
        } else {
            String nic = jTextField2.getText().trim();
            String regexPattern = "^(([5,6,7,8,9]{1})([0-9]{1})([0,1,2,3,5,6,7,8]{1})([0-9]{6})([v|V|x|X]))|(([1,2]{1})([0,9]{1})([0-9]{2})([0,1,2,3,5,6,7,8]{1})([0-9]{7}))$";

            if (!nic.matches(regexPattern)) {
                Notifications.getInstance().show(Notifications.Type.WARNING,
                        Notifications.Location.TOP_CENTER, "Invalid NIC format");
                jTextField2.requestFocus();
                return false;
            }
        }

        if (jComboBox2.getSelectedItem().equals("-SELECT-")) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Select a Subject");
            jComboBox2.requestFocus();
            return false;
        }

        if (jTextField3.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Address");
            jTextField3.requestFocus();
            return false;
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

        if (jTextField5.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Email");
            jTextField5.requestFocus();
            return false;
        } else {
            String email = jTextField5.getText().trim();
            String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

            if (!email.matches(emailPattern)) {
                Notifications.getInstance().show(Notifications.Type.WARNING,
                        Notifications.Location.TOP_CENTER, "Invalid Email format");
                jTextField5.requestFocus();
                return false;
            }
        }

        if (jComboBox3.getSelectedItem().equals("-SELECT-")) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Select a District");
            jComboBox3.requestFocus();
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
        jTextField3.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jTable1.clearSelection();

        jButton3.setEnabled(false);
        jButton2.setEnabled(true);
        loadTeachers();
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
