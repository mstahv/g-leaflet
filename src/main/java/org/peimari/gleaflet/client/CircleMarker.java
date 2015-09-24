package org.peimari.gleaflet.client;


public class CircleMarker extends AbstractPath {

	protected CircleMarker() {}

	public static native CircleMarker create(LatLng latlng, CircleMarkerOptions circleMarkerOptions)
	/*-{
		return new $wnd.L.CircleMarker(latlng, circleMarkerOptions);
	}-*/;

    public native final LatLng getLatLng() 
	/*-{
		return this.getLatLng();
	}-*/;

	public native final double getRadius() 
	/*-{
		return this.getRadius();
	}-*/;
    
    public native final void setRadius(double radius)
	/*-{
		return this.setRadius(radius);
	}-*/;

}
