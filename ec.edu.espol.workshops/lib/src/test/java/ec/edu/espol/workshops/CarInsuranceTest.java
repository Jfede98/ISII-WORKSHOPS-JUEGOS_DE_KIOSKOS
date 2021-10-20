package ec.edu.espol.workshops;

import org.junit.Assert;

import org.junit.Test;

/*
 *Class for testing CarInsurance class. 
 * */

public class CarInsuranceTest {

	 @Test
	 public void calculateInsuranceCaseATest() {
		 CarInsurance carInsuranceCaseA = new CarInsurance(21, 'M' , false);
		 int insurance = carInsuranceCaseA.calculateInsurance();
		 int expectedInsurance = 2000;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 @Test
	 public void calculateInsuranceCaseBTest() {
		 CarInsurance carInsuranceCaseB = new CarInsurance(21, 'F' , false);
		 int insurance = carInsuranceCaseB.calculateInsurance();
		 int expectedInsurance = 300;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 @Test
	 public void calculateInsuranceCaseCTest() {
		 CarInsurance carInsuranceCaseC = new CarInsurance(50, 'M' , false);
		 int insurance = carInsuranceCaseC.calculateInsurance();
		 int expectedInsurance = 400;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	 
	 @Test
	 public void carInsuranceAgeException(){
		 
		 Assert.assertThrows(IllegalArgumentException.class, () -> {
			 
			new CarInsurance(85, 'F', true);
			 
		 });
		 
	 }
	
}
