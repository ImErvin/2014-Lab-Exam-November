package ITEmployee;

//Create business analyst class (Step 4)
public class BusinessAnalyst extends ITEmployee{
	
	//Variable from diagram (Step 4)
	private int numHolidays;
	
	//include 2 constructors (Step 4)
	//default constructor (Step 4)
	public BusinessAnalyst(){
		super();
	}
	
	//include 2 constructors (Step 4)
	//consturctor using this. to refer to current object (Step 4)
	public BusinessAnalyst(String id, String name, double hourlyRate, int numHolidays){
		super(id, name, hourlyRate);
		this.numHolidays = numHolidays;
	}
	
	//Calculate salary (Step 4)
	@Override
	public void calculateSalary(double hoursWorked) {
		if (hoursWorked <= normalNumOfHours){
			salary = hoursWorked * hourlyRate;
		} else {
			salary = hoursWorked * hourlyRate;
			overtime = hoursWorked - 37.5;
			salary += overtime * (hourlyRate * 2);
		}
	}
	
	//Print details (Step 4)
	@Override
	public void display() {
		System.out.println("==================BU-ANALYST==================");
		System.out.printf
		("Employee ID: %s\nEmployee Name: %s\nEmployee Holidays: %d\nEmployee Weekly Salary: %.2f\nMedical Cover: %.2f"
		,id,name,numHolidays,salary,medicalCover);
		System.out.println("\n==============================================");
		
	}
	
	//Compare myWife and myHusband using equals method (Step 9)
	//P.S Thanks to Cian Hatton for the code below
	@Override
	public boolean equals(Object o){
		if (o instanceof BusinessAnalyst == false){
			return false;
		}
		BusinessAnalyst b1 = (BusinessAnalyst) o;
		BusinessAnalyst b2 = (BusinessAnalyst) this;
		
		if(b1.numHolidays == b2.numHolidays && b1.id.equals(b2.id)&&b1.name.equals(b2.name)
				&& b1.hourlyRate == b2.hourlyRate){
			return true;
		}
		return false;
	}
	
}
