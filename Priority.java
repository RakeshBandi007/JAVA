class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A Started");
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread A::"+i);

		}	System.out.println("Thread B End");
	}		
}

class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B Started");
		for(int j=1;j<=5;j++)
		{
			System.out.println("Thread B::"+j);

		}	System.out.println("Thread B End");
	}		
		
}

class C extends Thread
{
	public void run()
	{
		System.out.println("Thread c Started");
		for(int k=1;k<=5;k++)	
		{
			System.out.println("Thread C::"+k);

		}	System.out.println("Thread C End");	
	}
}

class ThreadPriority
{
	public static void main(String args [])
	{
		A objA=new A();
		B objB=new B();
		C objC=new C();

		objC.setPriority(Thread.MAX_PRIORITY);
		objB.setPriority(objA.getPriority() +1);
		objC.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Thread A");
		objA.start();
		System.out.println("Thread B");
		objB.start();
		System.out.println("Thread C");
		objC.start();
	}
}