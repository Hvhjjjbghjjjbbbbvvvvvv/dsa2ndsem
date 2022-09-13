



		// TODO Auto-generated method stub
		import java.util.Scanner;
		class alpha
		{
			public int factorial(int x)
			{
				if(x==0)
				{
					return 1;
				}
				else
				{
					return x*factorial(x-1);
				}
			}
			public int power(int y,int z)
			{
				if(z==0)
				{
					return 1;
				}
				else
				{
					return y*power(y,z-1);
				}
			}
			public int fibo(int a)
			{
				if(a==1)
				{
					return 0;
				}
				else if(a==2)
				{
					return 1;
				}
				else
				{
					return fibo(a-1)+fibo(a-2);
				}
			}
			public int reverse(int x,int y)
			{
				if(x==0)
				{
					return y;
				}
				else
				{
					return reverse(x/10,(y*10)+(x%10));
			}}
			public int gcd(int x,int y)
			{
				if(x==0)
				{
					return y;
				}
				else 
				{
					return gcd(y%x,x);
				}
			}
			
		}
		public class Q71 {	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		alpha sc=new alpha();

		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number which factorial want");
		int fact=sc1.nextInt();
		System.out.println("The factorial is "+sc.factorial(fact));
		System.out.println("Enter number which power find");
		int base=sc1.nextInt();
		int power=sc1.nextInt();
		System.out.println("The power is "+sc.power(base,power));
		System.out.println("Enter series u want to in fibbonaci");
		int fibonaci=sc1.nextInt();
		System.out.println("The sum of fibonaci series is "+sc.fibo(fibonaci));
		System.out.println("Enter the number u find reverse");
		int revers=sc1.nextInt();
		System.out.println("The reverse of a number is "+sc.reverse(revers, 0));
		System.out.println("Enter the number u want to find gcd");
		int a=sc1.nextInt();
		int b=sc1.nextInt();
		System.out.println("The GCD is "+sc.gcd(a,b));
			}

		}

	


