package org.peimari.gleaflet.client;

public class DivOverlay extends Layer {

    protected DivOverlay() {
    }

    public native final DivOverlay setContent(String htmlContent)
    /*-{
        return this.setContent(htmlContent);
    }-*/;

    public native final DivOverlay setLatLng(LatLng ll)
    /*-{
        return this.setLatLng(ll);
    }-*/;

    public native final DivOverlay update()
    /*-{
        return this.update();
    }-*/;

    public native final DivOverlay addTo(Map map)
    /*-{
        return this.addTo(map);
    }-*/;
}
