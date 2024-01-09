package com.kn.polygon;

public class Polygon {
	public String polygonShape(int sides) {
		switch(sides) {
		case 3:
					return "Triangle";
		case 4:
					return "Rectangle";
		case 5:
					return "Pentagon";
		case 6:
					return "Hexagon";
	}
		return null;
	}

}
