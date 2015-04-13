package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class ImageOverlayOptions extends JavaScriptObject {
	
	protected ImageOverlayOptions() {}
	
	public static native ImageOverlayOptions create()
    /*-{
        return {};
    }-*/;

	public native final void setOpacity(Double opacity)
	/*-{
		this.opacity = opacity;
	}-*/;
    
	public native final void setAttribution(String attribution)
	/*-{
		this.attribution = attribution;
	}-*/;

}
