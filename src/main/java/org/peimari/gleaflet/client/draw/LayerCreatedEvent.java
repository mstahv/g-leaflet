package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.ILayer;

public class LayerCreatedEvent extends DrawEvent {
	
	protected LayerCreatedEvent() {}
	
	public native final String getRawLayerType()
	/*-{
	 	return this.layerType;
	}-*/;
	
	public final LayerType getLayerType() {
		String rawLayerType = getRawLayerType();
		for(LayerType t : LayerType.values()) {
			if(t.toString().equals(rawLayerType)) {
				return t;
			}
		}
		return null;
	}

	public native final ILayer getLayer()
	/*-{
	 	return this.layer;
	 }-*/;
}
