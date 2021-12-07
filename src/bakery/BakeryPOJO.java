package bakery;
import java.util.List;
public class BakeryPOJO {

	public class Product {

		private String label;
		private String description;
		private int weight; // in grams
		private double price; // in euros
		private Size size; // enum: S, M, L, XL
		private Shape shape; // enum: RECTANGLE, SQUARE, CIRCLE, TOWER, STAR
		private List<String> ingredientList;

	}

	public enum Size {
		S, M, L, XL
	}

	public enum Shape {
		RECTANGLE, SQUARE, CIRCLE, TOWER, STAR
	}

	public class Customer {
		private int customerId;
		private String name;
		private String address;
		private String email;
		private boolean specialCustomer;

	}

	public class Cart {
		private List<Product> cartList;
		private int discount;
		private double total;
		private PaymentMethod paymentMethod;
	}

	public enum PaymentMethod {
		CARD, BANK_TRANSFER, PAYPAL
	}

	public class ProductCart {
		private int quantity;
		private Product product;
		private String deliveryNumber;
	}

}
