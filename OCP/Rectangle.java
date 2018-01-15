package OCP;

public class Rectangle implements Figure {	//사각형 클래스

	 public double width;
	 public double length;


	 @Override
	 public double calcualtor() {
	     return width * length;
	 }

}
