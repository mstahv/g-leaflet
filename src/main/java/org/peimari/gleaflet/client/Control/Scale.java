package org.peimari.gleaflet.client.Control;



public class Scale extends Control {
	
	protected Scale() {}
	
	public static native Scale create(ScaleOptions options) 
	/*-{
		return new $wnd.L.Control.Scale(options);
	}-*/;

}
