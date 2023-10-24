package esg.itp.shape;

public class Square implements Polygon {
	float side;
	float area;
	float perimeter;
	public Square(int side)
	{
		this.side=side;
	}
	
	public void calcArea() {

	area=side*side;
	}
	public void calcPeri(){

		perimeter=4*side;
	}

	public void display(){
		System.out.println("Area is "+ area);
		System.out.println("perimeter is"+ perimeter);
	}

}
