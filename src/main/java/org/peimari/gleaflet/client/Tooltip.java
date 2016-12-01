package org.peimari.gleaflet.client;

public class Tooltip extends DivOverlay {

    protected Tooltip() {
    }

    public static native Tooltip create(TooltipOptions options)
    /*-{
        return $wnd.L.tooltip(options);
    }-*/;

}
