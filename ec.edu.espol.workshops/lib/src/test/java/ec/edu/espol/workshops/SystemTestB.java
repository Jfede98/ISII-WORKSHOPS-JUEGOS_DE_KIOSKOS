package ec.edu.espol.workshops;

public class SystemTestB {
	
	public static void main (String [] args) {
		
		CarInsurance tc1 = new CarInsurance(18, 'M' , false, true);
		int ins1 = tc1.calculateInsurance();
		System.out.println("Test case: TC1\nResult: " + ins1 + "\n");
		
		CarInsurance tc2 = new CarInsurance(19, 'M' , false, true);
		int ins2 = tc2.calculateInsurance();
		System.out.println("Test case: TC2\nResult: " + ins2 + "\n");
		
		CarInsurance tc3 = new CarInsurance(24, 'M' , false, true);
		int ins3 = tc3.calculateInsurance();
		System.out.println("Test case: TC3\nResult: " + ins3 + "\n");
		
		CarInsurance tc4 = new CarInsurance(25, 'M' , false, true);
		int ins4 = tc4.calculateInsurance();
		System.out.println("Test case: TC4\nResult: " + ins4 + "\n");
		
		CarInsurance tc5 = new CarInsurance(26, 'M' , false, true);
		int ins5 = tc5.calculateInsurance();
		System.out.println("Test case: TC5\nResult: " + ins5 + "\n");
		
		CarInsurance tc6 = new CarInsurance(44, 'M' , false, true);
		int ins6 = tc6.calculateInsurance();
		System.out.println("Test case: TC6\nResult: " + ins6 + "\n");
		
		CarInsurance tc7 = new CarInsurance(45, 'M' , false, true);
		int ins7 = tc7.calculateInsurance();
		System.out.println("Test case: TC7\nResult: " + ins7 + "\n");
		
		CarInsurance tc8 = new CarInsurance(46, 'M' , false, true);
		int ins8 = tc8.calculateInsurance();
		System.out.println("Test case: TC8\nResult: " + ins8 + "\n");
		
		CarInsurance tc9 = new CarInsurance(64, 'M' , false, true);
		int ins9 = tc9.calculateInsurance();
		System.out.println("Test case: TC9\nResult: " + ins9 + "\n");
		
		CarInsurance tc10 = new CarInsurance(65, 'M' , false, true);
		int ins10 = tc10.calculateInsurance();
		System.out.println("Test case: TC10\nResult: " + ins10 + "\n");
		
		CarInsurance tc11 = new CarInsurance(66, 'M' , false, true);
		int ins11 = tc11.calculateInsurance();
		System.out.println("Test case: TC11\nResult: " + ins11 + "\n");
		
		CarInsurance tc12 = new CarInsurance(78, 'M' , false, true);
		int ins12 = tc12.calculateInsurance();
		System.out.println("Test case: TC12\nResult: " + ins12 + "\n");
		
		CarInsurance tc13 = new CarInsurance(79, 'M' , false, true);
		int ins13 = tc13.calculateInsurance();
		System.out.println("Test case: TC13\nResult: " + ins13 + "\n");  
		
		CarInsurance tc14 = new CarInsurance(18, 'F' , false, true);
		int ins14 = tc14.calculateInsurance();
		System.out.println("Test case: TC14\nResult: " + ins14 + "\n");
		
		CarInsurance tc15 = new CarInsurance(45, 'M' , true, true);
		int ins15 = tc15.calculateInsurance();
		System.out.println("Test case: TC15\nResult: " + ins15 + "\n");
		
		CarInsurance tc16 = new CarInsurance(17, 'M' , false, true);
		int ins16 = tc16.calculateInsurance();
		System.out.println("Test case: TC16\nResult: " + ins16 + "\n");
		
		CarInsurance tc17 = new CarInsurance(80, 'M' , false, true);
		int ins17 = tc17.calculateInsurance();
		System.out.println("Test case: TC17\nResult: " + ins17 + "\n");
		
	   /*CarInsurance tc18 = new CarInsurance(25, "Male" , false, true);        
		 int ins18 = tc18.calculateInsurance();        
		 System.out.println("Test case: TC18\nResult: " + ins18 + "\n");*/
		
		CarInsurance tc19 = new CarInsurance(25, 'O' , false, true);
		int ins19 = tc19.calculateInsurance();
		System.out.println("Test case: TC19\nResult: " + ins19 + "\n");
		
		 /*CarInsurance tc20 = new CarInsurance(25, 'M' , 1, true);        
		  int ins20 = tc20.calculateInsurance();        
		  System.out.println("Test case: TC20\nResult: " + ins20 + "\n");*/

		  /*CarInsurance tc21 = new CarInsurance(25, 'M' , null, true);        
		   int ins21 = tc21.calculateInsurance();        
		   System.out.println("Test case: TC21\nResult: " + ins21 + "\n");*/
		  
		 CarInsurance tc22 = new CarInsurance(25, 'M' , false, false);
		 int ins22 = tc22.calculateInsurance();
		 System.out.println("Test case: TC19\nResult: " + ins22 + "\n");
		  
		  /*CarInsurance tc23 = new CarInsurance(25, 'M' , false, "Yes");        
		   int ins23 = tc23.calculateInsurance();        
		   System.out.println("Test case: TC23\nResult: " + ins23 + "\n");*/
	}
}
