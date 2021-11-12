package ec.edu.espol.workshops;

public class SystemTest {

	public static void main(String[] args) {
		
		CarInsurance testCase1 = new CarInsurance(20, 'M' , false, true);
		int insurance1 = testCase1.calculateInsurance();
		System.out.println("Test case: TC1\nResult: " + insurance1 + "\n");
		
		CarInsurance testCase2 = new CarInsurance(26, 'M' , false, true);
		int insurance2 = testCase2.calculateInsurance();
		System.out.println("Test case: TC2\nResult: " + insurance2 + "\n");
		
		CarInsurance testCase3 = new CarInsurance(18, 'F' , false, true);
		int insurance3 = testCase3.calculateInsurance();
		System.out.println("Test case: TC3\nResult: " + insurance3 + "\n");
		
		CarInsurance testCase4 = new CarInsurance(50, 'F' , true, true);
		int insurance4 = testCase4.calculateInsurance();
		System.out.println("Test case: TC4\nResult: " + insurance4 + "\n");
		
		CarInsurance testCase5 = new CarInsurance(50, 'M' , false, true);
		int insurance5 = testCase5.calculateInsurance();
		System.out.println("Test case: TC5\nResult: " + insurance5 + "\n");
		
		CarInsurance testCase6 = new CarInsurance(17, 'M' , false, true);
		int insurance6 = testCase6.calculateInsurance();
		System.out.println("Test case: TC6\nResult: " + insurance6 + "\n");
		
		CarInsurance testCase7 = new CarInsurance(83, 'M' , false, true);
		int insurance7 = testCase7.calculateInsurance();
		System.out.println("Test case: TC7\nResult: " + insurance7 + "\n");
		
		CarInsurance testCase8 = new CarInsurance(-1, 'M' , false, true);
		int insurance8 = testCase8.calculateInsurance();
		System.out.println("Test case: TC8\nResult: " + insurance8 + "\n");
		
		CarInsurance testCase9 = new CarInsurance(20, 'O' , false, true);
		int insurance9 = testCase9.calculateInsurance();
		System.out.println("Test case: TC9\nResult: " + insurance9 + "\n");
		
		CarInsurance testCase10 = new CarInsurance(20, 'M' , false, false);
		int insurance10 = testCase10.calculateInsurance();
		System.out.println("Test case: TC10\nResult: " + insurance10 + "\n");
		


	}

}
