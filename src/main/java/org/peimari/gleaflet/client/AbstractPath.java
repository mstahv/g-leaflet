package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;


public class AbstractPath extends AbstractVector {

	protected AbstractPath() {
	}

	/**
	 * Method to redraw path after for position change.
	 */
	public native final void redraw() 
	/*-{
		this.redraw();
	}-*/;

	public native final void setStyle(PathOptions newPathOptions) 
	/*-{
		this.setStyle(newPathOptions);
	}-*/;

	public native final LatLngBounds getBounds() 
	/*-{
		return this.getBounds();
	}-*/;

	public native final JavaScriptObject toGeoJSON() 
	/*-{
		return this.toGeoJSON();
	}-*/;
	
}
