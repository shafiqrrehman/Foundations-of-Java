abstract class Shape {

	String color;

	abstract double getArea();
	public abstract String toString();

	Shape( String color ) {
		this.color = color;
		System.out.println("Shape constructor called....");
	}

	public String getColor() {
		return color;
	}
}