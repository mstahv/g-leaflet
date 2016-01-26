package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JsArray;

public class Polygon extends AbstractPath {

    protected Polygon() {
    }

    public static native Polygon createWithHoles(JsArray<JsArray<JsArray>> array,
            PolylineOptions options) /*-{
		return new $wnd.L.Polygon(array, options);
	}-*/;

    public static native Polygon create(JsArray<LatLng> latlngs,
            PolylineOptions options) /*-{
		return new $wnd.L.Polygon(latlngs, options);
	}-*/;

    public final LatLng[] getExteriorRing() {
        JsArray<LatLng> rawLatLngs = getRawLatLngs().get(0);
        LatLng[] r = new LatLng[rawLatLngs.length()];
        for (int i = 0; i < r.length; i++) {
            r[i] = rawLatLngs.get(i);
        }
        return r;
    }

    public native final JsArray<JsArray<LatLng>> getRawLatLngs() /*-{
            return this.getLatLngs();
	}-*/;

}
