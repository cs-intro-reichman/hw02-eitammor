public class OneOfEachStats1 {
	public static void main(String[] args) {
		int numOfExperiments = Integer.parseInt ( args[0] );
		int sumChild = 0;
		int sumAllChild = 0;
		boolean isBoy = false;
		boolean isGirl = false;
		int numOfFamiliesWith2 = 0;
		int numOfFamiliesWith3 = 0;
		int numOfFamiliesWith4OrMore = 0;
		
		for (int i = 0; i<numOfExperiments; i++)
		{
			sumChild = 0;
			isBoy = false;
			isGirl = false;
			while ((!isBoy)||(!isGirl))
			{
				//Its a girl!
				if (Math.random() >= 0.5)
				{
					isGirl = true;
					sumChild++;
				}
				//Its a boy!
				else
				{
					isBoy = true;
					sumChild++;
				}
			}
			sumAllChild = sumAllChild + sumChild;
			if (sumChild == 2)
			{
				numOfFamiliesWith2++;
			}
			else if (sumChild == 3)
			{
				numOfFamiliesWith3++;
			}
			else
			{
				numOfFamiliesWith4OrMore++;
			}
		}
		
		System.out.println("Average: " + (double)(sumAllChild/(double)numOfExperiments) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + numOfFamiliesWith2);
		System.out.println("Number of families with 3 children: " + numOfFamiliesWith3);
		System.out.println("Number of families with 4 or more children: " + numOfFamiliesWith4OrMore);
		if((numOfFamiliesWith2>=numOfFamiliesWith3)&&(numOfFamiliesWith2>=numOfFamiliesWith4OrMore))
		{
			System.out.println("The most common number of children is 2.");	
		}
		else if ((numOfFamiliesWith3>=numOfFamiliesWith2)&&(numOfFamiliesWith3>=numOfFamiliesWith4OrMore))
		{
			System.out.println("The most common number of children is 3.");	
		}
		else
		{
			System.out.println("The most common number of children is 4 or more.");		
		}
	}
}