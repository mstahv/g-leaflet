package org.peimari.gleaflet.client;


public class Marker extends AbstractPath {
	
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

	public native final LatLng getLatLng() 
	/*-{
		return this.getLatLng();
	}-*/;
	
	public native final void addDragEndListener(ClickListener listener) 
	/*-{
		this.on("dragend", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.ClickListener::onClick(Lorg/peimari/gleaflet/client/MouseEvent;)(e));
		});
	}-*/;


}
