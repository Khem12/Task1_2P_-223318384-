package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223318384";
		Assert.assertNotNull("Student ID is: ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Khem Raj Gurung";
		Assert.assertNotNull("Student name is: ", studentName);
	}

	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testCancelDueToHighRainfall() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
    }

    @Test
    public void testCancelDueToHighWindAndRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.1));
    }

    @Test
    public void testWarnDueToWind() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 2.0));
    }

    @Test
    public void testWarnDueToRain() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(30.0, 4.1));
    }

    @Test
    public void testAllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 3.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValues() {
        WeatherAndMathUtils.weatherAdvice(-1.0, -1.0);
    }

    @Test
    public void testIsEvenTrue() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testIsEvenFalse() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testIsPrimeForOne() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1));  // covers n == 1
    }

    @Test
    public void testIsPrimeFalse() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));  // even, not prime
    }

    @Test
    public void testIsPrimeTrue() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3));  // prime
    }

}



