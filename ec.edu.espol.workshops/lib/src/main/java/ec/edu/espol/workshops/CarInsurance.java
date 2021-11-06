package ec.edu.espol.workshops;


/**
 * Represents a CarInsurance Deal
 * Calculates the insurance cost with the customer's data.
 * @author Julian & Gabriela 
 */

public class CarInsurance {
	
	static int BASE_PREMIUM = 500;
	int MAX_AGE = 80;
	int MIN_AGE = 18;
	int CASE_A = 1500; /*Add male and not married and under 25*/
	int CASE_B = 200;  /*Subtract female or married*/
	int CASE_C = 100;  /*Subtract between 45 and 65*/
	
	private int customerAge;
	private char customerSex;
	private boolean marriedStatus;
	private boolean haveLicense;
	

	/**
	 * Creates a new CarInsurance base on the customer's age, sex, marital status and if the customer has a license.
	 */
	public CarInsurance() {
		
	}
	
	public CarInsurance(int customerAge, char customerSex, boolean marriedStatus, boolean haveLicense) {
		
		this.customerAge = customerAge;
		
		if((Character.toUpperCase(customerSex) != 'M') && (Character.toUpperCase(customerSex) != 'F')  ) {
			throw new IllegalArgumentException("Sex not valid");
		}
		
		this.customerSex = customerSex;
		
		this.marriedStatus = marriedStatus;
		
		this.haveLicense= haveLicense;
	}

	public int getCustomerAge() {
		return customerAge;
	}
	
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
	public char getCustomerSex() {
		return customerSex;
	}
	
	public void setCustomerSex(char customerSex) {
		this.customerSex = customerSex;
	}
	
	public boolean isMarriedStatus() {
		return marriedStatus;
	}

	public void setMarriedStatus(boolean marriedStatus) {
		this.marriedStatus = marriedStatus;
	}

	public boolean isHaveLicense() {
		return haveLicense;
	}

	public void setHaveLicense(boolean haveLicense) {
		this.haveLicense = haveLicense;
	}

	/**
	 * Calculates insurance based on different scenarios.
	 */
	
	public int calculateInsurance() {
		int insurance = BASE_PREMIUM;
		
		if ((customerAge >= MAX_AGE) || (customerAge < MIN_AGE) || (haveLicense == false)) {
			insurance = -1;
			
		}
		else {
			
			if ((Character.toUpperCase(customerSex) == 'M') && (marriedStatus == false) && (customerAge <= 25) && (haveLicense=true)) {
				insurance += CASE_A;

			}
			
			if ((Character.toUpperCase(customerSex) == 'F') && (haveLicense == true) || (marriedStatus == true) && (haveLicense == true)) {
				insurance -= CASE_B;
				
			}
			
			if (((customerAge >= 45) && (haveLicense == true)) && ((customerAge <= 65) && (haveLicense == true))) {
				insurance -= CASE_C;
				
			} 
		}
		
		return insurance;
	}
	
}
