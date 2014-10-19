package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;


public class Icon extends JavaScriptObject implements AnyIcon {
	
	protected Icon() {}
	
	public static native Icon create(IconOptions options) 
	/*-{
		return new $wnd.L.Icon(options);
	}-*/;

}
