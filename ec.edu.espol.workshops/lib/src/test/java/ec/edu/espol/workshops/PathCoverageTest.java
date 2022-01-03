package ec.edu.espol.workshops;

import org.junit.Assert;
import org.junit.Test;

public class PathCoverageTest {

	@Test
	 public void testCase13() {		 
		 CarInsurance carInsurance13 = new CarInsurance(35, 'M' , false, true);
		 int insurance = carInsurance13.calculateInsurance();
		 int expectedInsurance = 500;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	@Test
	 public void testCase14() {		 
		 CarInsurance carInsurance14 = new CarInsurance(21, 'M' , false, true);
		 int insurance = carInsurance14.calculateInsurance();
		 int expectedInsurance = 2000;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase15() {		 
		 CarInsurance carInsurance15 = new CarInsurance(67, 'F' , true, false);
		 int insurance = carInsurance15.calculateInsurance();
		 int expectedInsurance = -1;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase16() {		 
		 CarInsurance carInsurance16 = new CarInsurance(50, 'M' , true, true);
		 int insurance = carInsurance16.calculateInsurance();
		 int expectedInsurance = 200;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase17() {		 
		 CarInsurance carInsurance17 = new CarInsurance(25, 'F' , true, true);
		 int insurance = carInsurance17.calculateInsurance();
		 int expectedInsurance = 300;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase18() {		 
		 CarInsurance carInsurance18 = new CarInsurance(53, 'M' , false, true);
		 int insurance = carInsurance18.calculateInsurance();
		 int expectedInsurance = 400;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
}
