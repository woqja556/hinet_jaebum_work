package Not_OCP;

public class Calculation {	//계산식 클래스(도형이 추가되면 계산식 클래스도 수정해야함) ==> OCP 위반
	  public double calculationCircle(Circle circle){

	        return circle.radious * circle.radious / 3.14;

	    }

	    public double calculationRectangle(Rectangle rectangle){

	        return rectangle.width * rectangle.length;

	    }
}
