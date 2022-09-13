class genericBox<T1>
{
	T1 a;
	T1 b;
	genericBox(T1 c,T1 d)//constructor
	{
		a=c;
		b=d;
	}
	void display()
	{
		System.out.println(a+""+b);
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
genericBox<String> sc=new genericBox<String>("Rakesh","Bose");
sc.display();
genericBox<Integer> sc1=new genericBox<Integer>(10,12);
sc1.display();
	}

}
