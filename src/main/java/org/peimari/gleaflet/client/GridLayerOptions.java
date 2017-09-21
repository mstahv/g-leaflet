package org.peimari.gleaflet.client;

public class GridLayerOptions extends AbstractJsonOptions {

    protected GridLayerOptions() {}

    public static native GridLayerOptions create()
	/*-{
		return {};
	}-*/;

    public native final void setTileSize(int tileSize)
	/*-{
		this.tileSize = tileSize;
	}-*/;

    public native final void setOpacity(double opacity)
	/*-{
		this.opacity = opacity;
	}-*/;

    public native final void setZindex(int zIndex)
	/*-{
		this.zIndex = zIndex;
	}-*/;

    public native final void setBounds(LatLngBounds bounds)
	/*-{
		this.bounds = bounds;
	}-*/;

    public native final void setMaxNativeZoom(int maxNativeZoom)
	/*-{
		this.maxNativeZoom = maxNativeZoom;
	}-*/;

    public native final void setMinNativeZoom(int minNativeZoom)
	/*-{
		this.minNativeZoom = minNativeZoom;
	}-*/;

    public native final void setNoWrap(boolean noWrap)
	/*-{
		this.noWrap = noWrap;
	}-*/;

    public native final void setAttribution(String attributionString)
	/*-{
		this.attribution = attributionString;
	}-*/;
}
