class vectorex
{
	public static void main(String args [])
	{
		Vector v=new Vector(7);

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(80);
		v.add(70);

System.out.println("SIZE::"+v.size());

		v.remove(0);
		v.remove(1);

		v.addElementAt(200,0);
		v.addElementAt(300,1);

		System.out.println("SIZE::"+v.size());
		System.out.println(v);
	}
}