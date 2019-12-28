
public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=args[0];
		StringBuffer sb1=new StringBuffer();
		sb1.append(str);
		StringBuffer sb2=new StringBuffer();
			sb2.append(str);
		sb1.reverse();
		String s=sb1.toString();
		String ss=sb2.toString();
		if(s.equals(ss))
			System.out.println("The given String is a palindrome");			
		else
			System.out.println("The given String is not a palindrome");
		

			

	}

}
