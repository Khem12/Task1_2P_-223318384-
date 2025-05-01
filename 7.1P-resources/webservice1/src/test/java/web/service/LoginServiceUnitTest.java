package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginServiceUnitTest {
    
    @Test
    public void testLoginSuccess() {
        assertTrue(LoginService.login("khem", "khem_pass", "1998-01-20"));
    }
    
    @Test
    public void testLoginWrongUsername() {
        assertFalse(LoginService.login("wrong", "khem_pass", "1998-01-20"));
    }
    
    @Test
    public void testLoginWrongPassword() {
        assertFalse(LoginService.login("khem", "wrong", "1998-01-20"));
    }
    
    @Test
    public void testLoginWrongDob() {
        assertFalse(LoginService.login("khem", "khem_pass", "1999-01-01"));
    }
    
    @Test
    public void testLoginNullUsername() {
        assertFalse(LoginService.login(null, "khem_pass", "1998-01-20"));
    }
    
    @Test
    public void testLoginNullPassword() {
        assertFalse(LoginService.login("khem", null, "1998-01-20"));
    }
    
    @Test
    public void testLoginNullDob() {
        assertFalse(LoginService.login("khem", "khem_pass", null));
    }
    
    @Test
    public void testLoginInvalidDobFormat() {
        assertFalse(LoginService.login("khem", "khem_pass", "20-01-1998"));
    }
    
    @Test
    public void testLoginEmptyUsername() {
        assertFalse(LoginService.login("", "khem_pass", "1998-01-20"));
    }
    
    @Test
    public void testLoginEmptyPassword() {
        assertFalse(LoginService.login("khem", "", "1998-01-20"));
    }
    
    @Test
    public void testLoginEmptyDob() {
        assertFalse(LoginService.login("khem", "khem_pass", ""));
    }
}
