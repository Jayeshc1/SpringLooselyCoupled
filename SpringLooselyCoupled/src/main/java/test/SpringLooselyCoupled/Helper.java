package test.SpringLooselyCoupled;

public class Helper {

	private Bikes bikes;

	public void getBikes() { //instead of return obj of bike(public Bikes getBikes())==> call method
		bikes.testDrive();
	}

	public void setBikes(Bikes bikes) {
		this.bikes = bikes;
	}
	
	
}
