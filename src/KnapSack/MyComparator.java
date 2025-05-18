package KnapSack;

import java.util.Comparator;

public class MyComparator implements Comparator<KnapSackItem>{

	@Override
	public int compare(KnapSackItem o1, KnapSackItem o2) {
		
		double cmp1=o1.getProfit()/o1.getWeight();
		double cmp2=o2.getProfit()/o2.getWeight();
		return (int)(cmp2-cmp1);
	}
	

}