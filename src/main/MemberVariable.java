package main;

import java.math.BigDecimal;

public class MemberVariable {
	public Member display(String name,int age,BigDecimal salary )
	{
		Member m = new Member(name,age,salary);
		System.out.println(m);
		return m;
		
	}
	

}
