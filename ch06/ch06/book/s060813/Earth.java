package ch06.book.s060813;

public class Earth {
	static final double EARTH_RADIUS=6400;
	static final double EARTH_SURFACE_AREA;
	
	static{
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
