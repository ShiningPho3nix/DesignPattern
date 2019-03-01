package builderPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void addAllItems(Collection<Item> items) {
		items.addAll(items);
	}

	public float getTotalMealCost() {
		float result = 0.0f;
		for (Item item : items) {
			result += item.getPrice();
		}
		return result;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Item item : items) {
			sb.append("Item : " + item.getName() + ", Packing : " + item.getPacking().pack() + ", Price : "
					+ item.getPrice() + "\n");
		}
		return sb.toString();
	}
}
