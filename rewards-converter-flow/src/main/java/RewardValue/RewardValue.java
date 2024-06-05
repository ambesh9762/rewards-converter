package RewardValue;

public class RewardValue {
	
	double cashValue;
	int milesValue =0;
	double conversionRate =0.035;
	public RewardValue() {
		System.out.println("default is runnnig");
	}
	public RewardValue(double cash) {
		this.cashValue = cash;
		//System.out.println("parameter ruunning: "+ cash);
	}
	public Double getCashValue() {
		return cashValue;	
	}
	public int getMilesValue() {
		return milesValue;
	}
	
	public void setMilesValue() {
		this.milesValue = milesValue;
	}
	public void setCashValue() {
		this.cashValue =cashValue;
	}

	public void cashToMiles(int milesValue) {
		double mileperCost = cashValue * conversionRate; //set by defalut airline price per mile 0.0035 US $
		milesValue =(int)mileperCost;
		this.milesValue = milesValue;
	}
	
	public double milesToCash(int milesValue) {
		double cashValue = milesValue*conversionRate;
		System.out.println(cashValue);
		return cashValue;
	}
}
