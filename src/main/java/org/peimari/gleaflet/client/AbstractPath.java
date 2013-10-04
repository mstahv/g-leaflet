package org.peimari.gleaflet.client;


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
}
