import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInterestCalc2Test {

	@Test
	public void calculateInterestGivenRate() {
		SimpleInterestCalc obj = new SimpleInterestCalc();
		double amount = obj.calculateSimpleInterest(6100, 350);
		Assert.assertEquals(304.16, amount, 0.005);
	}

}
