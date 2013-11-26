package org.peimari.gleaflet.client;


public class CircleMarker extends Circle {

	protected CircleMarker() {}

	public static native CircleMarker create(LatLng latlng, CircleMarkerOptions circleMarkerOptions)
	/*-{
		return new $wnd.L.CircleMarker(latlng, circleMarkerOptions);
	}-*/;

}
