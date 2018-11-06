public class Rectangle extends Shape {

	double width, length;

	public Rectangle(String color, double width, double length){

		super(color);
		System.out.println("Rectangle constructer called...");
		this.width = width;
		this.length = length;
	}

	@Override
	double getArea() {
		return width * length;
	}

	@Override
	public String toString(){
		return "Rectangle color is " + super.color +  
                           "and area is : " + getArea();
	}
}