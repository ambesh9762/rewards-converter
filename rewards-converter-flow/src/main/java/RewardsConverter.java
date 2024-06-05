import java.util.Scanner;
import RewardValue.*;
public class RewardsConverter {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
			System.out.println("Welcome to the Credit Card Rewards Converter!");
			System.out.println("Please enter a cash value to convert to airline miles: ");
			var input_value = scanner.nextLine();
			double cashValue;
			try {
			    cashValue = Double.parseDouble(input_value);
			} catch (NumberFormatException exception) {
			    System.out.println("Could not parse input value as a double, exiting");
			    return;
			}
			System.out.println("converting $" + input_value + " to miles");
			RewardValue rewardsValue = new RewardValue(cashValue);
			//System.out.println("getcashValue ruunning: "+ rewardsValue.getCashValue());
			rewardsValue.cashToMiles(0);
			rewardsValue.setMilesValue();// setting mile value initially
			System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
		
			System.out.println("Please enter a miles value to convert to airline cash: ");
			var input_mile = scanner.nextLine();
			//System.out.println("miles " + input_mile);
			int milesValue = Integer.parseInt(input_mile);
			System.out.println("converting Miles " + input_mile + " to $");
			RewardValue rewardsValue2 = new RewardValue(milesValue);
			System.out.println("Miles " + input_mile + " is worth " + rewardsValue2.milesToCash(milesValue) + " $");
        }
    }
}