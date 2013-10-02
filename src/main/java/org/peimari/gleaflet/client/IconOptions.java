package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class IconOptions extends JavaScriptObject {
	
	protected IconOptions() {}
	
	public static native IconOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setIconUrl(String url) 
	/*-{
		this.iconUrl = url;
	}-*/;

	public native final void setIconAnchor(Point anchor) 
	/*-{
		this.iconAnchor = anchor;
	}-*/;

	public native final void setIconSize(Point size) 
	/*-{
		this.iconSize = size;
	}-*/;

}
