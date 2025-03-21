package raven.application.form.other;

import com.sdm.model.ImageUploader;
import com.sdm.model.MySQL;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class Student extends javax.swing.JPanel {

    private final ImageUploader imageUploader;
    private static final Logger logger = Logger.getLogger(Student.class.getName());
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String imageName;

    public Student() {
        initComponents();

        imageUploader = new ImageUploader(jLabel8);

        jButton2.setEnabled(false);
        loadGuardian();
        loadStudents();
        
        setLoggerFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Student"));

        jLabel1.setText("Admission No.");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Current Grade");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Primary", "1", "2", "3", "4", "5", "Pass" }));

        jLabel3.setText("Name With Initials");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel4.setText("Full Name");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel5.setText("Birth Date");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel6.setText("Gender");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Male", "Female" }));

        jLabel7.setText("Guardian");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/png/Chakra1.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Save Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Brows");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, 0, 145, Short.MAX_VALUE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ad. No.", "Grade", "Name With Initials", "Full Name", "Birth Date", "Gender", "ID", "Guardian", "NIC", "Mobile 1", "Mobile 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(5);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("* Select Row for Update");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("* Double Click Row for Open as PDF");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Guardian"));

        jLabel11.setText("Search By Name or Admission Number");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        imageUploader.openAndSetImage();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        String text = jTextField4.getText();

        if (text.isEmpty()) {
            loadStudents();
        } else {
            loadStudents(text);
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != '.' && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Disable the button to prevent multiple submits
        jButton1.setEnabled(false);

        // Validate input fields
        if (!validateInputs()) {
            jButton1.setEnabled(true);
            return;
        }

        // Get values from text fields
        final String admissionNo = jTextField1.getText().trim();
        final String grade = jComboBox1.getSelectedItem().toString();
        final String nameWithInitials = jTextField2.getText().trim();
        final String fullName = jTextField3.getText().trim();

        final Date date = jDateChooser1.getDate();
        final String birthDate = sdf.format(date);

        final String gender = jComboBox2.getSelectedItem().toString();
        final String guardian = jComboBox3.getSelectedItem().toString();
        final String guardianId = guardian.split(" - ")[0];

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
                            "SELECT * FROM `student` WHERE `admission_no` = ?")) {

                        checkStmt.setString(1, admissionNo);

                        try (ResultSet rs = checkStmt.executeQuery()) {
                            if (rs.next()) {
                                return false; // Student already exists
                            }
                        }
                    }

                    // Insert new guardian with a parameterized query
                    try (PreparedStatement insertStmt = conn.prepareStatement(
                            "INSERT INTO `student` (`admission_no`, `current_grade`, `name_with_initial`, `full_name`, `birth_day`, `gender`, `image`, `guardian_id`) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

                        insertStmt.setString(1, admissionNo);
                        insertStmt.setString(2, grade);
                        insertStmt.setString(3, nameWithInitials);
                        insertStmt.setString(4, fullName);
                        insertStmt.setString(5, birthDate);
                        insertStmt.setString(6, gender);

                        // Save image and get its filename
                        String imageFilename = imageUploader.saveImageAndGetFilename();
                        insertStmt.setString(7, imageFilename);
                        insertStmt.setString(8, guardianId);

                        int rowsAffected = insertStmt.executeUpdate();
                        if (rowsAffected > 0) {
                            conn.commit(); // Commit transaction after successful insert
                            return true;
                        } else {
                            conn.rollback(); // Rollback if no rows were inserted
                            return false;
                        }
                    }
                } catch (SQLException e) {
                    if (conn != null) {
                        conn.rollback(); // Rollback transaction on error
                    }
                    logger.log(Level.SEVERE, "Student save exception: ", e);
                    throw e;
                }
            }

            @Override
            protected void done() {
                try {
                    boolean success = get();
                    if (success) {
                        resetFields();
                        loadStudents();
                        jTextField1.grabFocus();
                        Notifications.getInstance().show(Notifications.Type.SUCCESS,
                                Notifications.Location.TOP_CENTER, "Student Saved Successfully!");
                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING,
                                Notifications.Location.TOP_CENTER, "Student Already Exists");
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Notifications.getInstance().show(Notifications.Type.ERROR,
                            Notifications.Location.TOP_CENTER, "Error saving Student: " + e.getMessage());
                    logger.log(Level.SEVERE, "Error in Student save worker: ", e);
                } finally {
                    jButton1.setEnabled(true); // Re-enable the button
                }
            }
        };

        worker.execute(); // Start the background task

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 1) {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex != -1) {
                // Row is selected, enable Update button and disable Add button
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);

                // Get the selected row's data and set it into the textfields
                jTextField1.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 1)));
                jComboBox1.setSelectedItem(convertToString(jTable1.getValueAt(selectedRowIndex, 2)));
                jTextField2.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 3)));
                jTextField3.setText(convertToString(jTable1.getValueAt(selectedRowIndex, 4)));

                try {
                    String dateString = convertToString(jTable1.getValueAt(selectedRowIndex, 5));
                    Date date = sdf.parse(dateString); // Convert String to Date
                    jDateChooser1.setDate(date); // Set the date in JDateChooser

                    ImageIcon image;
                    ResultSet rs = MySQL.search("SELECT `image` FROM `student` WHERE `id` = '" + jTable1.getValueAt(selectedRowIndex, 0) + "'");

                    if (rs.next()) {
                        imageName = rs.getString("image");
                        File imageFile = new File("C:/WeerasinghePiriwena/StudentImages/" + imageName);

                        if (imageFile.exists()) {
                            image = new ImageIcon(imageFile.getAbsolutePath());
                        } else {
                            image = new ImageIcon(getClass().getResource("/raven/icon/png/Chakra1.png")); // Default image
                        }

                        // Resize the image while maintaining aspect ratio
                        Image img = image.getImage();
                        int newHeight = 180;
                        int newWidth = (int) (((double) newHeight / img.getHeight(null)) * img.getWidth(null)); // Maintain aspect ratio

                        Image resizedImage = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
                        jLabel8.setIcon(new ImageIcon(resizedImage));
                    }
                } catch (ParseException e) {
                    logger.log(Level.SEVERE, "BirthDate Parse Exception : ", e);
                    e.printStackTrace();
                } catch (Exception ex) {
                    logger.log(Level.SEVERE, "Image getting Exception : ", ex);
                }

                jComboBox2.setSelectedItem(convertToString(jTable1.getValueAt(selectedRowIndex, 6)));
                jComboBox3.setSelectedItem(convertToString(jTable1.getValueAt(selectedRowIndex, 7) + " - " + jTable1.getValueAt(selectedRowIndex, 8)));

            } else {
                // No row selected, enable Add button and disable Update button
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
                // Clear the textfields
                resetFields();
            }
        } else if (evt.getClickCount() == 2) {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex != -1) {

                String id = (String) jTable1.getValueAt(selectedRowIndex, 0);
                generateReport(id);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setEnabled(false);

        // Validate input fields
        if (!validateInputs()) {
            jButton2.setEnabled(true);
            return;
        }

        // Get the selected row index
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex == -1) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please select a student to update");
            jButton2.setEnabled(true);
            return;
        }

        // Get the ID from the selected row (assuming ID is in the first column, index 0)
        final int studentID = Integer.parseInt(jTable1.getValueAt(selectedRowIndex, 0).toString());

        // Get values from text fields
        final String admissionNo = jTextField1.getText().trim();
        final String grade = jComboBox1.getSelectedItem().toString();
        final String nameWithInitials = jTextField2.getText().trim();
        final String fullName = jTextField3.getText().trim();

        final Date date = jDateChooser1.getDate();
        final String birthDate = sdf.format(date);

        final String gender = jComboBox2.getSelectedItem().toString();
        final String guardian = jComboBox3.getSelectedItem().toString();
        final String guardianId = guardian.split(" - ")[0];

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
                            "SELECT * FROM `student` WHERE `admission_no` = ? AND `id` != ?")) {

                        checkStmt.setString(1, admissionNo);
                        checkStmt.setInt(2, studentID);

                        try (ResultSet rs = checkStmt.executeQuery()) {
                            if (rs.next()) {
                                jButton2.setEnabled(true);
                                return false; // Another guardian with same details exists
                            }
                        }
                    }

                    // Update the guardian with a parameterized query
                    try (PreparedStatement updateStmt = conn.prepareStatement(
                            "UPDATE `student` SET `admission_no` = ?, `current_grade` = ?, `name_with_initial` = ?, "
                            + "`full_name` = ?, `birth_day` = ?, `gender` = ?, `image` = ?, `guardian_id` = ? WHERE `id` = ?")) {

                        updateStmt.setString(1, admissionNo);
                        updateStmt.setString(2, grade);
                        updateStmt.setString(3, nameWithInitials);
                        updateStmt.setString(4, fullName);

                        updateStmt.setString(5, birthDate);
                        updateStmt.setString(6, gender);

                        String newImageFilename = imageUploader.saveImageAndGetFilename(imageName);
                        updateStmt.setString(7, newImageFilename);

                        updateStmt.setString(8, guardianId);
                        updateStmt.setInt(9, studentID);

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
                    logger.log(Level.SEVERE, "Student update exception: ", e);
                    throw e;
                }
            }

            @Override
            protected void done() {
                try {
                    boolean success = get();
                    if (success) {
                        // Reload data after a successful update
                        loadStudents(); // Assuming you have this method to refresh the table
                        resetFields(); // Assuming you have this method to clear fields
                        Notifications.getInstance().show(Notifications.Type.SUCCESS,
                                Notifications.Location.TOP_CENTER, "Student Updated Successfully!");
                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING,
                                Notifications.Location.TOP_CENTER, "Another Student with the same details exists");
                    }
                } catch (Exception e) {
                    Notifications.getInstance().show(Notifications.Type.ERROR,
                            Notifications.Location.TOP_CENTER, "Error updating student: " + e.getMessage());
                    logger.log(Level.SEVERE, "Error in student update worker: ", e);
                }
            }
        };

        worker.execute(); // Start the background task
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != ' ' && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    // End of variables declaration//GEN-END:variables

    private void generateReport(String id) {
        ResultSet rs = null;
        Connection dataSource = null;
        try {
            InputStream filePath = getClass().getResourceAsStream("/com/sdm/reports/Weerasingha_Piriwena.jrxml");

            JasperReport jr = JasperCompileManager.compileReport(filePath);

            rs = MySQL.search("SELECT * FROM `student` WHERE `id` = '" + id + "' ");

            // ✅ Check if student data exists
            if (!rs.next()) {
                logger.log(Level.WARNING, "No student found with ID: {0}", id);
                Notifications.getInstance().show(Notifications.Type.WARNING,
                        Notifications.Location.TOP_CENTER, "No student found with ID: " + id);
                return;
            }

            Date date = new Date();

            String image = rs.getString("image");
            String imagePath = "C:/WeerasinghePiriwena/StudentImages/" + image;

            // ✅ Fetch total student count safely
            ResultSet rs1 = MySQL.search("SELECT COUNT(*) AS student_count FROM `student`");
            int totalStudents = 0;
            if (rs1.next()) {
                totalStudents = rs1.getInt("student_count");
            }

            // ✅ Fetch male student count safely
            ResultSet rs2 = MySQL.search("SELECT COUNT(*) AS student_count FROM student WHERE `gender` = 'Male'");
            int maleStudents = 0;
            if (rs2.next()) {
                maleStudents = rs2.getInt("student_count");
            }

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("id", id);
            parameters.put("image", imagePath);
            parameters.put("date", sdf.format(date));
            parameters.put("totalStudents", String.valueOf(totalStudents));
            parameters.put("male", String.valueOf(maleStudents));

            // ✅ Get database connection
            dataSource = MySQL.getConnection();

            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, dataSource);

            saveReportAsPDF(jp, id);
            JasperViewer.viewReport(jp, false);

        } catch (JRException | SQLException e) {
            logger.log(Level.SEVERE, "Exception while generating report", e);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Unexpected exception", ex);
        }
    }

    public void saveReportAsPDF(JasperPrint jp, String id) {
        try {
            // Define the base directory
            String baseDirectory = "C:\\WeerasinghePiriwena\\Reports";

            // Create the base directory if it doesn't exist
            File reportDir = new File(baseDirectory);
            if (!reportDir.exists()) {
                reportDir.mkdirs();
            }

            // Define the PDF file path
            String pdfFilePath = baseDirectory + File.separator + id + ".pdf";

            // Check if a report with the same ID already exists
            File oldReport = new File(pdfFilePath);
            if (oldReport.exists()) {
                oldReport.delete(); // Delete the old report
            }

            // Export the new report to PDF
            JasperExportManager.exportReportToPdfFile(jp, pdfFilePath);

            System.out.println("PDF saved successfully: " + pdfFilePath);

        } catch (JRException e) {
            logger.log(Level.SEVERE, "JRException while saving PDF", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception while saving PDF", e);
        }
    }

    private void resetFields() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jTable1.clearSelection();
        imageUploader.setDefaultImage();
        jButton2.setEnabled(false);
        loadGuardian();
        loadStudents();
    }

    private String convertToString(Object value) {
        if (value == null) {
            return "";
        }
        return value.toString();
    }

    private void loadGuardian() {

        try {

            ResultSet rs = MySQL.search("SELECT * FROM `guardian`");

            Vector v = new Vector();
            v.add("-SELECT-");
            while (rs.next()) {
                v.add(rs.getString("id") + " - " + rs.getString("name"));
            }

            jComboBox3.setModel(new DefaultComboBoxModel(v));

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Guardian loading exception : ", e);
            e.printStackTrace();
        }

    }

    private void loadStudents() {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `student` INNER JOIN `guardian` ON `student`.`guardian_id` = `guardian`.`id` ORDER BY `student`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("student.id"));
                v.add(rs.getString("student.admission_no"));
                v.add(rs.getString("student.current_grade"));
                v.add(rs.getString("student.name_with_initial"));
                v.add(rs.getString("student.full_name"));
                v.add(rs.getString("student.birth_day"));
                v.add(rs.getString("student.gender"));
                v.add(rs.getString("guardian.id"));
                v.add(rs.getString("guardian.name"));
                v.add(rs.getString("guardian.nic"));
                v.add(rs.getString("guardian.mobile1"));
                v.add(rs.getString("guardian.mobile2"));
                dtm.addRow(v);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Student loading Exception: ", e);
            e.printStackTrace();
        }
    }

    private void loadStudents(String text) {
        try {

            ResultSet rs = MySQL.search("SELECT * FROM `student` INNER JOIN `guardian` ON `student`.`guardian_id` = `guardian`.`id` WHERE `student`.`full_name` LIKE '%" + text + "%' OR `student`.`admission_no` LIKE '%" + text + "%' ORDER BY `student`.`id` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("student.id"));
                v.add(rs.getString("student.admission_no"));
                v.add(rs.getString("student.current_grade"));
                v.add(rs.getString("student.name_with_initial"));
                v.add(rs.getString("student.full_name"));
                v.add(rs.getString("student.birth_day"));
                v.add(rs.getString("student.gender"));
                v.add(rs.getString("guardian.id"));
                v.add(rs.getString("guardian.name"));
                v.add(rs.getString("guardian.nic"));
                v.add(rs.getString("guardian.mobile1"));
                v.add(rs.getString("guardian.mobile2"));
                dtm.addRow(v);
            }

            jTable1.setModel(dtm);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Student loading Exception (search by name or nic) : ", e);
            e.printStackTrace();
        }
    }

    private boolean validateInputs() {
        if (jTextField1.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Student Admission Number!");
            jTextField1.requestFocus();
            return false;
        }

        if (jComboBox1.getSelectedIndex() == 0) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Select Current Grade!");
            jTextField1.requestFocus();
            return false;
        }

        if (jTextField2.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Name with Initials!");
            jTextField2.requestFocus();
            return false;
        }

        if (jTextField3.getText().trim().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Enter Full Name!");
            jTextField3.requestFocus();
            return false;
        }

        if (jDateChooser1.getDate() == null) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Select a Birth Date!");
            jDateChooser1.requestFocus();
            return false;
        }

        if (jComboBox2.getSelectedIndex() == 0) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Select a Gender!");
            jComboBox2.requestFocus();
            return false;
        }

        if (jComboBox3.getSelectedIndex() == 0) {
            Notifications.getInstance().show(Notifications.Type.WARNING,
                    Notifications.Location.TOP_CENTER, "Please Select a Guardian!");
            jComboBox3.requestFocus();
            return false;
        }

        // Check if the image is set
        if (imageUploader.hasDefaultImage()) {
            int choice = JOptionPane.showConfirmDialog(null,
                    "Do you want to use the default image?",
                    "Image Upload",
                    JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.NO_OPTION) {
                Notifications.getInstance().show(Notifications.Type.INFO,
                        Notifications.Location.TOP_CENTER, "Please upload an image before saving.");
                return false;
            } else {
                imageUploader.setDefaultImage(); // Only set the default image if chosen
            }
        }

        return true; // Validation passed
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
            FileHandler fileHandler = new FileHandler(logFolder.getPath() + File.separator + "Student_log.txt", true);
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
