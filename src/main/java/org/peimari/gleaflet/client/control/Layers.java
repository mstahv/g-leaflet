package org.peimari.gleaflet.client.control;

import org.peimari.gleaflet.client.Layer;


public class Layers extends Control {
	
	protected Layers() {}
	
	public static native Layers create() 
	/*-{
		return new $wnd.L.Control.Layers;
	}-*/;
	
	public native final void addBaseLayer(Layer layer, String name) 
	/*-{
		this.addBaseLayer(layer, name);
	}-*/;
	
	public native final void addOverlay(Layer layer, String name) 
	/*-{
		this.addOverlay(layer, name);
	}-*/;
	
	public native final void removeLayer(Layer layer) 
	/*-{
		this.removeLayer(layer);
	}-*/;

}
