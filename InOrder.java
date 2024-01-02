public class InOrder {
	public static void main(String[] args) {
		int gen1 = (int)(10.0*Math.random());
		int gen2 = 0;
		System.out.println (gen1 + " ");
		while (gen1>=gen2)
		{
			System.out.println (gen1 + " ");
			gen2 = gen1;
			gen1 = (int)(10.0*Math.random());
		}
		
	}
}