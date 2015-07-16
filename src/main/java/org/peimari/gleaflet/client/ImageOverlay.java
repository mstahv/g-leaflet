package org.peimari.gleaflet.client;

public class ImageOverlay extends Layer {

    protected ImageOverlay() {
    }

    public static native ImageOverlay create(String imageUrl, LatLngBounds bounds,
            ImageOverlayOptions circleMarkerOptions) 
    /*-{
            return new $wnd.L.ImageOverlay(imageUrl, bounds, circleMarkerOptions);
    }-*/;

}
