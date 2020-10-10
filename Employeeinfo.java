class employee
{
	 String name,city;
	 int age;

	employee(String nm, int a, String ct)
	{
		name=nm;
		city=ct;
		age=a;
	}

	public void display()
	{
		System.out.println("the name is "+name);
		System.out.println("the age is "+age);
		System.out.println("the city is "+city);
	}
}

class employeeinfo
{
	public static void main(String[] argv)
	{
		employee obj=new employee("saurabh",23,"chennai");
		employee obj1=new employee("satendra",25,"mumbai");

		obj.display();
		obj1.display();
	}
}
