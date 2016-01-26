package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JsArray;


public class Polyline extends AbstractPath {
	
	protected Polyline() {}

	public static native Polyline createWithArray(JsArray<JsArray> point2dimArray, PolylineOptions options)
	/*-{
		return new $wnd.L.Polyline(point2dimArray, options);
	}-*/;

	public static native Polyline create(JsArray<LatLng> jsArray, PolylineOptions options)
	/*-{
		return new $wnd.L.Polyline(jsArray, options);
	}-*/;

	public final LatLng[] getLatLngs() {
		JsArray<LatLng> rawLatLngs = getRawLatLngs();
		LatLng[] r = new LatLng[rawLatLngs.length()];
		for (int i = 0; i < r.length; i++) {
			r[i] = rawLatLngs.get(i);
		}
		return r;
	}
	
	public native final JsArray<LatLng> getRawLatLngs() 
	/*-{
            return this.getLatLngs();
	}-*/;


}
