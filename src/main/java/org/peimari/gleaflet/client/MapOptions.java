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

		public native final void setDragging(boolean dragging)
		/*-{
            this.dragging = dragging;
        }-*/;

		public native final void setTouchZoom(boolean touchZoom)
		/*-{
        	this.touchZoom = touchZoom;
    	}-*/;

		public native final void setDoubleClickZoom(boolean doubleClickZoom)
		/*-{
    		this.doubleClickZoom = doubleClickZoom;
		}-*/;

		public native final void setBoxZoom(boolean boxZoom)
		/*-{
    		this.boxZoom = boxZoom;
		}-*/;

		public native final void setScrollWheelZoom(boolean scrollWheelZoom)
		/*-{
    		this.scrollWheelZoom = scrollWheelZoom;
		}-*/;

		public native final void setKeyboard(boolean keyboard)
		/*-{
    		this.keyboard = keyboard;
		}-*/;
}
