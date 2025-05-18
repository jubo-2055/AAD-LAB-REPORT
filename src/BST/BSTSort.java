

package BST;

import java.util.Scanner;

public class BSTSort {
		public static BSTNode create(int item) {
			BSTNode root=new BSTNode();
			root.data=item;
			root.left=null;
			root.right=null;
			return root;
		}
		public static BSTNode Insert(BSTNode root,int item) {
			if(root==null)return create(item);
			if(root.data<item)
				root.right=Insert(root.right,item);
			else 
				root.left=Insert(root.left,item);
			return root;
		}
		public static void In_Order(BSTNode root) {
		   if(root==null)return;
		   In_Order(root.left);
		   System.out.print(root.data+" ");
		   In_Order(root.right);
		}

		public static void main(String[] args) {
			int n;
			Scanner sc=new  Scanner(System.in);
			System.out.println("Enter how many node");
			n=sc.nextInt();
			System.out.println("Enter item");
			BSTNode root=null;
			for(int i=0;i<n;i++) {
				int a=sc.nextInt();
				root=Insert(root,a);
			}
			System.out.println("After sorting");
			In_Order(root);
		}

	}


