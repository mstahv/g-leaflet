package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class PopupOptions extends JavaScriptObject {
	
	protected PopupOptions() {}
	
	public static native PopupOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setMaxWidth(int maxWidth) 
	/*-{
		this.maxWidth = maxWidth;
	}-*/;

	public native final void setMinWidth(int minWidth) 
	/*-{
		this.minWidth = minWidth;
	}-*/;

	public native final void setCloseButton(boolean closeButton) 
	/*-{
		this.closeButton = closeButton;
	}-*/;

	public native final void setAutoPan(boolean autoPan) 
	/*-{
		this.autoPan = autoPan;
	}-*/;

	public native final void setOffset(Point offset) 
	/*-{
		this.offset = offset;
		
	}-*/;

	public native final void setZoomAnimation(boolean zoomAnimation) 
	/*-{
		this.zoomAnimation = zoomAnimation;
	}-*/;

	public  native final void setAutoPanPadding(Point autoPanPadding) 
	/*-{
		this.autoPanPadding = autoPanPadding; 
	}-*/;

}
