package org.peimari.gleaflet.client.control;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class Control extends JavaScriptObject {
	
	protected Control() {}
	
	public native final void setPosition(String position) 
	/*-{
		this.setPosition(position);
	}-*/;

}
