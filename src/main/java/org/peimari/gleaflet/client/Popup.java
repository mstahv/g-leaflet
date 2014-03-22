package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Popup extends JavaScriptObject {

    protected Popup() {
    }

    public static native Popup create(PopupOptions options) /*-{
     return $wnd.L.popup(options);
     }-*/;

    public static native Popup create() /*-{
     return $wnd.L.popup();
     }-*/;

    public native final Popup setContent(String htmlContent) /*-{
     return this.setContent(htmlContent);
     }-*/;

    public native final Popup openOn(Map map) /*-{
     return this.openOn(map);
     }-*/;

    public native final Popup addTo(Map map) /*-{
     return this.addTo(map);
     }-*/;

    public native final Popup setLatLng(LatLng ll) /*-{
     return this.setLatLng(ll);
     }-*/;

    public native final Popup update() /*-{
     return this.update();
     }-*/;

    /**
     *
     * @param listener
     * @return handler registration
     */
    public native final JavaScriptObject addCloseListener(
            PopupClosedListener listener) /*-{
     var fn = function(e) {
     $entry(listener.@org.peimari.gleaflet.client.PopupClosedListener::onClosed(Lorg/peimari/gleaflet/client/Event;)(e));
     }
     fn.prototype['gname'] = "close";
     this.on(fn.prototype['gname'], fn);
     return fn;
     }-*/;

    /**
     * Removes listener. The listener is detected on listener
     * registration object returned by listener addition method.
     *
     * @param listenerRegistration the object returned by listener addition
     * method
     */
    public native final void removeListener(
            JavaScriptObject listenerRegistration) /*-{
     this.off(listenerRegistration.prototype.gname, listenerRegistration);
     }-*/;

}
