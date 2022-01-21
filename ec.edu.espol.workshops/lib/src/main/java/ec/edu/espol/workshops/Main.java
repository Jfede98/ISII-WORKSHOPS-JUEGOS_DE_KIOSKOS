package ec.edu.espol.workshops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarInsurance c = new CarInsurance();
		
		//Example
		System.out.print(c.getPremium(
				"50", // Age
				"M", // Sex - 'M' or 'F'
				"false", // MaritalStatus
				"true")); // License

	}

}
