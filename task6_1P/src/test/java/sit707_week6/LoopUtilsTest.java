package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopUtilsTest {

	@Test
	public void testSumUpTo5() {
		Assert.assertEquals(15, LoopUtils.sumUpTo(5));
	}

	@Test
	public void testSumUpTo0() {
		Assert.assertEquals(0, LoopUtils.sumUpTo(0));
	}

	@Test
	public void testCountEvenNumbers() {
		int[] input = {1, 2, 3, 4, 5, 6};
		Assert.assertEquals(3, LoopUtils.countEvenNumbers(input));
	}

	@Test
	public void testCountEvenEmptyArray() {
		int[] input = {};
		Assert.assertEquals(0, LoopUtils.countEvenNumbers(input));
	}

	@Test
	public void testCountEvenAllOdd() {
		int[] input = {1, 3, 5, 7};
		Assert.assertEquals(0, LoopUtils.countEvenNumbers(input));
	}
}
