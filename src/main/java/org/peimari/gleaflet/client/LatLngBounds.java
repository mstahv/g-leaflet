package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class LatLngBounds extends JavaScriptObject {
	
	protected LatLngBounds() {}
	
	public static native LatLngBounds create(LatLng southWest, LatLng northEast) 
	/*-{
		return new $wnd.L.LatLngBounds(southWest, northEast);
	}-*/;
	
	
	public native final LatLng getCenter() 
	/*-{
		return this.getCenter();
	}-*/;

	public native final LatLng getSouthWest()
	/*-{
		return this.getSouthWest();
	}-*/;

	public native final LatLng getNorthEast()
	/*-{
		return this.getNorthEast();
	}-*/;

	public native final String toBBoxString() 
	/*-{
		return this.toBBoxString();
	}-*/;
	

}
