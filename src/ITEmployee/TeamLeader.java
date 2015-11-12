package ITEmployee;

//Create TeamLeader class (Step 6)
public class TeamLeader extends ITEmployee{

	//Variable from diagram (Step 6)
	private double bonus;
	
	//Include constructor (Step 6)
	public TeamLeader(String name, double hourlyRate, double bonus){
		super(name, hourlyRate);
		this.bonus = bonus;
	}
	
	//Calculate Salary for object (Step 6)
	@Override
	public void calculateSalary(double hoursWorked) {
		if (hoursWorked <= normalNumOfHours){
			salary = hoursWorked * hourlyRate;
		} else {
			salary = hoursWorked * hourlyRate;
			overtime = hoursWorked - 37.5;
			//Overtime is 1.5 instead of 2 for teamleaders
			salary += overtime * (hourlyRate * 1.5);
		}
	}

	//Print details of object (Step 6)
	@Override
	public void display() {
		System.out.println("==================TEAMLEADER==================");
		System.out.printf
		("Employee Name: %s\nEmployee Salary: %.2f\nEmployee Bonus %.2f"
		,name,salary,bonus);
		System.out.println("\n==============================================");
		
	}

	//Diagram shows getters and setters (Step 6)
	//Getters and Setters
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		//Set bonus to 1000 (Step 6)
		this.bonus = 1000;
	}
	
}
