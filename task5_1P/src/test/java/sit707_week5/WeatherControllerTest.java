package sit707_week5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class WeatherControllerTest {

    private WeatherController wController;

    // Set up the WeatherController instance before each test
    @Before
    public void setUp() {
        wController = WeatherController.getInstance();
    }

    // Close the WeatherController instance after each test
    @After
    public void tearDown() {
        wController.close();
    }

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
    public void testTemperatureMin() {
        System.out.println("+++ testTemperatureMin +++");

        // Arrange: Retrieve all the hours temperatures recorded as for today
        int nHours = wController.getTotalHours();
        double[] hourlyTemperatures = new double[nHours];
        for (int i = 0; i < nHours; i++) {
            hourlyTemperatures[i] = wController.getTemperatureForHour(i + 1);
        }

        // Act: Find the minimum temperature
        double minTemperature = hourlyTemperatures[0];
        for (int i = 1; i < hourlyTemperatures.length; i++) {
            if (hourlyTemperatures[i] < minTemperature) {
                minTemperature = hourlyTemperatures[i];
            }
        }

        // Assert: Verify the cached minimum value
        Assert.assertTrue(wController.getTemperatureMinFromCache() == minTemperature);
    }

    @Test
    public void testTemperatureMax() {
        System.out.println("+++ testTemperatureMax +++");

        // Arrange: Retrieve all the hours temperatures recorded as for today
        int nHours = wController.getTotalHours();
        double[] hourlyTemperatures = new double[nHours];
        for (int i = 0; i < nHours; i++) {
            hourlyTemperatures[i] = wController.getTemperatureForHour(i + 1);
        }

        // Act: Find the maximum temperature
        double maxTemperature = hourlyTemperatures[0];
        for (int i = 1; i < hourlyTemperatures.length; i++) {
            if (hourlyTemperatures[i] > maxTemperature) {
                maxTemperature = hourlyTemperatures[i];
            }
        }

        // Assert: Verify the cached maximum value
        Assert.assertTrue(wController.getTemperatureMaxFromCache() == maxTemperature);
    }

    @Test
    public void testTemperatureAverage() {
        System.out.println("+++ testTemperatureAverage +++");

        // Arrange: Retrieve all the hours temperatures recorded as for today
        int nHours = wController.getTotalHours();
        double[] hourlyTemperatures = new double[nHours];
        for (int i = 0; i < nHours; i++) {
            hourlyTemperatures[i] = wController.getTemperatureForHour(i + 1);
        }

        // Act: Calculate the average temperature
        double sumTemp = 0;
        for (int i = 0; i < hourlyTemperatures.length; i++) {
            sumTemp += hourlyTemperatures[i];
        }
        double averageTemp = sumTemp / nHours;

        // Assert: Verify the cached average value
        Assert.assertTrue(wController.getTemperatureAverageFromCache() == averageTemp);
    }

    @Test
    public void testTemperaturePersist() {
        /*
         * Remove below comments ONLY for 5.3C task.
         */
        // System.out.println("+++ testTemperaturePersist +++");
        // WeatherController wController = WeatherController.getInstance();
        // String persistTime = wController.persistTemperature(10, 19.5);
        // String now = new SimpleDateFormat("H:m:s").format(new Date());
        // System.out.println("Persist time: " + persistTime + ", now: " + now);
        // Assert.assertTrue(persistTime.equals(now));
        // wController.close();
    }
}
