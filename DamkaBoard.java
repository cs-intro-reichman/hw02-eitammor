public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer.parseInt ( args[0] );
		for(int i = 0; i<num; i++)
		{
			for (int j = 0; j<num; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		