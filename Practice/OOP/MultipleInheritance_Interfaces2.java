package OOP;

class Student1 {
	int rollNumber;

	void getNumber(int n) {
		rollNumber = n;
	}

	void putNumber() {
		System.out.println("Roll NO:" + rollNumber);
	}
}

class Test1 extends Student1 {
	float part1, part2;

	void getMArks(float m1, float m2) {
		part1 = m1;
		part2 = m2;
	}

	void putMarks() {
		System.out.println("Marks Obtained:");
		System.out.println("part1 = " + part1);
		System.out.println("part2 = " + part2);
	}
}

interface Sports1 {
	float sportWt = 6.0F;

	void putWt();
}

class Results1 extends Test1 implements Sports1 {
	float total;

	public void putWt() {
		System.out.println("Sports Wt = :" + sportWt);
	}

	void display() {
		total = part1 + part2 + sportWt;
		putNumber();
		putMarks();
		putWt();
		System.out.println("Total Score = " + total);
	}
}

public class MultipleInheritance_Interfaces2 {

	public static void main(String[] args) {
		Results1 student1 = new Results1();
		student1.getNumber(1234);
		student1.getMArks(27.5F, 33.0F);
		student1.display();
	}
}
