package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class CircleOptions extends JavaScriptObject {
	
	protected CircleOptions() {}
	
	public static native CircleOptions create(double latitude, double longitude) 
	/*-{
		return new $wnd.L.LatLng(latitude, longitude);
	}-*/;
	
	public native final Double getLatitude() 
	/*-{
		this.lat;
	}-*/;

	public native final Double getLongitude() 
	/*-{
		this.lng;
	}-*/;
}
