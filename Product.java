//check for how many time the product is sell

public class Product{
	String name;
	double price;
	int quantity ;
	static int totalSold;
	Product(String n,double p,int q,int t){
		name=n;
		price=p;
		quantity=q;
		totalSold=t;
	}
	void sell(int q) {
		if(quantity > q) {
		quantity-=q;
		totalSold+=1;
		}
		else {
			System.out.println("Not have enough quantity");
		}
	}
	static int getTotalSold() {
		return totalSold;
	}

	public static void main(String[] args) {
		Product p1=new Product("biscuit ",20.00,1000,0);
		p1.sell(100);
		p1.sell(300);
		p1.sell(400);
		System.out.println("Biscuit has total sell :"+getTotalSold());
		System.out.println("Remaining quantity = " + p1.quantity);

	}

}