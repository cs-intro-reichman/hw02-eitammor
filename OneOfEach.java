public class OneOfEach {
	public static void main(String[] args) {
		int sumChild = 0;
		boolean isBoy = false;
		boolean isGirl = false;
		String child = "";
		while ((!isBoy)||(!isGirl))
		{
			//Its a girl!
			if (Math.random() >= 0.5)
			{
				isGirl = true;
				sumChild++;
				child = child + "g ";
				
			}
			//Its a boy!
			else
			{
				isBoy = true;
				sumChild++;
				child = child + "b ";
			}
		}
		System.out.println(child);
		System.out.println ("You made it... and you now have " + sumChild +" children.");
	}
}