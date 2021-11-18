package ec.edu.espol.workshops;

public class SystemTestB {
	
	public static void main (String [] args) {
		
		CarInsurance tc1 = new CarInsurance();
        int ins1 =  tc1.getPremium("18", "M", "false", "true");
        System.out.println("Test case: TC1\nResult: " + ins1 + "\n");
		
        CarInsurance tc2 = new CarInsurance();
        int ins2 = tc2.getPremium("19", "M" , "false", "true");
        System.out.println("Test case: TC2\nResult: " + ins2 + "\n");
        
        CarInsurance tc3 = new CarInsurance();
        int ins3 = tc3.getPremium("23", "M" , "false", "true");
        System.out.println("Test case: TC3\nResult: " + ins3 + "\n");
        
        CarInsurance tc4 = new CarInsurance();
        int ins4 = tc4.getPremium("24", "M" , "false", "true");
        System.out.println("Test case: TC4\nResult: " + ins4 + "\n");
		
        CarInsurance tc5 = new CarInsurance();
        int ins5 = tc5.getPremium("25", "M" , "false", "true");
        System.out.println("Test case: TC5\nResult: " + ins5 + "\n");
		
        CarInsurance tc6 = new CarInsurance();
        int ins6 = tc6.getPremium("26", "M" , "false", "true");
        System.out.println("Test case: TC6\nResult: " + ins6 + "\n");

        CarInsurance tc7 = new CarInsurance();
        int ins7 = tc7.getPremium("43", "M" , "false", "true");
        System.out.println("Test case: TC7\nResult: " + ins7 + "\n");
        
        CarInsurance tc8 = new CarInsurance();
        int ins8 = tc8.getPremium("44", "M" , "false", "true");
        System.out.println("Test case: TC8\nResult: " + ins8 + "\n");
        
        CarInsurance tc9 = new CarInsurance();
        int ins9 = tc9.getPremium("45","M" , "false", "true");
        System.out.println("Test case: TC9\nResult: " + ins9 + "\n");

        CarInsurance tc10 = new CarInsurance();
        int ins10 = tc10.getPremium("46", "M" , "false", "true");
        System.out.println("Test case: TC10\nResult: " + ins10 + "\n");
        
        CarInsurance tc11 = new CarInsurance();
        int ins11 = tc11.getPremium("63", "M" , "false", "true");
        System.out.println("Test case: TC11\nResult: " + ins11 + "\n");
        
        CarInsurance tc12 = new CarInsurance();
        int ins12 = tc12.getPremium("64", "M" , "false", "true");
        System.out.println("Test case: TC12\nResult: " + ins12 + "\n");

        CarInsurance tc13 = new CarInsurance();
        int ins13 = tc13.getPremium("65", "M" , "false", "true");
        System.out.println("Test case: TC13\nResult: " + ins13 + "\n");

        CarInsurance tc14 = new CarInsurance();
        int ins14 = tc14.getPremium("66", "M" , "false", "true");
        System.out.println("Test case: TC14\nResult: " + ins14 + "\n");

        CarInsurance tc15 = new CarInsurance();
        int ins15 = tc15.getPremium("78", "M" , "false", "true");
        System.out.println("Test case: TC15\nResult: " + ins15 + "\n");
		
        CarInsurance tc16 = new CarInsurance();
        int ins16 = tc16.getPremium("79", "M" , "false", "true");
        System.out.println("Test case: TC16\nResult: " + ins16 + "\n");

        CarInsurance tc17 = new CarInsurance();
        int ins17 = tc17.getPremium("18", "F" , "false", "true");
        System.out.println("Test case: TC17\nResult: " + ins17 + "\n");

        CarInsurance tc18 = new CarInsurance();
        int ins18 = tc18.getPremium("45", "M" , "true", "true");
        System.out.println("Test case: TC18\nResult: " + ins18 + "\n");

        CarInsurance tc19 = new CarInsurance();
        int ins19 = tc19.getPremium("17", "M" , "false", "true");
        System.out.println("Test case: TC19\nResult: " + ins19 + "\n");

        CarInsurance tc20 = new CarInsurance();
        int ins20 = tc20.getPremium("80", "M" , "false", "true");
        System.out.println("Test case: TC20\nResult: " + ins20 + "\n");

        CarInsurance tc21 = new CarInsurance();
        int ins21 = tc21.getPremium("25", "Male" , "false", "true");
        System.out.println("Test case: TC21\nResult: " + ins21 + "\n");

        CarInsurance tc22 = new CarInsurance();
        int ins22 = tc22.getPremium("25", "O" , "false", "true");
        System.out.println("Test case: TC22\nResult: " + ins22 + "\n");

        CarInsurance tc23 = new CarInsurance();
        int ins23 = tc23.getPremium("25", "M" , "1", "true");
        System.out.println("Test case: TC23\nResult: " + ins23 + "\n");

        CarInsurance tc24 = new CarInsurance();
        int ins24 = tc24.getPremium("25", "M" , "null", "true");
        System.out.println("Test case: TC24\nResult: " + ins24 + "\n");

        CarInsurance tc25 = new CarInsurance();
        int ins25 = tc25.getPremium("25", "M" , "false", "false");
        System.out.println("Test case: TC25\nResult: " + ins25 + "\n");

        CarInsurance tc26 = new CarInsurance();
        int ins26 = tc26.getPremium("25", "M" , "false", "Yes");
        System.out.println("Test case: TC26\nResult: " + ins26 + "\n");
	}
}
