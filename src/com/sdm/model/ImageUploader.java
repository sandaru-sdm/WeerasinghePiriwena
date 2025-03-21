package com.sdm.model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageUploader {

    private JLabel jLabel8;
    private ImageIcon defaultIcon;
    private File selectedFile;
    private File defaultFile;

    public ImageUploader(JLabel label) {
        this.jLabel8 = label;
        setDefaultImage();
    }

    public void setDefaultImage() {
        try {
            defaultIcon = new ImageIcon(getClass().getResource("/raven/icon/png/Chakra1.png"));
            jLabel8.setIcon(defaultIcon);
            selectedFile = null; // Reset selected file

            // Store default image file (for saving later)
            defaultFile = new File(getClass().getResource("/raven/icon/png/Chakra1.png").toURI());

        } catch (Exception e) {
            System.err.println("Default image not found: " + e.getMessage());
        }
    }

    public boolean hasDefaultImage() {
        return jLabel8.getIcon() != null && jLabel8.getIcon().equals(defaultIcon);
    }

    public void askUserAndUploadImage() {
        int choice = JOptionPane.showConfirmDialog(null,
                "Do you want to use the default image?",
                "Image Upload",
                JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.NO_OPTION) {
            openAndSetImage(); // Allow user to upload only once if they choose "No"
        } else {
            setDefaultImage();
        }
    }

    public void openAndSetImage() {
        try {
            JFileChooser jf = new JFileChooser(new File(System.getProperty("user.home")));
            jf.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                    "Image Files (JPG, JPEG, PNG, GIF, BMP, TIFF, WEBP)",
                    "jpg", "jpeg", "png", "gif", "bmp", "tiff", "tif", "webp"));

            int showOpenDialog = jf.showOpenDialog(null);

            if (showOpenDialog == JFileChooser.APPROVE_OPTION) {
                selectedFile = jf.getSelectedFile();
                BufferedImage img = ImageIO.read(selectedFile);

                if (img != null) {
                    Image scaledImg = img.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
                    jLabel8.setIcon(new ImageIcon(scaledImg));
                } else {
                    setDefaultImage();
                }
            }
        } catch (IOException e) {
            setDefaultImage();
        }
    }

    // Save the Image and Return its Filename for Database**
    public String saveImageAndGetFilename() {
        try {
            File directory = new File("C:/WeerasinghePiriwena/StudentImages");

            if (!directory.exists()) {
                directory.mkdirs();
            }

            File imageToSave;
            if (selectedFile != null) {
                imageToSave = selectedFile;
            } else {
                imageToSave = defaultFile;
            }

            if (imageToSave == null) {
                return "";
            }

            // Generate filename with extension
            String extension = getFileExtension(imageToSave);
            if (extension.isEmpty()) {
                return "";
            }

            String randomFilename = UUID.randomUUID().toString() + "." + extension;
            File destination = new File(directory, randomFilename);

            // Copy file to new location
            Files.copy(imageToSave.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

            return randomFilename;
        } catch (Exception e) {
            System.err.println("Error saving image: " + e.getMessage());
            return "";
        }
    }

    public String saveImageAndGetFilename(String oldImageName) {
        try {
            File directory = new File("C:/WeerasinghePiriwena/StudentImages");

            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Delete old image
            if (oldImageName != null && !oldImageName.isEmpty()) {
                File oldImageFile = new File(directory, oldImageName);
                if (oldImageFile.exists() && !oldImageFile.equals(defaultFile)) {
                    oldImageFile.delete();
                }
            }

            File imageToSave;
            if (selectedFile != null) {
                imageToSave = selectedFile;
            } else {
                imageToSave = defaultFile;
            }

            if (imageToSave == null) {
                return "";
            }

            // Generate filename with extension
            String extension = getFileExtension(imageToSave);
            if (extension.isEmpty()) {
                return "";
            }

            String randomFilename = UUID.randomUUID().toString() + "." + extension;
            File destination = new File(directory, randomFilename);

            // Copy file to new location
            Files.copy(imageToSave.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

            return randomFilename;
        } catch (Exception e) {
            System.err.println("Error saving image: " + e.getMessage());
            return "";
        }
    }

    // Get File Extension
    private String getFileExtension(File file) {
        String name = file.getName();
        int lastDot = name.lastIndexOf('.');
        return (lastDot == -1) ? "" : name.substring(lastDot + 1);
    }
}
