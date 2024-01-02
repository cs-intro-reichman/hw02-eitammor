public class Divisors {
	public static void main(String[] args) {
		int num = Integer.parseInt ( args[0] );
		int div = 1;
		if (num!=0)
		{
			while (div < num)
			{
				if ((num%div)==0)
				{
					System.out.println(div);
				}
				div++;
			}
			System.out.println (num);
		}
		else 
		{
			System.out.println("Zero in not acceptable");
		}
	}
}
		