package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import main.Member;
import main.MemberVariable;

public class MemberVariableTest {

	@Test
	public void testDisplay() {
		MemberVariable m = new MemberVariable();
		Member returnedMember=m.display("Syam", 34, new BigDecimal(65767.67));
		assertEquals("Syam",returnedMember.getName());
		
	}

}
