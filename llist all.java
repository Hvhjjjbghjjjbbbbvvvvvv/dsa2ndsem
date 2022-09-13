package SingleLinkedList;
import java.util.*;
class node{
	int info;
	node next;
}
public class Rudra {
	public static node start=null;
	static Scanner sc=new Scanner(System.in);
	
	public static void create(node p) {
		p=new node();
		System.out.println("Enter the value for node");
		p.info=sc.nextInt();
		p.next=null;
		start=p;
		System.out.println("If uwant to create node Y/N");
		char s=sc.next().charAt(0);
		while(s!='n') {
			node q=new node();
			System.out.println("Enter the value for node");
			q.info=sc.nextInt();
			q.next=null;
			p.next=q;
			p=q;
			System.out.println("if you want to add node Y/N ");
			s=sc.next().charAt(0);
		}}
	public static void display(node p) {
		while(p!=null) {
			System.out.println(p.info+"------>");
			p=p.next;
		}}
	public static void add_beg(node p) {
		node q=new node();
		System.out.println("Enter the value for node");
		q.info=sc.nextInt();
		q.next=null;
		q.next=start;
		start=q;
		}
	public static void add_end(node p){
		node q=new node();
		System.out.println("Enter the value for node");
		q.info=sc.nextInt();
		q.next=null;
		while(p.next!=null) {
			p=p.next;
		}
		p.next=q;
	}
	public static void delete_beg(node p) {
		p=p.next;
		start=p;
	}
		public static void delete_end(node p) {
		node s=null;
		while(p.next!=null) {
			s=p;
			p=p.next;
		}
		s.next=null;
	}
		public static void insert_any_loc(node p) {
		int count=0;
		node w=p;
		while (w!=null) {
			count++;
			w=w.next;
		}
		System.out.println("Enter the loc u want to add");
		int loc=sc.nextInt();
		node q=new node();
		System.out.println("Enter the value for node");
		q.info=sc.nextInt();
		q.next=null;
		if(loc>count) {
			System.out.println("Invalid loc");
		}
		else if(loc==1) {
			q.next=p;
			start=q;
		}
		else {
			int c=1;
			node s=p;
			while(c<loc) {
				s=p;
				p=p.next;
				c++;
			}
			s.next=q;
			q.next=p;
		}
	}
		public static void delete_any_loc(node p) {
			int count=0;
			node s=p;
			while(s!=null) {
				count++;
				s=s.next;
			}
			System.out.println("Enter the loc u want to del");
			int loc=sc.nextInt();
			if(loc>count) {
				System.out.println("Invalid input");
			}
			else if(loc==1) {
				start=p.next;
			}
			else {
				int c=1;
				node t=null;
				while(c<loc) {
					t=p;
					p=p.next;
					c++;
				}
				t.next=p.next;
			}
		}
	public static void average(node p) {
		int count=0;
		int sum=0;
		while(p!=null) {
			count++;
			sum=sum+p.info;
			p=p.next;
		}
		System.out.println(count);
		System.out.println(sum);
		double avg=sum/count;
		System.out.println("Average is "+avg);
	}
	public static void search(node p) {
		System.out.println("Enter the value u want to search");
		int x=sc.nextInt();
		int q=0;
		while(p!=null) {
			if(p.info==x) {
				q++;
			}
			p=p.next;
		}
		if(q==1) {
			System.out.println("In the list");
		}else {
			System.out.println("Not in the list");
		}
	}
	public static void max(node p) {
		int max=p.info;
		p=p.next;
		while(p!=null) {
			if(p.info>max) {
				max=p.info;
			}
			p=p.next;
			}
		System.out.println("Maximum is "+max);
	}
	public static void min(node p) {
		int min=p.info;
		p=p.next;
		while(p!=null) {
			if(p.info<min) {
				min=p.info;
			}
			p=p.next;
		}
		System.out.println("Minimum is "+min);
	}
	public static void main(String[] args) {
	create(start);
	display(start);
	add_beg(start);
	display(start);
	add_end(start);
	display(start);
	delete_beg(start);
	display(start);
	delete_end(start);
	display(start);
	insert_any_loc(start);
	display(start);
	delete_any_loc(start);
	display(start);
	average(start);
	search(start);
	max(start);
	min(start);
	}

}
