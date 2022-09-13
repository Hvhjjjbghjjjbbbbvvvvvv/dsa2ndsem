package ass1;
import java.util.Scanner;

public class q8 {
	public static int[] multiply(int []n,int []m)
	{
		int arr3[]=new int[n.length];
		for(int k=0;k<n.length;k++)
		{
		arr3[k]=n[k]*m[k];
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the all array");
    int x=sc.nextInt();
    int arr[]=new int[x];
    for(int i=0;i<arr.length;i++)
    {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("enter the value of the array");
    	arr[i]=sc1.nextInt();
    	
    }
  
    int arr1[]=new int[x];
    for(int j=0;j<arr.length;j++)
    {
    	Scanner sc2=new Scanner(System.in);
    	System.out.println("enter the value of the array");
    	arr1[j]=sc2.nextInt();
    	
    }
    int arr3[];
    arr3=multiply(arr,arr1);
    
	}

}
