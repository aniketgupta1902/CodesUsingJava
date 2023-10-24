package abcd;

public class SportsCar extends car {
  int airballon;
  
	public void drive(double speed,int no_of_gear,int airballon)
	{	super.drive(speed, no_of_gear);
		this.airballon = airballon;
	}
	public void display()
	{
		super.display();
		System.out.println("Airballon"+airballon);
		
	}
}