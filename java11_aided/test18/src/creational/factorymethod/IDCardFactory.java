package creational.factorymethod;

import java.awt.List;
import java.util.ArrayList;

public class IDCardFactory extends Factory {
	private ArrayList owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		owners.add(((IDCard) p).getOwner());
	}

	public ArrayList getOwners() {
		return owners;
	}
	
}
