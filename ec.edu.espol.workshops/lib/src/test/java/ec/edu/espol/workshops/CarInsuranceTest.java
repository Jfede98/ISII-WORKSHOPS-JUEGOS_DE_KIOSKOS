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
	
	 /**
	  * Testing Case A scenario: Male, not married and under 25
	  */
	
	 @Test
	 public void calculateInsuranceCaseATest() {		 
		 CarInsurance carInsuranceCaseA = new CarInsurance(21, 'M' , false);
		 int insurance = carInsuranceCaseA.calculateInsurance();
		 int expectedInsurance = 2000;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 /**
	  * Testing Case B scenario: Female or married
	  */
	 
	 @Test
	 public void calculateInsuranceCaseBTest() {
		 CarInsurance carInsuranceCaseB = new CarInsurance(21, 'F' , false);
		 int insurance = carInsuranceCaseB.calculateInsurance();
		 int expectedInsurance = 300;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 /**
	  * Testing Case C scenario: Between ages 45 and 65
	  */
	 
	 @Test
	 public void calculateInsuranceCaseCTest() {
		 CarInsurance carInsuranceCaseC = new CarInsurance(50, 'M' , false);
		 int insurance = carInsuranceCaseC.calculateInsurance();
		 int expectedInsurance = 400;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 /**
	  * Testing IllegalArgumentException: Customer older than 80 years old
	  */
	 
	 @Test
	 public void carInsuranceAgeException(){
		 Assert.assertThrows(IllegalArgumentException.class, () -> {
			 
			new CarInsurance(85, 'F', true);
			 
		 });
		 
	 }
	
}
