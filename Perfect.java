public class Perfect {
	public static void main(String[] args) {
		int num = Integer.parseInt ( args[0] );
		if (num == 0 || num == 1 || num == 2)
		{
			System.out.println(num + " is not a perfect number");
		}
		else
		{
			int sum = 1;
			int div = 2;
			String s = num + " is a perfect number since " + num + " = 1";
			while (div<num && sum <=num)
			{
				if ((num%div)==0)
				{
					s = s + " + " + div;
					sum = sum + div;
				}
				div++;
			}
			if (sum == num)
			{
				System.out.println (s);
			}
			else
			{
				System.out.println(num + " is not a perfect number");
			}
		}
	
	}
}
		