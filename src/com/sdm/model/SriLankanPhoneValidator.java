/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sdm.model;

/**
 *
 * @author maduh
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SriLankanPhoneValidator {

    // Pattern for Sri Lankan mobile numbers
    private static final String MOBILE_REGEX
            = "^(?:0|94|\\+94)?(?:"
            + "(7\\d{8}))|"
            + // Format: 07XXXXXXXX or 947XXXXXXXX or +947XXXXXXXX
            "^(?:0|94|\\+94)?"
            + "(?:7[0-9]{8})$";

    // Pattern for Sri Lankan landline numbers
    private static final String LANDLINE_REGEX
            = "^(?:0|94|\\+94)?"
            + "(?:1|2|3|4|5|6|8|9)\\d{8}$";  // Format: 0XXXXXXXXX or 94XXXXXXXXX or +94XXXXXXXXX

    private static final Pattern mobilePattern = Pattern.compile(MOBILE_REGEX);
    private static final Pattern landlinePattern = Pattern.compile(LANDLINE_REGEX);

    public static boolean isValidMobileNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            return false;
        }

        // Remove any spaces or hyphen for validation
        phoneNumber = phoneNumber.replaceAll("[\\s-]", "");

        Matcher matcher = mobilePattern.matcher(phoneNumber);
        return matcher.matches();
    }


    public static boolean isValidLandlineNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            return false;
        }

        // Remove any spaces or hyphen for validation
        phoneNumber = phoneNumber.replaceAll("[\\s-]", "");

        Matcher matcher = landlinePattern.matcher(phoneNumber);
        return matcher.matches();
    }


    public static boolean isValidPhoneNumber(String phoneNumber) {
        return isValidMobileNumber(phoneNumber) || isValidLandlineNumber(phoneNumber);
    }


    public static String formatPhoneNumber(String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber)) {
            return phoneNumber;
        }

        // Remove any existing formatting
        phoneNumber = phoneNumber.replaceAll("[\\s-]", "");

        // Convert international format to local format
        if (phoneNumber.startsWith("+94")) {
            phoneNumber = "0" + phoneNumber.substring(3);
        } else if (phoneNumber.startsWith("94")) {
            phoneNumber = "0" + phoneNumber.substring(2);
        }

        // Format based on number type (mobile or landline)
        if (isValidMobileNumber(phoneNumber)) {
            return String.format("%s %s %s",
                    phoneNumber.substring(0, 3),
                    phoneNumber.substring(3, 6),
                    phoneNumber.substring(6));
        } else {
            return String.format("%s %s %s",
                    phoneNumber.substring(0, 3),
                    phoneNumber.substring(3, 6),
                    phoneNumber.substring(6));
        }
    }

    // Example usage
    public static void main(String[] args) {
        String[] testMobiles = {
            "0712345678", "+94712345678", "94712345678", "712345678",
            "071-234-5678", "071 234 5678",
            "0812345678" // Invalid as a mobile number
        };

        String[] testLandlines = {
            "0332257027", "0112970746", "+94112345678", "94112345678", "112345678",
            "011-234-5678", "011 234 5678",
            "0772345678" // Invalid as a landline number
        };

        System.out.println("Testing Mobile Numbers:");
        for (String number : testMobiles) {
            System.out.println(number + " is "
                    + (isValidMobileNumber(number) ? "valid" : "invalid")
                    + " mobile number.");
            if (isValidMobileNumber(number)) {
                System.out.println("  Formatted: " + formatPhoneNumber(number));
            }
        }

        System.out.println("\nTesting Landline Numbers:");
        for (String number : testLandlines) {
            System.out.println(number + " is "
                    + (isValidLandlineNumber(number) ? "valid" : "invalid")
                    + " landline number.");
            if (isValidLandlineNumber(number)) {
                System.out.println("  Formatted: " + formatPhoneNumber(number));
            }
        }
    }
}
