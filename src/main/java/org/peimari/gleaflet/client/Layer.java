package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Layer extends JavaScriptObject {
   
    protected Layer() {};
    
    /**
     *
     * @param listener the listener
     * @return handler registration
     */
    public native final JavaScriptObject addLayerRemovedListener(
            LayerRemovedListener listener) /*-{
     var fn = $entry(function(e) {
     	listener.@org.peimari.gleaflet.client.LayerRemovedListener::onRemoved(Lorg/peimari/gleaflet/client/Event;)(e);
     });
     fn.prototype['gname'] = "remove";
     this.on(fn.prototype['gname'], fn);
     return fn;
     }-*/;

    
    /**
	 * Removes listener from layer. The listener is detected on listener
	 * registration object returned by listener addition method.
	 * 
	 * @param listenerRegistration
	 *            the object returned by listener addition method
	 */
	public native final void removeListener(
			JavaScriptObject listenerRegistration)
	/*-{
		this.off(listenerRegistration.prototype.gname, listenerRegistration);
	}-*/;

}
