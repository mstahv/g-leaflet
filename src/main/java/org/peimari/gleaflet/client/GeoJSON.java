package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;


public class GeoJSON extends FeatureGroup implements ILayer {
	
	protected GeoJSON() {}
	
	public static native GeoJSON create() 
	/*-{
		return new $wnd.L.GeoJSON();
	}-*/;

	public native final void addData(JavaScriptObject geoJsonData) 
	/*-{
		this.addData(geoJsonData);
	}-*/;
	
}
