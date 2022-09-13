
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		//System.out.println(args[2]);
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		//int c=Integer.parseInt(args[2]);
		if((m>=3&&(d>=20||d<=31))||(m>=4&&(d>=1||d<=30))||(m>=5&&(d>=1||d<=31))||(m>=6&&(d>=20||d<=20)))
		{
			System.out.println("It is a valid date");
		}
		else
		{
		System.out.println("it is not a valid date");	
		}
	}

}
