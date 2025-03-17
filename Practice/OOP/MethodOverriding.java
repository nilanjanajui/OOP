package OOP;

class A
{
	int i, j;

	A(int a, int b)
	{
		i=a;
		j=b;

	}
	void show()
	{
		System.out.println("i="+ i + ", j=" + j);
	}
}

class B extends A
{
	int k;

	B(int a, int b, int c)
	{
		super(a, b);
		k=c;
	}

	void show()
	{
		super.show();
		System.out.println("k =" + k);
	}
}

public class MethodOverriding 
{
	public static void main(String [] args)
	{
		B my1 = new B(1, 2, 3);
		my1.show();
	}
}










