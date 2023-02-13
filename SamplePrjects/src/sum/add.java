package sum;

public class add 
{
	public int meth(int a , int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	 
	public static void main(String[] args)
	{
		 add s = new add();
		 s.meth(1, 2);
	}

}
