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
			rewardsValue.setMilesValue(0);// setting mile value initially
			System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
		}
    }
}