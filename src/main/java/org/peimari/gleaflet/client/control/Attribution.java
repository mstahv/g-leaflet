package org.peimari.gleaflet.client.control;


public class Attribution extends Control {
	
	protected Attribution() {}
	
	public static native Attribution create() 
	/*-{
		return new $wnd.L.Control.Attribution();
	}-*/;

	public native final void setPrefix(String attributionPrefix) 
	/*-{
		this.setPrefix(attributionPrefix);
	}-*/;

}
