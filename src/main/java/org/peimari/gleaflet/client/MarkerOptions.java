package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class MarkerOptions extends JavaScriptObject {
	
	protected MarkerOptions() {}
	
	public static native MarkerOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setOpacity(double opacity) 
	/*-{
		this.opacity = opacity;
	}-*/;

	public native final void setTitle(String title) 
	/*-{
		this.title = title;
	}-*/;

	public native final void setIcon(AnyIcon icon) 
	/*-{
		this.icon = icon;
	}-*/;

	public native final void setDraggable(boolean draggable) 
	/*-{
		this.draggable = draggable;
	}-*/;

}
