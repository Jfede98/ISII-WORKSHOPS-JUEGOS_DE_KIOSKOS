package ec.edu.espol.workshops;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class for testing CarInsurance class.
 * @author Julian & Gabriela 
 */

public class CarInsuranceTest {
	
	/*This class tests the CarInsurance class*/
	@Test 
	public void calculateInsuranceTC1() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("20", "M" , "false", "true");
		int expectedInsurance = 2000;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC2() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("26", "M" , "false", "true");
		int expectedInsurance = 500;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC3() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("50", "M" , "false", "true");
		int expectedInsurance = 400;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC4() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("50", "M" , "true", "true");
		int expectedInsurance = 100;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC5() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("18", "F" , "false", "true");
		int expectedInsurance = 300;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC6() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("31", "F" , "true", "true");
		int expectedInsurance = 200;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC7() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("61", "F" , "false", "true");
		int expectedInsurance = 150;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC8() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("17", "F" , "true", "true");
		int expectedInsurance = -1;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC9() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("83", "M" , "true", "true");
		int expectedInsurance = -1;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC10() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("-1", "M" , "true", "true");
		int expectedInsurance = -1;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC11() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("27", "O" , "true", "true");
		int expectedInsurance = -1;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
	@Test 
	public void calculateInsuranceTC12() {
		
		CarInsurance tc = new CarInsurance();
		int insurance = tc.getPremium("83", "F" , "true", "false");
		int expectedInsurance = -1;
		Assert.assertEquals(insurance, expectedInsurance, 0);
		
	}
	
}
