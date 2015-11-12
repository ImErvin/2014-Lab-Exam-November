package ITEmployee;

//Create an Abstract Class (Step 2)
public abstract class ITEmployee {
	
	//Variables from diagram (Step 2)
	protected String id;
	protected String name;
	protected double hourlyRate;
	protected double normalNumOfHours = 37.5;
	protected static double medicalCover;
	double salary; //(Step 3)
	double overtime; // (Step 4)
	
	//default constructor for BusinessAnalyst (Step 4)
	public ITEmployee(String id){
		this.id = id;
	}
	
	public ITEmployee(String name, double hourlyRate){
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	//ITEmployee constructor for all ITEmployees (Step 3)
	public ITEmployee (String id, String name, double hourlyRate){
		this.id = id;
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	//Abstract Method (Step 2)
	public abstract void calculateSalary(double hoursWorked);
	public abstract void display();
	
	//Non abstract method (Step 2)
	public static void setMedicalCover(double newMedicalCover){
		medicalCover = newMedicalCover;
	}
}
