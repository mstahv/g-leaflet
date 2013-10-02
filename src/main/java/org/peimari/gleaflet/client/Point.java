package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Point extends JavaScriptObject {
	
	protected Point() {}
	
	public static native Point create(double x, double y) 
	/*-{
		return new $wnd.L.Point(x, y);
	}-*/;
	
}
