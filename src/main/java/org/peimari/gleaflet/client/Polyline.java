package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JsArray;


public class Polyline extends AbstractVector {
	
	protected Polyline() {}
	
	public static native Polyline create(JsArray<LatLng> jsArray, PolylineOptions options) 
	/*-{
		return new $wnd.L.Polyline(jsArray, options);
	}-*/;

}
