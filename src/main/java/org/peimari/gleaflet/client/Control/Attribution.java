package org.peimari.gleaflet.client.Control;

import com.google.gwt.core.client.JavaScriptObject;

public class Attribution extends JavaScriptObject {
	
	protected Attribution() {}
	
	public static native Attribution create() 
	/*-{
		return new $wnd.L.Control.Attribution();
	}-*/;

	public native final void setPrefix(String attributionPrefix) 
	/*-{
		this.setPrefix(attributionPrefix);
	}-*/;

}
