package org.peimari.gleaflet.client;

public class MapOptions extends AbstractJsonOptions {
	
	protected MapOptions() {}
	
	public static native MapOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setCenter(LatLng c) 
	/*-{
		this.center = c;
	}-*/;

	public native final void setCrs(Crs crs) 
	/*-{
	 	this.crs = crs;
	}-*/;

	public native final void setAttributionControl(boolean b) 
	/*-{
		this.attributionControl = b;
	}-*/;

	public native final void setZoom(double zoom) 
	/*-{
		this.zoom = zoom;
	}-*/;

	public native final void setMinZoom(int minZoom)
	/*-{
		this.minZoom = minZoom;
	}-*/;

	public native final void setMaxZoom(int maxZoom) 
	/*-{
		this.maxZoom = maxZoom;
	}-*/;

        public native final void setMaxBounds(LatLngBounds bounds) 
        /*-{
            this.maxBounds = bounds;
        }-*/;

}
