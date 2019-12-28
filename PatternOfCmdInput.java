
public class PatternOfCmdInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=args[0];
		
		for(int i=0;i<name.length();i++)//qn1 part1
			System.out.println(name.charAt(i));
		
		//qn1 part2
		for(int i=0;i<name.length();i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(name.charAt(j)+" ");
			System.out.println();
		}
		
		
	}

}
