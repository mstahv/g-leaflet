package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JsArray;


public class Polygon extends Polyline {
	
	protected Polygon() {}

	public static native Polygon createWithHoles(JsArray<JsArray<JsArray>> array, PolylineOptions options)
	/*-{
		return new $wnd.L.Polygon(array, options);
	}-*/;

	public static native Polygon create(JsArray<LatLng> latlngs, PolylineOptions options)
	/*-{
		return new $wnd.L.Polygon(latlngs, options);
	}-*/;

}
