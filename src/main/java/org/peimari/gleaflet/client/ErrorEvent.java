package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author mstahv
 */
public class ErrorEvent extends JavaScriptObject {

	protected ErrorEvent() {}
	
	public native final String geMessage()
	/*-{
		return this.message;
	}-*/;

    public native final int getCode()
	/*-{
		return this.code;
	}-*/;

}
