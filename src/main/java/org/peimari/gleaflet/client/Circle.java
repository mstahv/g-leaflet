package org.peimari.gleaflet.client;


public class Circle extends CircleMarker {
	
	protected Circle() {}
	
	public static native Circle create(LatLng latlng, double radius, CircleOptions circleOptions)
	/*-{
		return new $wnd.L.Circle(latlng, radius, circleOptions);
	}-*/;


}
