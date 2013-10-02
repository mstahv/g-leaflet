package org.peimari.gleaflet.client;


public class Circle extends AbstractVector {
	
	protected Circle() {}
	
	public static native Circle create(LatLng latlng, Double radius, PathOptions circleOptions) 
	/*-{
		return new $wnd.L.Circle(latlng, radius, circleOptions);
	}-*/;

	public native final LatLng getLatLng() 
	/*-{
		return this.getLatLng();
	}-*/;

}
