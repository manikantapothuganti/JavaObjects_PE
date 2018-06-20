package main;

public class Powerof4 {
	public boolean power(int n)
	{
		if(n == 0)
            return false;
            while(n != 1)
            { 
                if(n % 4 != 0)
                return false;
                n = n / 4;    
            }
            return true;
	}

}
