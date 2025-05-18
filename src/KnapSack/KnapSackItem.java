
package KnapSack;

public class KnapSackItem {
	private int item, weight,profit;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	@Override
	public String toString() {
		return "KnapItem [item=" + item + ", weight=" + weight + ", profit=" + profit + "]";
	}


}
