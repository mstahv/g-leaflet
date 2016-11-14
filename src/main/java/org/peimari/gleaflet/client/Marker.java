package org.peimari.gleaflet.client;


public class Marker extends AbstractPath {
	
	protected Marker() {}
	
	public static native Marker create(LatLng latlng, MarkerOptions options) 
	/*-{
		return new $wnd.L.Marker(latlng, options);
	}-*/;

	public native final LatLng getLatLng() 
	/*-{
		return this.getLatLng();
	}-*/;
        
        public native final void setLatLng(LatLng l) 
	/*-{
                this.setLatLng(l);
	}-*/;

	public native final Marker setIcon(AnyIcon icon) 
	/*-{
		return this.setIcon(icon);
	}-*/;
	
	public native final void addDragEndListener(ClickListener listener) 
	/*-{
		this.on("dragend", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.ClickListener::onClick(Lorg/peimari/gleaflet/client/MouseEvent;)(e);
		}));
	}-*/;


}
