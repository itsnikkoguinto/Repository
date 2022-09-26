class Shape//pick a name that makes sense
{
	//static variable - global/shared variable
	//read/write

	
	//Attributes
	int numOfSides;//defining or declaring, or 'instantiating' a variable
	String color;
	boolean striped;
	
	//constructors
	//no return type
	//name must match the class
	public Shape(int s,String c,boolean str)//get values when called
	{
		numOfSides=s;
		color=c;
		striped=str;
		print();
	}
	public Shape()//no-args constructor
	{
		numOfSides=4;
		color="red";
		striped=false;
	}
	
	//methods
	//no static 
	public void print()
	{
		System.out.println("This shape has "+numOfSides+" and is "+color);
	}
	/*public static void print()
	{
		System.out.println("This shape has "+numOfSides+" and is "+color);
	}*/
}