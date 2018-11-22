public class ObjectPassing {

	int a, b;

	ObjectPassing( int a, int b ) {
		this.a = a;
		this.b = b;
	}

	boolean equals( ObjectPassing op ) {
		if (op.a == a && op.b == b) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		ObjectPassing ob1 = new ObjectPassing(100, 22);
		ObjectPassing ob2 = new ObjectPassing(100, 22);
		ObjectPassing ob3 = new ObjectPassing(-1, -33);

		System.out.println("ob1 == ob2: " + ob1.equals(ob2));
		System.out.println("ob1 == ob3: " + ob1.equals(ob3));
	}
}