public class InheritanceDemo {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.a = 5;
		obj.b = 6;

		obj.sum();
		System.out.println( "\nSum: " + obj.result );
		obj.sub();
		System.out.println( "\nSub: " + obj.result );
		obj.mul();
		System.out.println( "\nMultiply: " + obj.result );
	}
}

class A {

	int a, b, result;

	public void sum() {

		result = a + b;
	}
}

class B extends A {

	public void sub() {

		result = a - b;
	}

	public void mul() {

		result = a * b;
	}
}