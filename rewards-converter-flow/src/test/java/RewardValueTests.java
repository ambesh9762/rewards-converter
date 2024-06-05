import org.junit.jupiter.api.Test;

import RewardValue.RewardValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

public class RewardValueTests {


	@Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
      
    		double conversionRate=0.035;
    		double cashValue = 100;
			var rewardValue = new RewardValue(cashValue);
			assertEquals(rewardValue.getMilesValue(), cashValue*conversionRate);
    }

	@Test
    void convert_from_miles_to_cash() {
        int milesValue = 100;
        double cashValue = milesValue*0.035;
        var rewardValue = new RewardValue(milesValue);
        assertEquals( rewardValue.getCashValue(),milesValue*cashValue);
    }


}
