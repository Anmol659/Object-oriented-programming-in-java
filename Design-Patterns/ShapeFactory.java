package com.patterns;

public class ShapeFactory {
	
	public static Shape getShape(String msg)
	{
		Shape s= null;
		if(msg==null)
		{
			return null;
		}
		if(msg=="Circle")
		{
			s= new Circle();
		}
		if(msg=="Rectangle")
		{
			s= new Rectangle();
		
		}
		if(msg=="Square")
		{
			s= new Square();
		}
		return s;
		
	}

}
