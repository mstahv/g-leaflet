package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;


public class DivIcon extends JavaScriptObject {
	
	protected DivIcon() {}
	
	public static native DivIcon create(DivIconOptions options) 
	/*-{
		return new $wnd.L.DivIcon(options);
	}-*/;

}
