package LSP;

public class DiscountedBag extends Bag {	//Bag를 상속받으면서 기존기능은 변경하지않으면서 새로운 기능만 추가되었다.
	private double discountedRate = 0;
	
	public void setDiscounted(double discountedRate) {
		this.discountedRate = discountedRate;
	}
	
	public void applyDiscount(int price) {
		super.setPrice(price - (int)(discountedRate * price));
	}
}
