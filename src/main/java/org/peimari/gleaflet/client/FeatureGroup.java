package org.peimari.gleaflet.client;


public class FeatureGroup extends LayerGroup implements ILayer {
	
	protected FeatureGroup() {}
	
	public static native FeatureGroup create() 
	/*-{
		return new $wnd.L.FeatureGroup();
	}-*/;
	
	public static FeatureGroup create(ILayer[] layers) {
		FeatureGroup group = create();
		for (ILayer iLayer : layers) {
			group.addLayer(iLayer);
		}
		return group;
	}
	
	public native final void clearLayers() 
	/*-{
	 	this.clearLayers();
	 }-*/;

}
