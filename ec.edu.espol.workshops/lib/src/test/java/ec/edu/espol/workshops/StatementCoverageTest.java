package ec.edu.espol.workshops;

import org.junit.Assert;
import org.junit.Test;

public class StatementCoverageTest {
	
	@Test
	 public void testCase1() {		 
		 CarInsurance carInsurance1 = new CarInsurance(70, 'M' , false, true);
		 int insurance = carInsurance1.calculateInsurance();
		 int expectedInsurance = 500;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	@Test
	 public void testCase2() {		 
		 CarInsurance carInsurance2 = new CarInsurance(25, 'M' , false, true);
		 int insurance = carInsurance2.calculateInsurance();
		 int expectedInsurance = 2000;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	@Test
	 public void testCase3() {		 
		 CarInsurance carInsurance3 = new CarInsurance(90, 'M' , false, false);
		 int insurance = carInsurance3.calculateInsurance();
		 int expectedInsurance = -1;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	@Test
	 public void testCase4() {		 
		 CarInsurance carInsurance4 = new CarInsurance(45, 'F' , false, true);
		 int insurance = carInsurance4.calculateInsurance();
		 int expectedInsurance = 200;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	@Test
	 public void testCase5() {		 
		 CarInsurance carInsurance5 = new CarInsurance(20, 'M' , true, true);
		 int insurance = carInsurance5.calculateInsurance();
		 int expectedInsurance = 300;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }
	
	@Test
	 public void testCase6() {		 
		 CarInsurance carInsurance6 = new CarInsurance(50, 'M' , false, true);
		 int insurance = carInsurance6.calculateInsurance();
		 int expectedInsurance = 400;
		 Assert.assertEquals(insurance, expectedInsurance, 0);
	 }

}
