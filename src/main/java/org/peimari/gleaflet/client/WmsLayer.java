package org.peimari.gleaflet.client;


public class WmsLayer extends TileLayer {
	
	protected WmsLayer() {}
	
	public static native WmsLayer create(String url, WmsLayerOptions options) 
	/*-{
		return new $wnd.L.TileLayer.WMS(url, options);
	}-*/;

}
