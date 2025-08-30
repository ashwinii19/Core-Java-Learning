package InventorySystem.model;

public class LIFOValuation implements IValuationStrategy{

	@Override
	public double calculate(Product product) {
		return product.getQuantity() * product.getPrice();
	}
}
