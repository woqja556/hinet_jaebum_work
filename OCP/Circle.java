package OCP;

public class Circle implements Figure {	//�� Ŭ����

	public double radious;

    @Override
    public double calcualtor() {
        return radious * radious / 3.14;
    }
	
}
