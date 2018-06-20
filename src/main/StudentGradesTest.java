package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentGradesTest {

	@Test
	public void testToFindAvg() {
		StudentGrades s = new  StudentGrades();
		double  expected = s.toFindAvg(new int[]{10,10,10});
		assertEquals(expected,10.0,1);
		
	}

	@Test
	public void testToFindMax() {
		StudentGrades s = new  StudentGrades();
		int  expected = s.toFindMax(new int[]{10,10,10});
		assertEquals(expected, 10);
	}

	@Test
	public void testToFindMin() {
		StudentGrades s = new  StudentGrades();
		int  expected = s.toFindMin(new int[]{10,10,10});
		assertEquals(expected, 10);
	}

}
