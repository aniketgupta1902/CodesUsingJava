package ques11;
import esg.itp.shape.*;
public class main {

	public static void main(String[] args) {
		Square s1=new Square(7);
		s1.calcArea();
		s1.calcPeri();
		s1.display();
		Rectangle r1=new Rectangle (7,8);
		r1.calcArea();
		r1.calcPeri();
		r1.display();
	}

}
