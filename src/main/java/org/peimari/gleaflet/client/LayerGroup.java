package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class LayerGroup extends Layer {
	
	protected LayerGroup() {}
	
	public static native LayerGroup create() 
	/*-{
		return new $wnd.L.LayerGroup();
	}-*/;
	
	public static LayerGroup create(Layer[] layers) {
		LayerGroup group = create();
		for (Layer iLayer : layers) {
			group.addLayer(iLayer);
		}
		return group;
	}


	public native final void addLayer(Layer layer) 
	/*-{
		this.addLayer(layer);
	}-*/;

	public native final void removeLayer(Layer layer) 
	/*-{
		this.removeLayer(layer);
	}-*/;
	
	public final Layer[] getLayers() {
		JsArray<JavaScriptObject> rawLayers = getRawLayers();
		Layer[] l = new Layer[rawLayers.length()];
		for (int i = 0; i < l.length; i++) {
			l[i] = rawLayers.get(i).cast();
		}
		return l;
	}
	
	public native final JsArray<JavaScriptObject> getRawLayers() 
	/*-{
		return this.getLayers();
	}-*/;


	public native final void bringToFront() 
        /*-{
            this.bringToFront();
        }-*/;

        public native final void bringToBack() 
        /*-{
            this.bringToBack();
        }-*/;

}
