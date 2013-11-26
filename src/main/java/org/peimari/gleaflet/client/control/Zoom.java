package org.peimari.gleaflet.client.control;


public class Zoom extends Control {
	
	protected Zoom() {}
	
	public static native Zoom create() 
	/*-{
		return new $wnd.L.Control.Zoom();
	}-*/;

}
