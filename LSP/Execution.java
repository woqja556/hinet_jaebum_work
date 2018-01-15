package LSP;

public class Execution {

	public static void main(String[] args) {
		Bag b1 = new Bag();
		Bag b2 = new Bag();
		
		DiscountedBag b3 = new DiscountedBag();
		DiscountedBag b4 = new DiscountedBag();
		
		b1.setPrice(50000);
		System.out.println(b1.getPrice());
		b3.setPrice(50000);
		System.out.println(b3.getPrice());
		b2.setPrice(50000);
		System.out.println(b2.getPrice());
		b4.setPrice(50000);
		System.out.println(b4.getPrice());
	}
//Bag와 DiscountedBag의 실행결과가 동일하므로 LSP를 위반하지 않는다.
}
