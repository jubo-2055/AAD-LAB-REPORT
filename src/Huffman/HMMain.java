
package Huffman;


import java.util.PriorityQueue;
import java.util.Scanner;

public class HMMain {
	public static int cur=0;
	public static void Print_Code(HMNode root,String c) {
		if(root.left==null&&root.right==null&&Character.isLetter(root.s.charAt(0))) {
			System.out.println(root.s+" = "+c);
			cur+=c.length()*root.data;
			return;
		}
		Print_Code(root.left,c+"0");
		Print_Code(root.right,c+"1");
	}

	public static void main(String[] args) {
		
         System.out.println("Enter how many item:");
         int n;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         int prv=0;
         PriorityQueue<HMNode>q=new PriorityQueue<HMNode>(new HMComparator() );
         System.out.println("Enter character and freq.");
         for(int i=0;i<n;i++) {
        	 HMNode ob=new HMNode();
        	 ob.s=sc.next();
        	 ob.data=sc.nextInt();
        	 ob.left=null;
        	 ob.right=null;
        	 prv+=ob.data;
        	 q.add(ob);
         }
         HMNode root=null;
           while(q.size()>1) {
        	  HMNode a=q.peek();
        	   q.poll();
        	  HMNode b=q.peek();
        	   q.poll();
        	   HMNode f= new HMNode();
        	   f.s=" ";
        	   f.data=a.data+b.data;
        	   f.left=a;
        	   f.right=b;
        	   root=f;
        	   q.add(f);
           }
         System.out.println("Previous Required bit:"+prv*8);
         Print_Code(root,"");
         System.out.println("Now Required bit:"+cur);
         System.out.println("Bit Saved:"+(1.00*(prv*8 - cur)/(prv*8))*100+"%");
	}

}
