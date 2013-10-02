package org.peimari.gleaflet.client;


public class DivIcon extends AbstractVector {
	
	protected DivIcon() {}
	
	public static native DivIcon create(DivIconOptions options) 
	/*-{
		return new $wnd.L.DivIcon(options);
	}-*/;

}
