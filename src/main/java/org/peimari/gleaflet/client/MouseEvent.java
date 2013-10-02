package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class MouseEvent extends JavaScriptObject {
	
	protected MouseEvent() {}

	public native final LatLng getLatLng() 
	/*-{
		return this.latlng;
	}-*/;

}
