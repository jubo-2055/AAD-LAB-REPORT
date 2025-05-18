
package KnapSack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KnapSackMain {
	public static double tot_profit=0;
	public static void calculate(ArrayList<KnapSackItem>Itemvalue,int n,int k) {
		
		for(int i=0;i<n;i++) {
			if(k-Itemvalue.get(i).getWeight()>=0) {
				k-=Itemvalue.get(i).getWeight();
				tot_profit+=Itemvalue.get(i).getProfit();
				System.out.println(k);
			}
			else {
				tot_profit+=(Itemvalue.get(i).getProfit()/Itemvalue.get(i).getWeight())*k;
				k=0;
			}
			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter how many item and knapsack weight:");
		int n,k;
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 k=sc.nextInt();
		 System.out.println("Enter item wight and profit:");
		 ArrayList<KnapSackItem>Itemvalue=new ArrayList<KnapSackItem>();
		 for(int i=0;i<n;i++) {
			 KnapSackItem ob=new KnapSackItem();
			 ob.setItem(i+1);
			 ob.setWeight(sc.nextInt());
			 ob.setProfit(sc.nextInt());
			 Itemvalue.add(ob);
		 }
		 Collections.sort(Itemvalue, new MyComparator());
		System.out.println("After sorting:");
		for(int i=0;i<n;i++)
			System.out.println(Itemvalue.get(i));
		calculate(Itemvalue,n,k);
		System.out.print("Maximum Profit = "+tot_profit);
		

	}

}
