package org.peimari.gleaflet.client;


public class Icon extends AbstractVector {
	
	protected Icon() {}
	
	public static native Icon create(IconOptions options) 
	/*-{
		return new $wnd.L.Icon(options);
	}-*/;

}
