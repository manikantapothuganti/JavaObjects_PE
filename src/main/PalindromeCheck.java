package main;

public class PalindromeCheck {

	public String isPalindrome(String s) {
		if(s== null) {
			return null;
		}
		int j=0,z=0;
		
		for (int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==s.charAt(s.length()-1-i)))
			{
				j++;
			}else {
				break;
			}
		}
		
		if (j==s.length())
		{
			return ("Palindrome. Sum greater than 25");
		}
		else 
		{
			return ("Not a palindrome");
		}
			

	}

	public boolean checkSum(int o) 
	{
		return false;
	}

}
