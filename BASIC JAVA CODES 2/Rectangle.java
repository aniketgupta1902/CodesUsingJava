package esg.itp.shape;

public class Rectangle implements Polygon {
float length;
float breadth;
float area;
float perimeter;
public Rectangle(int length,int breadth)
{ this.length=length;
this.breadth=breadth;
	}

public void calcArea() {
	
	area=length*breadth;
}


public void calcPeri() {
	
	perimeter=2*(length+breadth);
}

public void display() {
	System.out.println("Area is "+ area);
	System.out.println("perimeter is"+ perimeter);
}

}
