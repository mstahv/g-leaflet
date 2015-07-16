package org.peimari.gleaflet.client;


public class FeatureGroup extends LayerGroup {
	
	protected FeatureGroup() {}
	
	public static native FeatureGroup create() 
	/*-{
		return new $wnd.L.FeatureGroup();
	}-*/;
	
	public static FeatureGroup create(Layer[] layers) {
		FeatureGroup group = create();
		for (Layer iLayer : layers) {
			group.addLayer(iLayer);
		}
		return group;
	}
	
	public native final void clearLayers() 
	/*-{
	 	this.clearLayers();
	 }-*/;

}
