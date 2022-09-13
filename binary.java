
public class binary {

	
			public static int search(int []arr,int lb,int ub,int key)
			{
				if(lb<=ub)
				{
					int mid=(lb+ub)/2;
					if(arr[mid]==key)
					{
						return mid;
					}
					else if(arr[mid]>key)
					{
						return search(arr,lb,mid-1,key);
						
					}
					else
					{
						return	search(arr,mid+1,ub,key);
						
					}
				}
				else
				{
					return -1;
				}
				
			}
				public static void main(String[] args) {
					// TODO Auto-generated method stub
			int a[]= {10,20,30,40,50,60,70,80};
			System.out.println(search(a,0,a.length-1,70));
				}

}
