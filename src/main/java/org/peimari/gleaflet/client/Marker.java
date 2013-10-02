package org.peimari.gleaflet.client;


public class Marker extends AbstractVector {
	
	protected Marker() {}
	
	public static native Marker create(LatLng latlng, MarkerOptions options) 
	/*-{
		return new $wnd.L.Marker(latlng, options);
	}-*/;

	public native final void bindPopup(String popup, PopupOptions popupOptions) 
	/*-{
		this.bindPopup(popup, popupOptions);
	}-*/;

	public final void bindPopup(String popup) {
		bindPopup(popup, null);
	}

}
