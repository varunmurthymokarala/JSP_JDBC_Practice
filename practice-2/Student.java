package project01;

public class Student {

	private long rollNo;
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public int getMark4() {
		return mark4;
	}

	public void setMark4(int mark4) {
		this.mark4 = mark4;
	}

	public Student() {
	}

	public Student(long rollNo, String name, int mark1, int mark2, int mark3, int mark4) {

		this.rollNo = rollNo;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

	void generateRating() {
		float average = (mark1 + mark2 + mark3 + mark4) / 4;
		System.out.println(
				"Roll No : " + rollNo + "		       " + "Name : " + name + "\n" + "Mark1 : " + mark1 + "		       "
						+ "Mark2 : " + mark2 + "\n" + "Mark3 : " + mark3 + "		       " + "Mark4 : " + mark4);
		// System.out.println("Grade : ");

		if (average >= 90) {
			System.out.println("Grade : " + "A+");
		} else if (average >= 80 && average < 90) {
			System.out.println("Grade : " + "A");
		} else if (average >= 70 && average < 80) {
			System.out.println("Grade : " + "B");
		} else if (average >= 60 && average < 70) {
			System.out.println("Grade : " + "C");
		} else {
			System.out.println("Grade : " + "D");
		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Student s1 = new Student(10001, "Anoop", 78, 82, 81, 85);
		s1.generateRating();
	}
}
