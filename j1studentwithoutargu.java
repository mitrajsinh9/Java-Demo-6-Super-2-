package jDemo6Super2;

import java.util.Scanner;

class student
{
	int sno;
	String name;
	
	student()
	{
		sno=5;
		name="ram";
		System.out.println("In student cons");
	}
	void printData()
	{
		System.out.println("student no. = " + sno + "  student name = " + name);
	}
}

class marks extends student
{
	int emarks;
	int hmarks;
	
	marks()
	{
		emarks=23;
		hmarks=34;
		System.out.println("In marks cons");
	}
	void printmarks()
	{
		System.out.println("Eng marks = " + emarks + "  Hin marks = " + hmarks);
	}
}

class result extends marks
{	
	result()
	{
		System.out.println("In result cons");
	}
	void printresult()
	{
		System.out.println("RESULT = " + (emarks+hmarks));
	}
}
public class j1studentwithoutargu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		result r1=new result();
		
		r1.printData();
		r1.printmarks();
		r1.printresult();
	}

}