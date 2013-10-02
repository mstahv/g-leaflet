package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JsArray;


public class Polygon extends AbstractVector {
	
	protected Polygon() {}
	
	public static native Polygon create(JsArray<LatLng> latlngs, PolylineOptions options) 
	/*-{
		return new $wnd.L.Polygon(latlngs, options);
	}-*/;

}
