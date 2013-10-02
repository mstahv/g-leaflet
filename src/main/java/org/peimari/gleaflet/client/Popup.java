package org.peimari.gleaflet.client;


public class Popup extends AbstractVector {
	
	protected Popup() {}
	
	public static native Popup create(LatLng latlng, MarkerOptions options) 
	/*-{
		return new $wnd.L.Marker(latlng, options);
	}-*/;

}
