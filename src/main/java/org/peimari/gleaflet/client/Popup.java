package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class Popup extends DivOverlay {

    protected Popup() {
    }

    public static native Popup create(PopupOptions options) /*-{
     return $wnd.L.popup(options);
     }-*/;

    public static native Popup create() /*-{
     return $wnd.L.popup();
     }-*/;

    public native final Popup openOn(Map map) /*-{
     return this.openOn(map);
     }-*/;

    /**
     *
     * @param listener
     * @return handler registration
     * @deprecated use LayerRemovedListener instead
     */
    public native final JavaScriptObject addCloseListener(
            PopupClosedListener listener) /*-{
     var fn = $entry(function(e) {
     	listener.@org.peimari.gleaflet.client.PopupClosedListener::onClosed(Lorg/peimari/gleaflet/client/Event;)(e);
     });
     fn.prototype['gname'] = "remove";
     this.on(fn.prototype['gname'], fn);
     return fn;
     }-*/;
    
    public native final Element getContentNode() 
    /*-{
        return this._contentNode;
    }-*/;

}
