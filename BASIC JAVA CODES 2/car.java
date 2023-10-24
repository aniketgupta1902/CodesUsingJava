package abcd;

public class car {
  double speed;
   int no_of_gear;
   
   public void drive(double speed,int no_of_gear)
   { 
	   this.speed=speed;
	   this.no_of_gear=no_of_gear;
   }
   public void display()
   {
System.out.println(this.speed);
System.out.println(this.no_of_gear);
   
   }
   }
