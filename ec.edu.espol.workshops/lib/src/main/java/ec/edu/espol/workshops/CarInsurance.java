package ec.edu.espol.workshops;

public class CarInsurance {
	int BASE_PREMIUM = 500;
	int MAX_AGE = 80;
	int CASE_A = 1500; /*Add male and not married and under 25*/
	int CASE_B = 200;  /*Subtract female or married*/
	int CASE_C = 100;  /*Subtract between 45 and 65*/
	
	private int customerAge;
	private char customerSex;
	private boolean customerMarried;
	private String customerID;
	
}
