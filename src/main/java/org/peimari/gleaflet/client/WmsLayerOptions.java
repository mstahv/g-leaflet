package org.peimari.gleaflet.client;


public class WmsLayerOptions extends TileLayerOptions {

	protected WmsLayerOptions() {}

	public static native WmsLayerOptions create()
	/*-{
		return {};
	}-*/;

	public native final void setLayers(String layers)
	/*-{
		this.layers = layers;
	}-*/;

	public native final void setStyles(String styles)
	/*-{
		this.styles = styles;
	}-*/;

	public native final void setFormat(String format)
	/*-{
		this.format = format;
	}-*/;

	public native final void setTransparent(boolean transparent)
	/*-{
		this.transparent = transparent;
	}-*/;

	public native final void setVersion(String version)
	/*-{
		this.version = version;
	}-*/;

    public native final void setCrs(Crs crs)
	/*-{
        this.crs = crs;
    }-*/;

    	public native final void setViewparams(String viewparams)
    	/*-{
		this.viewparams = viewparams;
	}-*/;

        public native final void setCQLFilter(String cqlFilter)
        /*-{
                this.cql_filter = cqlFilter;
        }-*/;
}
