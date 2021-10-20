package ec.edu.espol.workshops;

public class CarInsurance {
	int BASE_PREMIUM = 500;
	int MAX_AGE = 80;
	int MIN_AGE = 18;
	int CASE_A = 1500; /*Add male and not married and under 25*/
	int CASE_B = 200;  /*Subtract female or married*/
	int CASE_C = 100;  /*Subtract between 45 and 65*/
	
	private int customerAge;
	private char customerSex;
	private boolean isCustomerMarried;
	
	public CarInsurance(int customerAge, char customerSex, boolean isCustomerMarried) {
		
		if ((customerAge >= MAX_AGE) || (customerAge < MIN_AGE)) {
			throw new IllegalArgumentException("Age not valid");
		}
		
		this.customerAge = customerAge;
		
		if ((Character.toUpperCase(customerSex) != 'M') && (Character.toUpperCase(customerSex) != 'F') ) {
			throw new IllegalArgumentException("Sex not valid");
		}
		
		this.customerSex = customerSex;
		
		this.isCustomerMarried = isCustomerMarried;		
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
	
	public boolean isCustomerMarried() {
		return isCustomerMarried;
	}
	
	public void setisCustomerMarried(boolean isCustomerMarried) {
		this.isCustomerMarried = isCustomerMarried;
	}
	
	public int calculateInsurance() {
		int insurance = BASE_PREMIUM;
		
		if ((Character.toUpperCase(customerSex) == 'M') && (isCustomerMarried == false) && (customerAge <= 25)) {
			insurance += CASE_A;
		}
		else if ((Character.toUpperCase(customerSex) == 'F') || (isCustomerMarried == true)) {
			insurance -= CASE_B;
		}
		else if ((customerAge >= 45) && (customerAge <= 65)) {
			insurance -= CASE_C;
		}
		
		return insurance;
	}
	
	
	
}
