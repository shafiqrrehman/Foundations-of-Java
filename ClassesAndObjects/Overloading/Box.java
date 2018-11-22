public class Box {

	double width, height, depth;

	Box( Box b ) {
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	Box( double width, double height, double depth ) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box() {
		height = -1;
		width = -1;
		depth = -1;
	}

	Box( double len ) {
		width = height = depth = len;
	}

	public double volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		
		Box mybox1 = new Box(10.12, 33.33, 34.12);
		Box mybox2 = new Box();
		Box cube = new Box(7.12);

		Box myClone = new Box(mybox1);

		double vol;

		vol = mybox1.volume();
		System.out.println("Volume of mybox1: " + vol);

		vol = mybox2.volume();
		System.out.println("Volume of mybox2: " + vol);

		vol = cube.volume();
		System.out.println("Volume of cube: " + vol);

		vol = myClone.volume();
		System.out.println("Volume of myClone: " + vol);
	}
}