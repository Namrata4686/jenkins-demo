interface interface1{
	int add(int a,int b);
}
class Addition implements interface1 {
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		Addition obj=new Addition();
		System.out.println("2 +3 = "+ obj.add(2, 3));
	}

}
