package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class TileLayer extends JavaScriptObject implements ILayer {
	
	protected TileLayer() {}
	
	public static native TileLayer create(String url, TileLayerOptions tileOptions) 
	/*-{
		return new $wnd.L.TileLayer(url, tileOptions);
	}-*/;

}
