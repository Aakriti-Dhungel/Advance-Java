package encapsulation;

public class Result {
	private int marks;
	private String name;
//	public void display() {
//		System.out.println(marks);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
//	public int getMarks() {
//		return marks;
//	}
//	
//	public void setMarks(int marks) {
//		this.marks = marks;
//		
//	}
}
