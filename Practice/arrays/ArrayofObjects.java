package arrays;

class Student
{
	int RollNo;
	String Name;
	int Marks;
}
public class ArrayofObjects 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.RollNo = 1;
		s1.Name = "John";
		s1.Marks = 88;
		
		Student s2 = new Student();
		s2.RollNo = 2;
		s2.Name = "Rosy";
		s2.Marks = 80;
		
		Student s3 = new Student();
		s3.RollNo = 3;
		s3.Name = "Alex";
		s3.Marks = 90;
		
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(int i=0; i<students.length; i++)
		{
			System.out.println(students[i].RollNo + ". " + students[i].Name + ": " + students[i].Marks);
		}
		
		// enhanced for loop
		for(Student stude: students)
		{
			System.out.println(stude.RollNo + ". " + stude.Name + ": " + stude.Marks);
		}
	}
}





