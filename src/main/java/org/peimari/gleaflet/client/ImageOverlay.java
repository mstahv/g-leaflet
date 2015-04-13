package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class ImageOverlay extends JavaScriptObject implements ILayer {

    protected ImageOverlay() {
    }

    public static native ImageOverlay create(String imageUrl, LatLngBounds bounds,
            ImageOverlayOptions circleMarkerOptions) 
    /*-{
            return new $wnd.L.ImageOverlay(imageUrl, bounds, circleMarkerOptions);
    }-*/;

}
