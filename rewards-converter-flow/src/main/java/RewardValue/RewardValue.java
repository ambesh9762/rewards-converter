package RewardValue;

public class RewardValue {
	
	double cashValue;
	int milesValue =0;
	
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
	public void setMilesValue(int milesValue) {
		
		double mileperCost = cashValue * 0.0035; //set by defalut airline price per mile 7.5 US $
		milesValue =(int)mileperCost;
		this.milesValue = milesValue;
	}

	
}
