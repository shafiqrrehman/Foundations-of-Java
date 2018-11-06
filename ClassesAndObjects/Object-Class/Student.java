public class Student {

	static int roll = 100;
	int rollNo;

	Student() {
		rollNo = roll;
		roll++;
	}

	@Override
	public int hashCode(){
		return rollNo;
	}

	public static void main(String[] args) {
		Student st = new Student();
		Student s = new Student();


		System.out.println(st);
		System.out.println(s);
	}
}