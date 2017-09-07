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

        public native final void addClickListener(ClickListener listener) 
	/*-{
		this.on("click", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.ClickListener::onClick(Lorg/peimari/gleaflet/client/MouseEvent;)(e);
		}));
	}-*/;

        	public native final void removeClickListener() 
	/*-{
		this.off("click");
	}-*/;

	public native final void removeMouseOverListener()
	/*-{
		this.off("mouseover");
	}-*/;

	public native final void addMouseOverListener(MouseOverListener listener)
	/*-{
		this.on("mouseover", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.MouseOverListener::onMouseOver(Lorg/peimari/gleaflet/client/MouseEvent;)(e);
		}));
	}-*/;

	public native final void removeMouseOutListener()
	/*-{
		this.off("mouseout");
	}-*/;

	public native final void addMouseOutListener(MouseOutListener listener)
	/*-{
		this.on("mouseout", $entry(function(e) {
				listener.@org.peimari.gleaflet.client.MouseOutListener::onMouseOut(Lorg/peimari/gleaflet/client/MouseEvent;)(e);
		}));
	}-*/;
	
	public native final void removeContextMenuListener()
	/*-{
		this.off("contextmenu");
	}-*/;

	public native final void addContextMenuListener(ContextMenuListener listener)
	/*-{
		this.on("contextmenu", $entry(function(e) {
			listener.@org.peimari.gleaflet.client.ContextMenuListener::onContextMenu(Lorg/peimari/gleaflet/client/MouseEvent;)(e);
		}));
	}-*/;
}
