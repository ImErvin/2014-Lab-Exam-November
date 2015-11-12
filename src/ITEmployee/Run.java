package ITEmployee;

//this will run
public class Run{
	public static void main(String[] args) {
		//Create object joe (Step 3)
		Programmer joe = new Programmer("003","JoeSmith",150,20);
		//Calculate joes salary for 37.5 hours worked (Step 3)
		joe.calculateSalary(37.5);
		//Display joes information (Step 3)
		joe.display();
		
		//Create object mary (Step 4)
		BusinessAnalyst mary = new BusinessAnalyst("212","MaryKelly",100,5);
		//Calculate salary for 37.5 + 5 hours overtime (Step 4)
		mary.calculateSalary(42.5);
		//Display mary's information (Step 4)
		mary.display();
		
		//Create object jill (Step 6)
		TeamLeader jill = new TeamLeader("JillLynch",180,1000);
		//Calculate salary for 37.5 + 10 hours overtime @ 1.5 the hourly rate (Step 6)
		jill.calculateSalary(47.5);
		//Display jill's information (Step 6)
		jill.display();
		
		//demonstrate polymorphism, create teamleader carl (Step 7)
		ITEmployee carl = new TeamLeader("Carl Flaherty",800,1000);
		
		//Set medicalcover to 2000 (Step 8)
		TeamLeader.setMedicalCover(2000);
		
		//Create 2 objects jack and sean and show that medical cover is equal (Step 8)
		ITEmployee jack = new Programmer("542","Jack Chan",150,20);
		jack.display();
		ITEmployee sean = new BusinessAnalyst("323","Sean Goldberg",10,0);
		sean.display();
		
		//Create myWife and myHusband with same arguments (Step 9)
		BusinessAnalyst myWife = new BusinessAnalyst("303", "LOL", 123, 0);
		BusinessAnalyst myHusband = new BusinessAnalyst("303", "LOL", 123, 0);

		//Compare myWife and myHusband using equals method (Step 9)
		System.out.println(myWife.equals(myHusband));
		
		//If number of hours over 100 throw a SalaryException (Step 10)
		//Can't get step 10 to work
		/*try{
			joe.calculateSalary(101);
		} catch (SalaryException ex){
			System.out.println("You cannot work more than 100 hours.");
		}*/
		
		
	}
}
