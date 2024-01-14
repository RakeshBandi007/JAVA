class Vehical
{

	void run1()
	{
			System.out.println("Vehical Is Running");

	}
}

class Byke extends Vehical
{
	void run()
	{
			System.out.println("Byke Is Running");

	}

	public static void main(String args [])
	
	{
	
	Byke b=new Byke();
	b.run();
	b.run1();
	
	}
}