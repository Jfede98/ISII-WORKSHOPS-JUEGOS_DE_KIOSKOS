package ec.edu.espol.workshops;

import org.junit.Assert;
import org.junit.Test;

public class BranchCoverageTest {
	
	@Test
	 public void testCase7() {		 
		 CarInsurance carInsurance7 = new CarInsurance(67, 'M' , false, true);
		 int insurance = carInsurance7.calculateInsurance();
		 int expectedInsurance = 500;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	@Test
	 public void testCase8() {		 
		 CarInsurance carInsurance8 = new CarInsurance(23, 'M' , false, true);
		 int insurance = carInsurance8.calculateInsurance();
		 int expectedInsurance = 2000;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase9() {		 
		 CarInsurance carInsurance9 = new CarInsurance(16, 'F' , false, true);
		 int insurance = carInsurance9.calculateInsurance();
		 int expectedInsurance = -1;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase10() {		 
		 CarInsurance carInsurance10 = new CarInsurance(56, 'F' , true, true);
		 int insurance = carInsurance10.calculateInsurance();
		 int expectedInsurance = 200;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase11() {		 
		 CarInsurance carInsurance11 = new CarInsurance(35, 'F' , true, true);
		 int insurance = carInsurance11.calculateInsurance();
		 int expectedInsurance = 300;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	@Test
	 public void testCase12() {		 
		 CarInsurance carInsurance12 = new CarInsurance(48, 'M' , false, true);
		 int insurance = carInsurance12.calculateInsurance();
		 int expectedInsurance = 400;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	
}
