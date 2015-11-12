package ITEmployee;

//Create final class (Step 3)					//Implement javacert (Step 5)
public final class Programmer extends ITEmployee implements JavaCertification{
	
	//Variable from diagram (Step 3)
	private int numHolidays;
	
	//Inherit id,name,hourlyRate from ITEmployee (Step 3)
	public Programmer(String id, String name, double hourlyRate, int numHolidays){
		super(id, name, hourlyRate);
		this.numHolidays = numHolidays;
	}
	
	@Override
	//Calculate Salary (Step 3)
	public void calculateSalary(double hoursWorked){
		if (hoursWorked <= normalNumOfHours){
			salary = hoursWorked * hourlyRate;
		} else {
			salary = hoursWorked * hourlyRate;
			overtime = hoursWorked - 37.5;
			salary += overtime * (hourlyRate * 2);
		}
	}
	
	@Override
	//Display details (Step 3)
	public void display(){
		System.out.println("==================PROGRAMMER==================");
		System.out.printf
		("Employee ID: %s\nEmployee Name: %s\nEmployee Holidays: %d\nEmployee Weekly Salary: %.2f\nMedical Cover: %.2f"
		,id,name,numHolidays,salary,medicalCover);
		System.out.println("\n==============================================");
	}
	
	//===================STEP 5===================
	@Override
	//Fee calculated at 0.02 of hourly rate (Step 5)
	public void payExamFee() {
		double fee;
		fee = hourlyRate * 0.02;
		System.out.printf("Java Certification fee of %.2f paid.", fee);
	}
	
	//Create object in class and use method payExamFee (Step 5)
	public static void main(String[] args) {
	Programmer feeney = new Programmer("999","Pay Feeney",999,999);
	feeney.payExamFee();		
	}
	//===========================================
}
