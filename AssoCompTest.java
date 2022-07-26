
public class AssoCompTest {
	public static void main(String[] args) {
		
		
		
		Shop s=new Shop("D-MART", "Grocery");
		Product p1 = new Product("DMART", "GROCERY", "102", "SUGAR", 12.0F );
//		p1.printProduct();
		
		Billing b1 = new Billing(2, p1);
		b1.printBilling();
	}
}


class Shop
{
	String shopName;
	String department;
	public Shop(String shopName, String department) {
		super();
		this.shopName = shopName;
		this.department = department;
	}
	
	void printShop() {
		System.out.println("---------SHOP INFO-------");
		System.out.println("shop name is  : "+shopName);
		System.out.println("department is :"+department);
		System.out.println("--------------------------");
	}
}


class Product extends Shop
{
	String productId;
	String pName;
	Float price;
//	Billing billing;
	
	public Product(String shopName, String department,String productId, String pName, float price) {
		super(shopName, department);
		this.productId = productId;
		this.pName = pName;
		this.price = price;
//		this.billing=billing;
	}
	
	void printProduct() {
		super.printShop();
		System.out.println("--------PRODUCT DETAILS------");
		System.out.println("Product id is      : "+productId);
		System.out.println("Product name is    :"+pName);
		System.out.println("Price of product is:"+price);
		System.out.println("--------------------------");
//		billing.printBilling();
	}
}

class Billing 
{
	int quantity;
	float total;
	Product product;
	
	public Billing(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.total=product.price*quantity ;
	}
	

	void printBilling() {
		System.out.println("----------------------");
		product.printProduct();
		System.out.println("--------BILLING------");
		System.out.println("Quantity is      : "+quantity);
		System.out.println("total is         :"+total);
		System.out.println("--------------------------");
		
	}


	
}
