package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Khem Raj Gurung
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "223318384";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Khem";
		Assert.assertNotNull("Student name is ", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	/*
	 * Write more test functions below.
	 */
	@Test
	public void testFailEmptyUsernameAndWrongPassword() {
		LoginStatus status = LoginForm.login(null, "wrong_pass");
		System.out.println("[Test] Empty Username, Wrong Password -> " + status);
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void testFailWrongUsernameAndWrongPassword() {
		LoginStatus status = LoginForm.login("wrong_user", "wrong_pass");
		System.out.println("[Test] Wrong Username, Wrong Password -> " + status);
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testFailCorrectUsernameAndEmptyPassword() {
		LoginStatus status = LoginForm.login("Khem", null);
		System.out.println("[Test] Correct Username, Empty Password -> " + status);
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Empty Password", status.getErrorMsg());
	}

	@Test
	public void testFailCorrectUsernameAndWrongPassword() {
		LoginStatus status = LoginForm.login("Khem", "wrong_pass");
		System.out.println("[Test] Correct Username, Wrong Password -> " + status);
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testFailEmptyUsernameAndCorrectPassword() {
		LoginStatus status = LoginForm.login(null, "Khem-pass");
		System.out.println("[Test] Empty Username, Correct Password -> " + status);
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void testFailWrongUsernameAndCorrectPassword() {
		LoginStatus status = LoginForm.login("wrong_user", "Khem-pass");
		System.out.println("[Test] Wrong Username, Correct Password -> " + status);
		Assert.assertFalse(status.isLoginSuccess());
		Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testSuccessCorrectUsernameAndCorrectPassword() {
		LoginStatus status = LoginForm.login("Khem", "Khem-pass");
		System.out.println("[Test] Correct Username, Correct Password -> " + status);
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertEquals("123456", status.getErrorMsg()); // Validation code is returned
	}

	@Test
	public void testFailValidationCodeEmpty() {
		boolean result = LoginForm.validateCode(null);
		System.out.println("[Test] Validation Code (Empty) -> " + result);
		Assert.assertFalse("Validation should fail for empty code", result);
	}

	@Test
	public void testFailValidationCodeWrong() {
		boolean result = LoginForm.validateCode("wrong_code");
		System.out.println("[Test] Validation Code (Wrong) -> " + result);
		Assert.assertFalse("Validation should fail for incorrect code", result);
	}

	@Test
	public void testSuccessValidationCodeCorrect() {
		boolean result = LoginForm.validateCode("123456");
		System.out.println("[Test] Validation Code (Correct) -> " + result);
		Assert.assertTrue("Validation should succeed for correct code", result);
	}
}
