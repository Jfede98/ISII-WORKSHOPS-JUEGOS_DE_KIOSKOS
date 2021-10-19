package ec.edu.espol.workshops;

import org.junit.Assert;

import org.junit.Test;

/** 
*
*
* @author Julian & Gabriela 
*/

public class CarInsuranceTest {
	/*This class tests the CarInsurance class*/
	
	 @Test
	 public void calculateInsuranceCaseATest() {
		 /*Testing Case A scenario: Male, not married and under 25*/
		 
		 CarInsurance carInsuranceCaseA = new CarInsurance(21, 'M' , false);
		 int insurance = carInsuranceCaseA.calculateInsurance();
		 int expectedInsurance = 2000;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 @Test
	 public void calculateInsuranceCaseBTest() {
		 /*Testing Case B scenario: Female or married*/
		 
		 CarInsurance carInsuranceCaseB = new CarInsurance(21, 'F' , false);
		 int insurance = carInsuranceCaseB.calculateInsurance();
		 int expectedInsurance = 300;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 @Test
	 public void calculateInsuranceCaseCTest() {
		 /*Testing Case C scenario: Between ages 45 and 65*/
		 
		 CarInsurance carInsuranceCaseC = new CarInsurance(50, 'M' , false);
		 int insurance = carInsuranceCaseC.calculateInsurance();
		 int expectedInsurance = 400;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 @Test
	 public void carInsuranceAgeException(){
		 /*Testing IllegalArgumentException: Customer older than 80 years old*/
		 
		 Assert.assertThrows(IllegalArgumentException.class, () -> {
			 
			new CarInsurance(85, 'F', true);
			 
		 });
		 
	 }
	
}
