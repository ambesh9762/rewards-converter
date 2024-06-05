import org.junit.jupiter.api.Test;

import RewardValue.RewardValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assert false;
        //1. set eligible criteria for cash to mile
        	//1.1 -> if u have been paid more than 1000$ then u get will 15 miles points 
        //2. convert cash ponit into miles
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        //1. set eligible criteria for mile to cash
        	// 1.1 -> if u had more than 1500 miles point then u will get 10$ 
        //2. covert miles point to cash
    }
}
