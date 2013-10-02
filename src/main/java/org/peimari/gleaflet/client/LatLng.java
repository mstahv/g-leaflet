package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class LatLng extends JavaScriptObject {
	
	protected LatLng() {}
	
	public static native LatLng create(double latitude, double longitude) 
	/*-{
		return new $wnd.L.LatLng(latitude, longitude);
	}-*/;
	
	public native final double getLatitude() 
	/*-{
		return this.lat;
	}-*/;

	public native final double getLongitude() 
	/*-{
		return this.lng;
	}-*/;
}
