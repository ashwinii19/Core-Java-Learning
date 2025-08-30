package InventorySystem.model;

public class FIFOValuation implements IValuationStrategy{

	@Override
	public double calculate(Product product) {
		return product.getQuantity() * product.getPrice();
	}

}
