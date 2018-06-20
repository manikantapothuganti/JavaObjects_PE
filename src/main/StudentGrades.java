package main;
import java.util.Scanner;


public class StudentGrades {
	public static double toFindAvg(int grades[])
	{
		int sum=0;
		for (int i=0;i<grades.length;i++)
		{
			sum+=grades[i];
		}
		double avg = sum/grades.length;
		return avg;
	}
	public static int toFindMax(int grades[])
	{
		int max=0;
		for (int i=0;i<grades.length;i++)
		{
			if (max<grades[i])
			{
				max=grades[i];
			}
		}
		return max;
	}
	public static int toFindMin(int grades[])
	{
		int min=100;
		for (int i=0;i<grades.length;i++)
		{
			if (min>grades[i])
			{
				min=grades[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print(" Enter the number of students: ");
		int noOfStudents = sn.nextInt();
		int grades[] = new int[noOfStudents];
		for (int i=0;i<noOfStudents;i++)
		{
			grades[i]=sn.nextInt();
		}
		System.out.println("The average is "+toFindAvg(grades));
		System.out.println("The maximum is "+toFindMax(grades));
		System.out.println("The minimumis "+toFindMin(grades));

	}

}
