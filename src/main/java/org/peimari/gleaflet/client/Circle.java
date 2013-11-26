package org.peimari.gleaflet.client;


public class Circle extends AbstractPath {
	
	protected Circle() {}
	
	public static native Circle create(LatLng latlng, Double radius, CircleOptions circleOptions)
	/*-{
		return new $wnd.L.Circle(latlng, radius, circleOptions);
	}-*/;

	public native final LatLng getLatLng() 
	/*-{
		return this.getLatLng();
	}-*/;

	public native final double getRadius() 
	/*-{
		return this.getRadius();
	}-*/;

}
