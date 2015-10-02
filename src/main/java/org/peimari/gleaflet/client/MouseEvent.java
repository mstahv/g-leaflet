package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.NativeEvent;

public class MouseEvent extends JavaScriptObject {
	
	protected MouseEvent() {}

	public native final LatLng getLatLng() 
	/*-{
		return this.latlng;
	}-*/;
    
	public native final Point getContainerPoint() 
	/*-{
		return this.containerPoint;
	}-*/;

	public native final Point getLayerPoint() 
	/*-{
		return this.layerPoint;
	}-*/;

	public native final NativeEvent getNativeEvent() 
	/*-{
		return this.originalEvent;
	}-*/;

}
