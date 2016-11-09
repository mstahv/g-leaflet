package org.peimari.gleaflet.client;

public class LayersControlEvent extends Event {

    protected LayersControlEvent() {
    }

    public native final String getName()
	/*-{
		return this.name;
	}-*/;

    public native final Layer getLayer()
	/*-{
		return this.layer;
	}-*/;
}
