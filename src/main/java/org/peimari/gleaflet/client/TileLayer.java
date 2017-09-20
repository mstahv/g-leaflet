package org.peimari.gleaflet.client;

public class TileLayer extends GridLayer {
	
	protected TileLayer() {}
	
	public static native TileLayer create(String url, TileLayerOptions tileOptions) 
	/*-{
		return new $wnd.L.TileLayer(url, tileOptions);
	}-*/;
      
}
