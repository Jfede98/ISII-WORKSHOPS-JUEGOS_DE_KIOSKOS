package ec.edu.espol.workshops;

public class EmpiricalTest {
	public static void main(String[] args)
    {
		 CarInsurance carInsuranceCase1 = new CarInsurance(35, 'F' , false, true);
		 int insurance1 = carInsuranceCase1.calculateInsurance();
		 System.out.println("First Test subject");
		 System.out.println(insurance1);
		 System.out.println("\n");
		 
		 CarInsurance carInsuranceCase2 = new CarInsurance(23, 'M' , false, true);
		 int insurance2 = carInsuranceCase2.calculateInsurance();
		 System.out.println("Second Test subject");
		 System.out.println(insurance2);
		 System.out.println("\n");
		 
		 CarInsurance carInsuranceCase3 = new CarInsurance(85, 'F' , true, true);
		 int insurance3 = carInsuranceCase3.calculateInsurance();
		 System.out.println("Third Test subject");
		 System.out.println(insurance3);
		 System.out.println("\n");
		 
		 CarInsurance carInsuranceCase4 = new CarInsurance(45, 'M' , true, false);
		 int insurance4 = carInsuranceCase4.calculateInsurance();
		 System.out.println("Fourth Test subject");
		 System.out.println(insurance4);
		 System.out.println("\n");
		 
		 CarInsurance carInsuranceCase5 = new CarInsurance(50, 'M' , false, true);
		 int insurance5 = carInsuranceCase5.calculateInsurance();
		 System.out.println("Fifth Test subject");
		 System.out.println(insurance5);
		 System.out.println("\n");
		 
		 CarInsurance carInsuranceCase6 = new CarInsurance(57, 'M' , true, true);
		 int insurance6 = carInsuranceCase6.calculateInsurance();
		 System.out.println("Sixth Test subject");
		 System.out.println(insurance6);
		 System.out.println("\n");
        
    }
}
