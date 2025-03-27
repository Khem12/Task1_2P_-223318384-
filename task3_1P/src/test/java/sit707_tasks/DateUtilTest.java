package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Khem Raj Gurung
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223318384";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Khem Raj Gurung";
		Assert.assertNotNull("Student name is ", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test  
	public void testMinJanuary1ShouldIncrementToJanuary2() {  
	    // January min boundary area: min+1  
	    DateUtil date = new DateUtil(1, 1, 2024);  
	    System.out.println("january1ShouldIncrementToJanuary2 > " + date);  
	    
	    // Increment the date
	    date.increment();  
	    
	    // Check the date after incrementing
	    System.out.println(date);  
	    
	    // Assert that the day is now January 2nd and the month is still January
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(1, date.getMonth());  
	} 
	
	@Test  
	public void testMinJanuary1ShouldDecrementToDecember31() {  
	    // January min boundary area: min-1  
	    DateUtil date = new DateUtil(1, 1, 2024);  
	    System.out.println("january1ShouldDecrementToDecember31 > " + date);  
	    
	    // Decrement the date
	    date.decrement();  
	    
	    // Check the date after decrementing
	    System.out.println(date);  
	    
	    // Assert that the day is now December 31st and the month is December
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(12, date.getMonth());  // December
	    Assert.assertEquals(2023, date.getYear());  // Previous year
	} 
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	@Test  
	public void testMinFebruary1ShouldIncrementToFebruary2() {  
	    DateUtil date = new DateUtil(1, 2, 2024);  
	    System.out.println("february1ShouldIncrementToFebruary2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(2, date.getMonth());  
	}  

	@Test  
	public void testMinFebruary1ShouldDecrementToJanuary31() {  
	    DateUtil date = new DateUtil(1, 2, 2024);  
	    System.out.println("february1ShouldDecrementToJanuary31 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(1, date.getMonth());  
	}  
	
	@Test  
	public void testMinFebruary29LeapYearShouldDecrementToFebruary28() {  
		DateUtil date = new DateUtil(29, 2, 2024);  
		System.out.println("february29LeapYearShouldDecrementToFebruary28 > " + date);  
		date.decrement();  
		System.out.println(date);  
		Assert.assertEquals(28, date.getDay());  
		Assert.assertEquals(2, date.getMonth());  // February (previous day)
	}  
	
	@Test  
	public void testMinFebruary29LeapYearShouldIncrementToMarch1() {  
	    DateUtil date = new DateUtil(29, 2, 2024);  
	    System.out.println("february29LeapYearShouldIncrementToMarch1 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(1, date.getDay());  
	    Assert.assertEquals(3, date.getMonth());  // March
	}  


	
	@Test  
	public void testMinMarch1ShouldIncrementToMarch2() {  
	    DateUtil date = new DateUtil(1, 3, 2024);  
	    System.out.println("march1ShouldIncrementToMarch2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(3, date.getMonth());  
	}  

	@Test  
	public void testMinMarch1ShouldDecrementToFebruary29() {  
	    DateUtil date = new DateUtil(1, 3, 2024);  
	    System.out.println("march1ShouldDecrementToFebruary29 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(29, date.getDay());  
	    Assert.assertEquals(2, date.getMonth());  // February (2024 is a leap year)
	}  

	@Test  
	public void testMinApril1ShouldIncrementToApril2() {  
	    DateUtil date = new DateUtil(1, 4, 2024);  
	    System.out.println("april1ShouldIncrementToApril2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(4, date.getMonth());  
	}  

	@Test  
	public void testMinApril1ShouldDecrementToMarch31() {  
	    DateUtil date = new DateUtil(1, 4, 2024);  
	    System.out.println("april1ShouldDecrementToMarch31 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(3, date.getMonth());  // March
	}  

	@Test  
	public void testMinMay1ShouldIncrementToMay2() {  
	    DateUtil date = new DateUtil(1, 5, 2024);  
	    System.out.println("may1ShouldIncrementToMay2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(5, date.getMonth());  
	}  

	@Test  
	public void testMinMay1ShouldDecrementToApril30() {  
	    DateUtil date = new DateUtil(1, 5, 2024);  
	    System.out.println("may1ShouldDecrementToApril30 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(30, date.getDay());  
	    Assert.assertEquals(4, date.getMonth());  // April
	}  

	@Test  
	public void testMinJune1ShouldIncrementToJune2() {  
	    DateUtil date = new DateUtil(1, 6, 2024);  
	    System.out.println("june1ShouldIncrementToJune2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(6, date.getMonth());  
	}  

	@Test  
	public void testMinJune1ShouldDecrementToMay31() {  
	    DateUtil date = new DateUtil(1, 6, 2024);  
	    System.out.println("june1ShouldDecrementToMay31 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(5, date.getMonth());  // May
	}  

	@Test  
	public void testMinJuly1ShouldIncrementToJuly2() {  
	    DateUtil date = new DateUtil(1, 7, 2024);  
	    System.out.println("july1ShouldIncrementToJuly2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(7, date.getMonth());  
	}  

	@Test  
	public void testMinJuly1ShouldDecrementToJune30() {  
	    DateUtil date = new DateUtil(1, 7, 2024);  
	    System.out.println("july1ShouldDecrementToJune30 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(30, date.getDay());  
	    Assert.assertEquals(6, date.getMonth());  // June
	}  

	@Test  
	public void testMinAugust1ShouldIncrementToAugust2() {  
	    DateUtil date = new DateUtil(1, 8, 2024);  
	    System.out.println("august1ShouldIncrementToAugust2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(8, date.getMonth());  
	}  

	@Test  
	public void testMinAugust1ShouldDecrementToJuly31() {  
	    DateUtil date = new DateUtil(1, 8, 2024);  
	    System.out.println("august1ShouldDecrementToJuly31 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(7, date.getMonth());  // July
	}  

	@Test  
	public void testMinSeptember1ShouldIncrementToSeptember2() {  
	    DateUtil date = new DateUtil(1, 9, 2024);  
	    System.out.println("september1ShouldIncrementToSeptember2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(9, date.getMonth());  
	}  

	@Test  
	public void testMinSeptember1ShouldDecrementToAugust31() {  
	    DateUtil date = new DateUtil(1, 9, 2024);  
	    System.out.println("september1ShouldDecrementToAugust31 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(8, date.getMonth());  // August
	}  

	@Test  
	public void testMinOctober1ShouldIncrementToOctober2() {  
	    DateUtil date = new DateUtil(1, 10, 2024);  
	    System.out.println("october1ShouldIncrementToOctober2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(10, date.getMonth());  
	}  

	@Test  
	public void testMinOctober1ShouldDecrementToSeptember30() {  
	    DateUtil date = new DateUtil(1, 10, 2024);  
	    System.out.println("october1ShouldDecrementToSeptember30 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(30, date.getDay());  
	    Assert.assertEquals(9, date.getMonth());  // September
	}  

	@Test  
	public void testMinNovember1ShouldIncrementToNovember2() {  
	    DateUtil date = new DateUtil(1, 11, 2024);  
	    System.out.println("november1ShouldIncrementToNovember2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(11, date.getMonth());  
	}  

	@Test  
	public void testMinNovember1ShouldDecrementToOctober31() {  
	    DateUtil date = new DateUtil(1, 11, 2024);  
	    System.out.println("november1ShouldDecrementToOctober31 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(10, date.getMonth());  // October
	}  

	@Test  
	public void testMinDecember1ShouldIncrementToDecember2() {  
	    DateUtil date = new DateUtil(1, 12, 2024);  
	    System.out.println("december1ShouldIncrementToDecember2 > " + date);  
	    date.increment();  
	    System.out.println(date);  
	    Assert.assertEquals(2, date.getDay());  
	    Assert.assertEquals(12, date.getMonth());  
	}  

	@Test  
	public void testMinDecember1ShouldDecrementToNovember30() {  
	    DateUtil date = new DateUtil(1, 12, 2024);  
	    System.out.println("december1ShouldDecrementToNovember30 > " + date);  
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(30, date.getDay());  
	    Assert.assertEquals(11, date.getMonth());  // November
	}  

	@Test
	public void testDecrementFromJune1st1994() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("Test 1A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(5, date.getMonth());  // May
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecrementFromJune2nd1994() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("Test 2A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecrementFromJune15th1994() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("Test 3A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecrementFromJune30th1994() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("Test 4A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test (expected = Exception.class)
	public void testInvalidDateForJune31st1994() {
	    
	        DateUtil date = new DateUtil(31, 6, 1994);
	        System.out.println("Test 5A: " + date);
	        date.decrement();
	}

	@Test
	public void testDecrementFromJanuary15th1994() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("Test 6A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(1, date.getMonth());  // January
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecrementFromFebruary15th1994() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("Test 7A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(2, date.getMonth());  // February
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecrementFromNovember15th1994() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("Test 8A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(11, date.getMonth());  // November
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecrementFromDecember15th1994() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("Test 9A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(12, date.getMonth());  // December
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testDecrementFromJune15th1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("Test 10A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testDecrementFromJune15th1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("Test 11A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testDecrementFromJune15th2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("Test 12A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testDecrementFromJune15th2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("Test 13A: " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testIncrementFromJune1st1994() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("Test 1B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testIncrementFromJune2nd1994() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("Test 2B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testIncrementFromJune15th1994() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("Test 3B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testIncrementFromJune30th1994() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("Test 4B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());  // July
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test (expected = Exception.class)
	public void testInvalidDateForJune31st1994OnIncrement() {
	   
	        DateUtil date = new DateUtil(31, 6, 1994);
	        System.out.println("Test 5B: " + date);
	        date.increment();
	}

	@Test
	public void testIncrementFromJanuary15th1994() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("Test 6B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());  // January
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testIncrementFromFebruary15th1994() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("Test 7B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());  // February
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testIncrementFromNovember15th1994() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("Test 8B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());  // November
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testIncrementFromDecember15th1994() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("Test 9B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());  // December
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testIncrementFromJune15th1700() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("Test 10B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testIncrementFromJune15th1701() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("Test 11B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testIncrementFromJune15th2023() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("Test 12B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testIncrementFromJune15th2024() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("Test 13B: " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());  // June
	    Assert.assertEquals(2024, date.getYear());
	}

	
	
}
