public class ObjReturn {

	int a;

	ObjReturn( int i ) {
		a = i;
	}

	public ObjReturn incrTen() {

		ObjReturn obj = new ObjReturn(a + 10);
		return obj;
	}

	public static void main(String[] args) {
		
		ObjReturn obj1 = new ObjReturn(2);
		ObjReturn obj2;

		obj2 = obj1.incrTen();
		System.out.println("obj1.a: " + obj1.a);
		System.out.println("obj2.a: " + obj2.a);

		obj2 = obj2.incrTen();
		System.out.println("obj2.a after second increase: " + obj2.a);
	}
}