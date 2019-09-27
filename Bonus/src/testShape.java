import java.util.Vector;

public class testShape {

	public static void main(String[] args) {

		Vector<Shape> shapes = new Vector<Shape>(100);
		
		Circle c = new Circle(Color.RED,3,6);
		Rectangle r = new Rectangle(Color.RED,0);
		Triangle t = new Triangle(Color.BLACK,4);
		
		shapes.add(c);
		shapes.add(r);
		shapes.add(t);
		
		for(int i = 0; i < shapes.size(); ++i)
		{
			if(shapes.get(i) instanceof Circle)
			{
				Circle circle = (Circle)(shapes.get(i));
				circle.drawWithRadius();
			}
			else {
				shapes.get(i).draw();
			}
		}
	}

}
