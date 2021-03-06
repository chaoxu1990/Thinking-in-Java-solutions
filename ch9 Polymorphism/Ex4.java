//Chapter 9, Exercise 4
// Ex4.java
import java.util.*;

class Shape{
	public void draw(){}
	public void erase(){}
}

class Polygon extends Shape{
	@Override public void draw(){System.out.println("Polygon.draw()");}
	@Override public void erase(){System.out.println("Polygon.erase()");}
}

class Circle extends Shape{
	@Override public void draw(){System.out.println("Circle.draw()");}
	@Override public void erase(){System.out.println("Circle.erase()");}
}

class Square extends Shape{
	@Override public void draw(){System.out.println("Square.draw()");}
	@Override public void erase(){System.out.println("Square.erase()");}
}

class Triangle extends Shape{
	@Override public void draw(){System.out.println("Triangle.draw()");}
	@Override public void erase(){System.out.println("Triangle.erase()");}
}

class RandomShapeGenerator{
	private Random rand = new Random(47);
	public Shape next(){
		switch(rand.nextInt(4)){
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			case 3: return new Polygon();
		}
	}
}

public class Ex4{
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[]  args)
	{
		Shape[] s = new Shape[12];
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for(Shape shp : s)
			shp.draw();
	}
}