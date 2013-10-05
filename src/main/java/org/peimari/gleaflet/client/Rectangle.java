package org.peimari.gleaflet.client;



public class Rectangle extends Polygon {
	
	protected Rectangle() {}
	
	public static native Rectangle create(LatLngBounds bounds, PolylineOptions options) 
	/*-{
		return new $wnd.L.Rectangle(bounds, options);
	}-*/;

}
