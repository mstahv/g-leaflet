package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class ImageOverlayOptions extends JavaScriptObject {
	
	protected ImageOverlayOptions() {}
	
	public static native ImageOverlayOptions create()
    /*-{
        return {};
    }-*/;

	public native final void setOpacity(double opacity)
	/*-{
		this.opacity = opacity;
	}-*/;

	public native final void setAlt(String alt)
	/*-{
		this.alt = alt;
	}-*/;

	public native final void setInteractive(boolean interactive)
	/*-{
		this.interactive = interactive;
	}-*/;

	public native final void setZIndex(int zIndex)
	/*-{
		this.zIndex = zIndex;
	}-*/;
    
	public native final void setAttribution(String attribution)
	/*-{
		this.attribution = attribution;
	}-*/;

}
