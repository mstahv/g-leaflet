package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class LayerGroup extends JavaScriptObject implements ILayer {
	
	protected LayerGroup() {}
	
	public static native LayerGroup create() 
	/*-{
		return new $wnd.L.LayerGroup();
	}-*/;
	
	public static LayerGroup create(ILayer[] layers) {
		LayerGroup group = create();
		for (ILayer iLayer : layers) {
			group.addLayer(iLayer);
		}
		return group;
	}


	public native final void addLayer(ILayer layer) 
	/*-{
		this.addLayer(layer);
	}-*/;

	public native final void removeLayer(ILayer layer) 
	/*-{
		this.removeLayer(layer);
	}-*/;


	
}
