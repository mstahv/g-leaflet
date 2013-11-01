package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class PathOptions extends JavaScriptObject {
	
	protected PathOptions() {}
	
	public static native PathOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setOpacity(Double opacity) 
	/*-{
		this.opacity = opacity;
	}-*/;

	public native final void setTitle(String title) 
	/*-{
		this.title = title;
	}-*/;

	public native final void setColor(String color) 
	/*-{
		this.color = color;
	}-*/;
	
	public native final void setFillColor(String fillColor) 
	/*-{
		this.fillColor = fillColor;
	}-*/;

	public native final void setFill(boolean fill) 
	/*-{
		this.fill = fill;
	}-*/;


}
