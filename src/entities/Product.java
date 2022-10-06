package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInstock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeproducts(int quantity) {
		this.quantity -= quantity;
	}
}