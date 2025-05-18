
package Actitvity;

import java.util.Comparator;

public class ASPVComparator implements Comparator<Itemvalue> {

	@Override
	public int compare(Itemvalue o1, Itemvalue o2) {
	
		return o1.getFinish() -o2.getFinish();
	
	}
	

}
