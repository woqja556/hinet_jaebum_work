package LSP;

public class DiscountedBag extends Bag {	//Bag�� ��ӹ����鼭 ��������� �������������鼭 ���ο� ��ɸ� �߰��Ǿ���.
	private double discountedRate = 0;
	
	public void setDiscounted(double discountedRate) {
		this.discountedRate = discountedRate;
	}
	
	public void applyDiscount(int price) {
		super.setPrice(price - (int)(discountedRate * price));
	}
}
