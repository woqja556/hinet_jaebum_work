package DIP;

public class Main {

	public static void main(String[] args) {
		Toy t = new Robot();
		Kid k = new Kid();
		k.setToy(t);
		k.play();
		
		Toy t2 = new Lego();	//기존 코드에 영향을 받지않고 장난감만 바꿔치기 할 수 있다.
		k.setToy(t2);
		k.play();
	}

}
