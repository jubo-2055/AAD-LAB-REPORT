package Actitvity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ASPMain {
	public static void calculate(ArrayList<Itemvalue>Itemvalues,int n) {
		System.out.print(Itemvalues.get(0).getS());
		int prv=Itemvalues.get(0).getFinish();
		for(int i=1;i<n;i++) {
			if(prv<=Itemvalues.get(i).getStart()) {
				System.out.print("->"+Itemvalues.get(i).getS());
				prv=Itemvalues.get(i).getFinish();
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter how many activity:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Itemvalue>Itemvalues= new ArrayList<Itemvalue>();
		System.err.println("Enter activity with their starting and finishig time:");
        for(int i=0;i<n;i++) {
        	Itemvalue ob=new Itemvalue();
        	String s=sc.next();
        	int st=sc.nextInt();
        	int st1=sc.nextInt();
        	ob.setS(s);
        	ob.setStart(st);
        	ob.setFinish(st1);
        	Itemvalues.add(ob);
        }
        Collections.sort(Itemvalues, new ASPVComparator());
        
        for(int i=0;i<n;i++) {
        	System.out.println(Itemvalues.get(i));
        }
        System.out.print("Activity print like: ");
        calculate(Itemvalues,n);
        	
	}

}