package web.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Business logic to handle login functions.
 */
public class LoginService {
    private static final String VALID_USERNAME = "khem";
    private static final String VALID_PASSWORD = "khem_pass";
    private static final String VALID_DOB = "1998-01-20";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * Static method returns true for successful login, false otherwise.
     * @param username
     * @param password
     * @param dob Date of Birth in yyyy-MM-dd format
     * @return
     */
    public static boolean login(String username, String password, String dob) {
        // Validate all parameters are non-null
        if (username == null || password == null || dob == null) {
            return false;
        }
        
        // Validate username and password
        if (!VALID_USERNAME.equals(username) || !VALID_PASSWORD.equals(password)) {
            return false;
        }
        
        // Validate date format and value
        try {
            LocalDate inputDob = LocalDate.parse(dob, DATE_FORMATTER);
            LocalDate validDob = LocalDate.parse(VALID_DOB, DATE_FORMATTER);
            
            if (!inputDob.equals(validDob)) {
                return false;
            }
        } catch (DateTimeParseException e) {
            return false;
        }
        
        return true;
    }
}