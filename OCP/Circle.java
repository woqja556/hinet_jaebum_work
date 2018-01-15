package OCP;

public class Circle implements Figure {	//원 클래스

	public double radious;

    @Override
    public double calcualtor() {
        return radious * radious / 3.14;
    }
	
}
