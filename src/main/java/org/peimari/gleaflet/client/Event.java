package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Event extends JavaScriptObject {
	
	protected Event() {}
	
	public native final String getType() 
	/*-{
		return this.type;
	}-*/;

	public native final JavaScriptObject getTarget() 
	/*-{
		return this.target;
	}-*/;
}
