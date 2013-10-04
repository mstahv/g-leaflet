package org.peimari.gleaflet.client.control;

import org.peimari.gleaflet.client.DivIcon;
import org.peimari.gleaflet.client.Icon;

import com.google.gwt.core.client.JavaScriptObject;

public class ScaleOptions extends JavaScriptObject {
	
	protected ScaleOptions() {}
	
	public static native ScaleOptions create() 
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

	public native final void setIcon(DivIcon icon) 
	/*-{
		this.icon = icon;
	}-*/;

	public native final void setIcon(Icon icon) 
	/*-{
		this.icon = icon;
	}-*/;

}
