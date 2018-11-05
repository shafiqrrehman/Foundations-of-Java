public class Test {

	public static void main(String[] args) {
		
		Bicycle bc = new Bicycle( 4, 150 );
		System.out.println(bc);
		bc.speedUp(120);
		bc.applyBrake(90);
		System.out.println("\n" + bc);

		System.out.println();
		
		MountainBike bike = new MountainBike( 3, 100, 25 );
		System.out.println(bike);
	}
}