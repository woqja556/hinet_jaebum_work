package Not_OCP;

public class Calculation {	//���� Ŭ����(������ �߰��Ǹ� ���� Ŭ������ �����ؾ���) ==> OCP ����
	  public double calculationCircle(Circle circle){

	        return circle.radious * circle.radious / 3.14;

	    }

	    public double calculationRectangle(Rectangle rectangle){

	        return rectangle.width * rectangle.length;

	    }
}
