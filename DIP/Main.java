package DIP;

public class Main {

	public static void main(String[] args) {
		Toy t = new Robot();
		Kid k = new Kid();
		k.setToy(t);
		k.play();
		
		Toy t2 = new Lego();	//���� �ڵ忡 ������ �����ʰ� �峭���� �ٲ�ġ�� �� �� �ִ�.
		k.setToy(t2);
		k.play();
	}

}
