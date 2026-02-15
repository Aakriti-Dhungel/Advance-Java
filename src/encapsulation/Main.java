package encapsulation;

public class Main {

	public static void main(String[] args) {
		Result r = new Result();
		r.setMarks(1000);
		r.getMarks();
		int myMarks = r.getMarks();
		System.out.println(myMarks);
	}
}
