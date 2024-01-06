public class Reverse {
	public static void main(String[] args) {
		String s = args[0];
		for(int i=1; (s.length()-i) >= 0; i++) // #feedback - it is more clear to write the condition as "i<=s.length()"
		{
			System.out.print(s.charAt(s.length()-i));
		}
		System.out.println();
		if(s.length()%2==0)
		{
			System.out.print("The middle character is " +  s.charAt((s.length()/2)-1));
		}
		else
		{
			System.out.print("The middle character is " +  s.charAt(s.length()/2));
		}	

	}
}
		
